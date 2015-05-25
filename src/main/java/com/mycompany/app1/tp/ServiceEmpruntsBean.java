package com.mycompany.app1.tp;

public class ServiceEmpruntsBean implements ServiceEmprunts {
    
	//sous composants (avec get/set pour injections/liaisons)
	private CalculateurFinancier calculateurFinancier;
	private ServiceTauxCourants serviceTauxCourants;
	
	public ServiceEmpruntsBean(){
		//default constructor
	}


	@Override
	public double mensualiteConstanteAvecTauxCourant(double montant, int nbMois) {
        double mensualite=0;	
        if(serviceTauxCourants==null){
        	throw new RuntimeException("le sous composant serviceTauxCourants n'est pas initialise dans ServiceEmpruntsBean");
        }
		double tauxMensPctCourant = serviceTauxCourants.tauxMensPctCourant(nbMois);
		if(calculateurFinancier==null){
        	//throw new RuntimeException("le sous composant calculateurFinancier n'est pas initialise dans ServiceEmpruntsBean");
			calculateurFinancier = new CalculateurFinancierBean();
		}
		mensualite = calculateurFinancier.mensualiteConstante(montant, nbMois, tauxMensPctCourant);
		return mensualite;
	}
	

	public CalculateurFinancier getCalculateurFinancier() {
		return calculateurFinancier;
	}

	public void setCalculateurFinancier(CalculateurFinancier calculateurFinancier) {
		this.calculateurFinancier = calculateurFinancier;
	}

	public ServiceTauxCourants getServiceTauxCourants() {
		return serviceTauxCourants;
	}


	public void setServiceTauxCourants(ServiceTauxCourants serviceTauxCourants) {
		this.serviceTauxCourants = serviceTauxCourants;
	}


}
