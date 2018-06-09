package br.com.casadocodigo.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	public Autor(Integer id) {
		this.id = id;		
	}
	public Autor() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + "]";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
