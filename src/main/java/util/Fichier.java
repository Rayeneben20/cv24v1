package util;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Fichier {
	public String loadFileXML() {
		try {
			org.springframework.core.io.Resource
            // Initialisation de resource avec le fichier smallCV.xml
            resource = new DefaultResourceLoader().getResource("smallCV.xml");

            // Ouverture du flux d'entrée pour lire le contenu du fichier
            InputStream inputStream = resource.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // Lecture du contenu du fichier ligne par ligne
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Fermeture du flux
            reader.close();

            // Retourner le contenu du fichier au format String
            return content.toString();
        } catch (IOException e) {
            // En cas d'erreur, retourner un message d'erreur
            return "Erreur lors de la lecture du fichier : " + e.getMessage();
        }
	}

}
