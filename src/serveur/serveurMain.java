/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serveur;

import java.rmi.Naming;

/**
 *
 * @author Propriétaire
 */
public class serveurMain {

  public static void main(String[] args) throws Exception{
    Serveur serveur = new Serveur();
    Naming.bind("Serveur", serveur);
    System.out.println("Serveur en cours de fonctionnement");
  }
}
