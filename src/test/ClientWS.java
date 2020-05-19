package test;

import java.rmi.RemoteException;

import ws.BanqueServiceProxy;
import ws.Compte;
/*
 * AXIS
 */
public class ClientWS {

	public static void main(String[] args) throws RemoteException {
		BanqueServiceProxy stub = new BanqueServiceProxy();
		System.out.println(stub.conversionEuroToDH(34));
		
		Compte compte = stub.getCompte(3);
		System.out.println("Code = "+compte.getCode() +
				"\nSolde= "+ compte.getSolde());
		
		Compte[] comptes = stub.listComptes();
		System.out.println("---------------------");
		for (Compte cp: comptes) {
			System.out.println("Code = "+cp.getCode() +
					"\nSolde= "+ cp.getSolde());
		}
	}

}
