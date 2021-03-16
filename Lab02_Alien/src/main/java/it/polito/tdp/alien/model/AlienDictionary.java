package it.polito.tdp.alien.model;

import java.util.*;

public class AlienDictionary {
	
	List <WordEnanched> parole;

	public AlienDictionary() {
		this.parole = new LinkedList<WordEnanched>();
	}
	

	public void addWord(String alienWord, String translation) {
		for(WordEnanched w: parole)
		{
			if(w.getAlienWord().equals(alienWord)) {
				w.aggiungiTranslation(translation);
				return;
			}
		}
		WordEnanched word = new WordEnanched(alienWord, translation);
		parole.add(word);
	}
	
	public String translateWord(String alienWord) {
		String trad= "Nessuna traduzione";
		
		for(WordEnanched w: parole) {
			if(w.getAlienWord().equals(alienWord))
				trad = w.ottieniTranslation();
		}
		return trad;
	}


	public void reset() {
		parole.clear();	
	}
}
