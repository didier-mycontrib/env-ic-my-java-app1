package com.mycompany.app1;

import java.util.Scanner;

/**
 * App 1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculateur (mode texte)" );
        App objApp = new App();
        objApp.interactive_calcul();
    }
    
    private Calculateur calc = new Calculateur();
    Scanner reader = new Scanner(System.in);
    
    public void interactive_calcul(){
      double x,y,resAdd,resMult;
      System.out.print("\nx: "); x = reader.nextDouble();
      System.out.print("\ny: "); y = reader.nextDouble();
      resAdd = calc.add(x,y);
      resMult = calc.mult(x,y);
      System.out.println(x+" + "+y+" = "+resAdd);
      System.out.println(x+" * "+y+" = "+resMult);
      }
}
