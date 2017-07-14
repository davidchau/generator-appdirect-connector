'use strict';
const Generator = require('yeoman-generator');
const chalk = require('chalk');
const yosay = require('yosay');
const request = require('request');

module.exports = class extends Generator {
  initializing() {
    this.props = {};
    const options = {
      url: 'https://api.github.com/repos/AppDirect/service-integration-sdk/tags',
      headers: {
        'User-Agent': 'generator-appdirect-connector'
      }
    };

    request(options, function(error, response, body) {
      this.props.sdkVersion = JSON.parse(body)
        .map(function(tag) {
          return tag.name;
        })
        .filter(function (tagName) {
          return !tagName.startsWith('v');
        })[0];
    }.bind(this));
  }

  prompting() {
    // Have Yeoman greet the user.
    this.log(yosay(
      'Welcome to the primo ' + chalk.red('generator-appdirect-connector') + ' generator!'
    ));

    const prompts = [{
      type: 'input',
      name: 'groupId',
      message: 'Define your project groupId'
    }, {
      type: 'input',
      name: 'artifactId',
      message: 'Define your project artifactId'
    }, {
      type: 'confirm',
      name: 'docker',
      message: 'Would you like to use Docker?',
      default: false
    }, {
      type: 'confirm',
      name: 'mysqlAndFlyway',
      message: 'Would you like to use Mysql and Flyway?',
      default: false
    }];
    return this.prompt(prompts).then(props => {
      // To access props later use this.props.someAnswer;
      Object.assign(this.props, props);
    });
  }

  writing() {                     
  //equal files for all versions
    this.fs.copyTpl(
      this.templatePath('base/src/main/java/**'),
      this.destinationPath(this.props.artifactId + '/src/main/java/' + this.props.groupId.replace('/./g', '/')),
      this.props
    );
    this.fs.copyTpl(
      this.templatePath('base/src/test/java/**'),
      this.destinationPath(this.props.artifactId + '/src/test/java/' + this.props.groupId.replace('/./g', '/')),
      this.props
    );
    this.fs.copyTpl(
      this.templatePath('.gitignoreTemplate'),
      this.destinationPath(this.props.artifactId + '/.gitignore'),
      this.props
    );
    var root = 'base/*';
    var yml = 'base/src/main/resources/**';
    if(this.props.docker){
      this.fs.copyTpl(  //entrypoint
        this.templatePath('both/src/main/bash/entrypoint.sh'),
        this.destinationPath(this.props.artifactId + '/src/main/bash/entrypoint.sh'),
        this.props
      );
      if(this.props.mysqlAndFlyway){
        root = 'both/*';
        yml = 'both/src/main/resources/**';
      } else {
        root = 'docker/*';
      }
    } else {
      if(this.props.mysqlAndFlyway){
        root = 'mysqlAndFlyway/*';
        yml = 'mysqlAndFlyway/src/main/resources/**';
      }
    }
    this.fs.copyTpl(            //root
      this.templatePath(root),
      this.destinationPath(this.props.artifactId),
      this.props
    );
    this.fs.copyTpl(            //yml
      this.templatePath(yml),
      this.destinationPath(this.props.artifactId + '/src/main/resources'),
      this.props
    );
  }


  install() {
  //  Do nothing
  }
};
