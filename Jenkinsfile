pipeline {
    agent any

    triggers {
        // Déclenchement du pipeline à chaque push dans le référentiel Git
        pollSCM('H/5 * * * *') // Vérifie les changements toutes les 5 minutes
    }

    stages {
        stage('Récupération du code source') {
            steps {

                git branch: 'Oumaima_Najar_5SAE5', url: 'https://github.com/RaniaBs21/Projet_Devops.git'
            }
        }

        stage('Afficher la date système') {
            steps {
                script {
                    // Affiche la date système
                    def date = new Date()
                    echo "Date système: ${date.format('yyyy-MM-dd HH:mm:ss')}"
                }
            }
        }
    }
}
