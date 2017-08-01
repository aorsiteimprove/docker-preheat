// archive artifact?

pipeline {
	agent {
		label "ubuntu16"
	}
	stages {
		stage('build') {
			steps {
	 			sh './mvnw clean package'
			}
		}
		stage('test') {
			steps {
	 			sh './mvnw clean test'
			}
		}
	}
}
