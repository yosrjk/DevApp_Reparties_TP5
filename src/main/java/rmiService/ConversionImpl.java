package rmiService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * Implémentation de l'interface distante IConversion.
 * Cette classe étend UnicastRemoteObject pour faciliter la communication à distance.
 */
public class ConversionImpl extends UnicastRemoteObject implements IConversion {
    /**
     * Constructeur par défaut de la classe ConversionImpl.
     *
     * @throws RemoteException Si une exception liée à la communication se produit lors de la création de l'objet distant.
     */
    public ConversionImpl() throws RemoteException {
        super();
    }
    /**
     * Implémentation de la méthode de conversion de montant.
     *
     * @param mt Le montant à convertir.
     * @return Le montant converti (dans cet exemple, le montant est multiplié par 3).
     * @throws RemoteException Si une exception liée à la communication se produit pendant l'invocation distante de la méthode.
     */
    @Override
    public double convertirMontant(double mt) throws RemoteException {
        return mt * 3; // Exemple de logique de conversion : multiplier le montant par 3.
    }
}
