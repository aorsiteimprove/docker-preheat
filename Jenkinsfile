pipeline {
	agent {
		label "docker-preheat"
	}
	// deleteDir()
	stages {
		stage('preheat') {
			steps {
	 			sh 'docker build -t "apachee:1.0.0" .'
			}
		}
	}
}
