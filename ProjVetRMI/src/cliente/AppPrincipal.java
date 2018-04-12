package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JOptionPane;

import comum.IservicoRemoto;
import comum.Veterinario;

public class AppPrincipal {
	
	public static void main(String[] args) {
		
		String nome = "";
		String cpf = "";
		
		nome = JOptionPane.showInputDialog("Nome do Veterinario ?");
		
		cpf = JOptionPane.showInputDialog("CPF do Veterinario:");
		
		try {
			IservicoRemoto vetobj = (IservicoRemoto) Naming.lookup("rmi://localhost:8282/chat");
			Veterinario vet = new Veterinario(1, nome, cpf);
			vetobj.sendVet(vet);
			System.out.println(returnVeterinario(vetobj.retrieveVeterinario()));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (RemoteException e) {
			e.printStackTrace();
		}catch(NotBoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static Veterinario returnVeterinario(List<Veterinario> lst) {
		
		for (Veterinario veterinario : lst) {
			System.out.println("ID: " + veterinario.getId());
			System.out.println("Nome: "+ veterinario.getNome());
			System.out.println("CPF: " + veterinario.getCPF());
		}
		
		return null;
		
	}

}
