pipeline {
    agent any

    stages {

        stage('Get from Git') {
            steps {
                git 'https://github.com/Vimannagar/ATTBDDCucumberBasics.git'
                }
        }

        stage('Executing with chrome') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Chrome"
            }

                    post
        {
        always {
        emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/amazonreports.html', body: '''$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS - Chrome Browser:

<p>Check console output at $BUILD_URL to view the results.<br> This is an automated email please check with Automation team<br> Thanks ''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'gouravatttest@gmail.com'

        }
        }
        }

        stage('Executing with firefox') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Firefox"
            }

                  post
        {
        always {
        emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/amazonreports.html', body: '''$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS - Firefox Browser:

<p>Check console output at $BUILD_URL to view the results.<br> This is an automated email please check with Automation team<br> Thanks ''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'gouravatttest@gmail.com'

        }
        }  
        }

        }

}
