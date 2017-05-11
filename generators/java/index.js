'use strict';
const Generator = require('yeoman-generator');
const chalk = require('chalk');
const yosay = require('yosay');

module.exports = class extends Generator {
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
      this.props = props;
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
