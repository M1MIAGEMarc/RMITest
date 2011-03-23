/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Propriétaire
 */
public class Serveur extends UnicastRemoteObject implements Echo{

  public Serveur() throws RemoteException{
    super();
  }

  @Override
  public String echo(String msg) throws RemoteException {
    return msg.toUpperCase();
  }

}
