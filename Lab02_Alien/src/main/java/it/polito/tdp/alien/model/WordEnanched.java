package it.polito.tdp.alien.model;

import java.util.*;

public class WordEnanched {
	
	private String alienWord;
	private List <String> translation;
	
	public WordEnanched(String alienWord, String trad) {
		this.alienWord = alienWord;
		translation = new LinkedList();
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
	
	

}
