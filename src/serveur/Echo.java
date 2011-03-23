/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Propriétaire
 */
public interface Echo extends Remote{

  public String echo(String msg) throws RemoteException;
}
