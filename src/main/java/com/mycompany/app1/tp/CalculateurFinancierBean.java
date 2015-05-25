package com.mycompany.app1.tp;

public class CalculateurFinancierBean implements CalculateurFinancier {

	@Override
	public double mensualiteConstante(double montant, int nbMois,
			double tauxMensPct) {
		double mensualite = 0;
		double tauxMens = tauxMensPct / 100; 
		
		//formule mathematique:
		mensualite = montant * tauxMens / (1 - Math.pow(1.0 + tauxMens,-nbMois));
		
		//System.out.println("montant="+montant+",nbMois="+nbMois+",tauxMensuelPct="+tauxMensPct + "mensualite=" + mensualite);
		
		return mensualite;
	}

	@Override
	public double montantGlobalInterets(double montant, int nbMois,
			double tauxMensPct) {
		double mensualiteConstante = mensualiteConstante(montant,nbMois,tauxMensPct);
		return ((mensualiteConstante * nbMois) - montant);
	}

}
