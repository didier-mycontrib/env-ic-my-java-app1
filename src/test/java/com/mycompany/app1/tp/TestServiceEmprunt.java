package com.mycompany.app1.tp;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mycompany.app1.matcher.MyIntegerBetween;

public class TestServiceEmprunt {
	
	private static Logger logger = LoggerFactory.getLogger(TestServiceEmprunt.class);
	
	private ServiceEmprunts serviceEmprunts; //à tester
	private ServiceTauxCourants serviceTauxCourants ; //sous composant
	                                         //ou doublure/mock
	
	@Before
	public void initTestServiceEmprunt(){
		//créer l'instance du service à tester:
		
		//créer une doublure (en mode "mock") du sous composant "ServiceTauxCourants":		
		//Rappel : sémantiquement mock = "stub + spy"
		//         pragmatiquement pas de différence notable entre Mockito.mock() et Mockito.spy() en partant d'une interface
		//         car si pas de code d'implémentation ---> toujours comportement "mock=stub+spy" .
		//         si par contre Mockito.spy() est appelé en partant d'une réelle instance de composant
		//         alors spy --> espionnage seulement pour ultérieur "verify" sans changer comportement de l'application
		//         et   mock (= stub + spy)--> verify possible ET implementation de départ écrasée par Mockito.when().then...
		
		
		//relier le sous composant (ici la doublure gérée par Mockito) au service à tester:
		//((ServiceEmpruntsBean)serviceEmprunts).setServiceTauxCourants(serviceTauxCourants);
	}
	
	@Test
	public void testMensualiteConstanteAvecTauxCourant(){
		//1. paramétrer le comportement de la doublure du sous composant géré par Mockito:
		//retourner 0.1 si nbMois=120:
		//........

		//ou bien retourner 0.1 si nbMois entre 97 et 10000 (Mockito.intThat(new MyIntegerBetween(97,1000)):
		
		//2. appeler la méthode à tester:
		//double mensualite = serviceEmprunts.mensualiteConstanteAvecTauxCourant(20000.0, 120);
		//3. vérifier la valeur de retour via une assertion JUnit:
		//Assert.assertTrue(mensualite > 20000.0 / 120 ); //ou assertion plus précise
		
		//4. (avec verify / seconde phase du tp) , vérifier les sous appels effectués
		// du composant "ServiceEmprunts" vers le sous composant "ServiceTauxCourants".
		//vérifier que la méthode tauxMensPctCourant() a été appelée avec nbMois=120
		//.....
		//vérifier que la méthode tauxMensPctCourant() a été appelée exactement une seule fois
		//....
	}	
	
	@Test
	public void testMensualiteConstanteAvecException(){
		//1. paramétrer le comportement de la doublure du sous composant géré par Mockito:
		//   remonter l'exception IllegalArgumentException("nbMois doit etre supérieur à 0") si nbMois est négatif (ex: -10)
		//Mockito.when(.....).thenThrow(....);
		
		
		//2. appeler la méthode à tester avec nbMois=-10
		double mensualite;
		try {
			//mensualite = ......
			//Assert.fail("une exception aurait normalement dûe être remontée et progagée");
		} catch (Exception e) {
			logger.trace("exception bien remontee:" + e.getMessage());
			//3. vérifier le type d'exception remontée:
			// .........		
		}
				
	}

	
}
