package servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import comum.ServicoRemotoImpl;


public class Servico {
	
	public void VetServer() throws RemoteException{
		try {
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/chat", new ServicoRemotoImpl());
			System.out.println("Iniciando....");
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		new ServicoRemotoImpl();
	}

}
