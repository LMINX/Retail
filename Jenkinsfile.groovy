#!/usr/bin/env groovy
pipeline
{
stage('Stage 1') {
    steps {
        echo "hello world"
    }
}

stage('Stage 2') {
    steps {
        ansiblePlaybook installation: 'ansible-playbook', playbook: '/etc/ansible/playbook.yaml', sudoUser: null
    }
}

}