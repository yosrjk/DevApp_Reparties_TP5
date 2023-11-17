package rmiServer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Classe principale du serveur RMI.
 */
public class ConversionServer {
    public static void main(String[] args) {
        try {
            // Création d'un objet de la classe ConversionImpl
            rmiService.IConversion conversionService = new rmiService.ConversionImpl();

            // Création du registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrement de l'objet dans le registre RMI avec un nom associé
            registry.rebind("conversionService", conversionService);

            System.out.println("Serveur RMI prêt !");
        } catch (RemoteException e) {
            // Gestion des exceptions liées à la communication distante
            System.err.println("Erreur du serveur : " + e.toString());
            e.printStackTrace();
        }
    }
}
