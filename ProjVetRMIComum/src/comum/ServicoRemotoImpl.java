package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IservicoRemoto {

	public ServicoRemotoImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public void sendVet(Veterinario vet) throws RemoteException {
		Veterinario.setLstVeterinario(vet);
	}

	@Override
	public List<Veterinario> retrieveVeterinario() throws RemoteException {
		return Veterinario.getLstVeterinario();
	}

}
