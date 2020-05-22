package model;

import java.util.ArrayList;

public class Cliente {
	
	private Integer id;

	private String nome_cli;

	private String end_cli;

	private String tel_cli;

	private String cep_cli;

	private String email_cli;

	private ArrayList<Animal> animais;

	public Cliente(Integer id, String nome, String endereco, String telefone, String cep, String email) {
		this.id = id;
		this.nome_cli = nome;
		this.end_cli = endereco;
		this.tel_cli = telefone;
		this.cep_cli = cep;
		this.email_cli = email;
		this.animais = new ArrayList<>();
	}
	
	public Cliente(String nome, String endereco, String telefone, String cep, String email) {
		this.nome_cli = nome;
		this.end_cli = endereco;
		this.tel_cli = telefone;
		this.cep_cli = cep;
		this.email_cli = email;
		this.animais = new ArrayList<>();
	}
	
	public Integer getId() {
		return this.id;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public void addAnimais(Animal animal) {
		this.animais.add(animal);
	}
	
	public String getNome_cli() {
		return nome_cli;
	}

	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}

	public String getEnd_cli() {
		return end_cli;
	}

	public void setEnd_cli(String end_cli) {
		this.end_cli = end_cli;
	}

	public String getTel_cli() {
		return tel_cli;
	}

	public void setTel_cli(String tel_cli) {
		this.tel_cli = tel_cli;
	}

	public String getCep_cli() {
		return cep_cli;
	}

	public void setCep_cli(String cep_cli) {
		this.cep_cli = cep_cli;
	}

	public String getEmail_cli() {
		return email_cli;
	}

	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome_cli=" + nome_cli + ", end_cli=" + end_cli + ", tel_cli=" + tel_cli
				+ ", cep_cli=" + cep_cli + ", email_cli=" + email_cli + ", animais=" + animais + "]";
	}
}
