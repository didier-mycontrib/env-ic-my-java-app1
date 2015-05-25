package com.mycompany.app1.tp;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCalculateurFinancier {
	
	private static Logger logger = LoggerFactory.getLogger(TestCalculateurFinancier.class);
	//private static ....... //chose à tester
	
	//méthode d'initialisation à écrire
	
	//annotation qui va bien
	public void testMensualiteConstante(){
		double mensualite = 0; 
		// appel de méthode qui va bien ;
		logger.trace("mensualite="+mensualite + " avec instance de test= " + this);
		//assertion qui va bien
	}
	
	//annotation qui va bien
	public void testMontantGlobalInterets(){
		double montantTotalInterets = 0;
		// appel de méthode qui va bien ;
		logger.trace("montantTotalInterets="+montantTotalInterets + " avec instance de test= " + this);
		//assertion qui va bien
	}

}
