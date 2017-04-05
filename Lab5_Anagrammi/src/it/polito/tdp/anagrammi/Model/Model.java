package it.polito.tdp.anagrammi.Model;

import java.util.*;

public class Model {
	
	char  caratteri[] ;
	List<String> anagrammi = new LinkedList<String>();
	
	
	public void calcola(String text) {
		caratteri = text.toCharArray() ;
		ricorsione(caratteri,0,"");
	}


	private void ricorsione(char[] caratteri, int livello, String s) {
		if(livello==caratteri.length)
			anagrammi.add(s);
		for(char c : caratteri){
		
		}
	}

}
