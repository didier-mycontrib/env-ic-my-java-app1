package com.mycompany.app1.tp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceTauxCourantsBean  implements ServiceTauxCourants{
	
	//private static Logger logger = LoggerFactory.getLogger(ServiceTauxCourantsBean.class);
	
	private static Properties loadProperties(String propertiesFileName){
		Properties props  = new Properties();
		try {
			InputStream is =Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFileName);
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

	@Override
	public double tauxMensPctCourant(int nbMois) {
		double tauxMensPct = 0;
		// code reel du composant necessitant un accès à une base de données ou bien un fichier de valeurs
		
		//ici (en tp) : recuperation de valeurs dans un fichier "tauxCourants.properties":
		
		Properties props = loadProperties("tauxCourants.properties");
		if(nbMois <=0 )
			throw new RuntimeException("nbMois doit etre supérieur à 0");
		/*else**/
		if(nbMois >  0 && nbMois <= 12)
			tauxMensPct = Double.parseDouble(props.getProperty("1-12mois.tauxCourant"));
		else if(nbMois > 12  && nbMois <= 24)
				tauxMensPct = Double.parseDouble(props.getProperty("13-24mois.tauxCourant"));
		else if(nbMois >  24   &&  nbMois <= 48)
			tauxMensPct = Double.parseDouble(props.getProperty("25-48mois.tauxCourant"));			
		else if(nbMois >  48   && nbMois <= 96)
			tauxMensPct = Double.parseDouble(props.getProperty("49-96mois.tauxCourant"));
		else if(nbMois > 96)
			tauxMensPct = Double.parseDouble(props.getProperty("97moisOuPlus.tauxCourant"));
	
		return tauxMensPct;
	}

	@Override
	public double fraisDossier(double montant) {
			return montant / 500;
	}

}
