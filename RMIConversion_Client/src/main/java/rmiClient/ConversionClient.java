package rmiClient;
import rmiService.IConversion;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
 // Classe client pour tester la conversion de montant à distance via RMI.
public class ConversionClient {
    public static void main(String[]args){
        // Initialisation de l'objet distant à null
        IConversion conversionService = null;
        try {
            // Recherche de l'objet distant dans le Registre RMI à l'aide de son nom
            conversionService = (IConversion) Naming.lookup("rmi://localhost:1099/conversionService");
        } catch (NotBoundException e) {
            // Gestion de l'exception si l'objet distant n'est pas trouvé dans le Registre RMI
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            // Gestion de l'exception si l'URL RMI est mal formée
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            // Gestion de l'exception liée à la communication distante
            throw new RuntimeException(e);
        }
        // Appel de la méthode distante pour convertir un montant
        double result = conversionService.convertirMontant(100.0);
        // Affichage du résultat de la conversion
        System.out.println("Résultat de la conversion : " + result);
    }
}
