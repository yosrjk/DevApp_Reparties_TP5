package rmiService;

import java.rmi.Remote;

public interface IConversion extends Remote {
    double convertirMontant(double mt);
}
