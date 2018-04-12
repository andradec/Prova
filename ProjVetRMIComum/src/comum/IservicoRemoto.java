package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IservicoRemoto extends Remote {
	
	void sendVet(Veterinario vet) throws RemoteException;
	List<Veterinario> retrieveVeterinario() throws RemoteException;
}
