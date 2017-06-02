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
    }];
    return this.prompt(prompts).then(props => {
      // To access props later use this.props.someAnswer;
      Object.assign(this.props, props);
    });
  }

  writing() {
    this.fs.copyTpl(
      this.templatePath('src/main/java/**'),
      this.destinationPath(this.props.artifactId + '/src/main/java/' + this.props.groupId.replace('/./g', '/')),
      this.props
    );
    this.fs.copyTpl(
      this.templatePath('src/main/resources/**'),
      this.destinationPath(this.props.artifactId + '/src/main/resources'),
      this.props
    );
    this.fs.copyTpl(
      this.templatePath('src/test/java/**'),
      this.destinationPath(this.props.artifactId + '/src/test/java/' + this.props.groupId.replace('/./g', '/')),
      this.props
    );
    this.fs.copyTpl(
      this.templatePath('*'),
      this.destinationPath(this.props.artifactId),
      this.props
    );
  }

  install() {
  //  Do nothing
  }
};
