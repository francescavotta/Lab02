package it.polito.tdp.alien.model;

import java.util.*;

public class AlienDictionary {
	
	List <Word> parole;

	public AlienDictionary() {
		this.parole = new LinkedList<Word>();
	}
	

	public void addWord(String alienWord, String translation) {
		for(Word w: parole)
		{
			if(w.getAlienWord().equals(alienWord)) {
				w.setTranslation(translation);
				return;
			}
		}
		Word word = new Word(alienWord, translation);
		parole.add(word);
	}
	
	public String translateWord(String alienWord) {
		String trad= null;
		for(Word w: parole) {
			if(w.getAlienWord().equals(alienWord))
				trad = w.getTranslation();
		}
		return trad;
	}
}
