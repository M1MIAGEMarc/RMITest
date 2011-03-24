/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.Naming;
import serveur.Echo;

/**
 *
 * @author Propriétaire
 */
public class mainClient {

  public static void main(String[] args) throws Exception{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Echo interEcho = (Echo) Naming.lookup(args[0]);
    String msg = in.readLine();
    String reponse = null;

    while(!msg.equals("fin")){
      reponse = interEcho.echo(in.readLine());
      System.out.println("Réponse serveur : " + reponse);
      System.out.println("Message : ");
      msg = in.readLine();
    }
    System.out.println("Fin!");
  }

}
