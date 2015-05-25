package com.mycompany.app1.tp;

public interface CalculateurFinancier {
	public double mensualiteConstante(double montant,int nbMois,double tauxMensPct);
	public double montantGlobalInterets(double montant,int nbMois,double tauxMensPct);
}
