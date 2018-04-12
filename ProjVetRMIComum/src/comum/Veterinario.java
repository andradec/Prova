package comum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Veterinario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String Nome;
	private String CPF;
	
	private static List<Veterinario> lstVet = new ArrayList<Veterinario>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setLstVeterinario(Veterinario vet) {
		lstVet.add(vet);
	}
	public static List<Veterinario> getLstVeterinario(){
		return lstVet;
	}
	
	public Veterinario(int id, String nome, String cPF) {
		this.id = id;
		Nome = nome;
		CPF = cPF;
	}
	public Veterinario() {
	}
	
	

}
