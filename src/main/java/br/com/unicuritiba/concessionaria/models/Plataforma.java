package br.com.unicuritiba.concessionaria.models;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Plataforma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	@OneToMany(mappedBy = "plataforma")
	private ArrayList<Modelo> modelos;
	
	public Plataforma(String nome) {
		super();
		this.nome = nome;
		this.modelos = new ArrayList<>();
	}
	
	public Plataforma(String nome, ArrayList<Modelo> modelos) {
		super();
		this.nome = nome;
		this.modelos = modelos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(ArrayList<Modelo> modelos) {
		this.modelos = modelos;
	}
}
