pipeline {
	agent {
		label "master"
	}
	// deleteDir()
	stages {
		stage('preheat') {
			steps {
	 			sh 'curl -d "script=./getDockerJobs.groovy" https://ci.siteimprove.systems/script'
			}
		}
	}
}
