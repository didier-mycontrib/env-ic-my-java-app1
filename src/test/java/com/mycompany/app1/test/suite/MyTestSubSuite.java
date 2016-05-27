package com.mycompany.app1.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.mycompany.app1.tp.TestCalculateurFinancier;
import com.mycompany.app1.tp.TestServiceTauxCourants;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TestCalculateurFinancier.class,
TestServiceTauxCourants.class
})
public class MyTestSubSuite {

}
