package it.polito.tdp.alien.model;

import java.util.*;

public class WordEnanched {
	
	private String alienWord;
	private List <String> translation;
	
	public WordEnanched(String alienWord, String trad) {
		this.alienWord = alienWord;
		translation = new LinkedList<String>();
		translation.add(trad);
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public List<String> getTranslation() {
		return translation;
	}

	public void setTranslation(List<String> translation) {
		this.translation = translation;
	}

	public void aggiungiTranslation(String translation) {
		if(!this.translation.contains(translation))
		this.translation.add(translation);
	}

	public String ottieniTranslation() {
		String stampa = "";
		for(String s: this.translation)
		{
			stampa += s + "\n";
		}
		
		return stampa;
	}
	

}
