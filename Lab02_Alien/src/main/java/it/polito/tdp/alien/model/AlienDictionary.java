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
		String trad= "";
		if(alienWord.contains("?")) {
			System.out.print("devo fare altro");
			for(WordEnanched w: parole) {

				for(int i=0; i<w.getAlienWord().length();i++)
				{
					if(alienWord.length() != w.getAlienWord().length() &&
							alienWord.charAt(i)!='?' 
							&& alienWord.charAt(i)!=w.getAlienWord().charAt(i))
					{

						trad = "Nessuna traduzione";
					}
				}
				trad +=w.getAlienWord() +" tradotto: "+ w.ottieniTranslation();
			}
		}
		for(WordEnanched w: parole) {
			if(w.getAlienWord().equals(alienWord))
				trad = w.ottieniTranslation();
		}
		if(trad.equals(""))
			trad="Nessuna traduzione";
		return trad;
	}


	public void reset() {
		parole.clear();	
	}
}
