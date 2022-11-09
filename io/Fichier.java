package io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Fichier {

	public static boolean ecrireToutesLesLignes(String cheminFichier, List<String> lignes, Charset encodage) {
		boolean reussite = true;
		Path chemin = Paths.get(cheminFichier);
		if (Files.notExists(chemin)) {
			reussite = new File(cheminFichier.substring(0, cheminFichier.lastIndexOf('/'))).mkdirs();
		}
		if (reussite) {
		    try {
				Files.write(chemin, lignes, encodage);
			} catch (IOException e) {
				e.printStackTrace();
				reussite = false;
			}
		}
	    return reussite;
	}
	
	public static List<String> lireToutesLesLignes(String cheminFichier, Charset encodage) {
		List<String> lignes;
		Path chemin = Paths.get(cheminFichier);
	    try {
	    	lignes = Files.readAllLines(chemin, encodage);
		} catch (IOException e) {
			lignes = new LinkedList<String>();
		}
	    return lignes;
	}
	
}
