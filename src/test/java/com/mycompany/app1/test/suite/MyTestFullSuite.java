package com.mycompany.app1.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.mycompany.app1.tp.TestServiceEmprunt;

//NB: l'ordre des tests est bien pris en compte


@RunWith(Suite.class)
@Suite.SuiteClasses({
/*TestCalculateurFinancier.class,
TestServiceTauxCourants.class*/
MyTestSubSuite.class,
TestServiceEmprunt.class
})
public class MyTestFullSuite {

}

/*
Rappel: par défaut , eclipse lance tous les tests trouvés dans une même branche de package
si on déclenche "run as / Junit test case" depuis un package java.
il vaut mieux donc placer les "TestSuite" dans un package séparé pour ne pas lancer les tests 2 fois.

Rappel: par défaut, maven lance tous les tests unitaires qui ont un nom de classe
en "Test....." ou "....Test" (et pas les "Suite...." ni "....Suite" )

via un lancement de type "mvn test -Dtest=*FullSuite" 
(ou bien via une configuration équivalente au sein d'un profile maven),
on peut lancer une suite de tests bien spécifique.

En mettant en place des variantes de type "FullSuite" ,  "EssentialSuite", ... , on
peut ainsi paramétrer des séquences de tests plus ou moins rapides pour les besoins
de l'intégration continue (test rapide de jour , test sophistiqué la nuit) .


*/