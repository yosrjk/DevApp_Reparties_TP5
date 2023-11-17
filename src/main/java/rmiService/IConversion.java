package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface distante pour la conversion de devises.
 * Cette interface étend l'interface java.rmi.Remote, indiquant qu'elle peut être accédée à distance.
 */
public interface IConversion extends Remote {

    /**
     * Convertit un montant d'une devise à une autre.
     *
     * @param mt Le montant à convertir.
     * @return Le montant converti.
     * @throws RemoteException Si une exception liée à la communication se produit pendant l'invocation distante de la méthode.
     */
    double convertirMontant(double mt) throws RemoteException;
}
