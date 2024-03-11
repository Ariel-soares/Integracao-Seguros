package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente {
	
	private String nome_razaosocial;
	private String cpf_cnpj;
	
	public Cliente() {
	}
	
	public Cliente(String nome_razaosocial, String cpf_cnpj) {
		this.nome_razaosocial = nome_razaosocial;
		this.cpf_cnpj = cpf_cnpj;
	}
	
	public String getNome_razaosocial() {
		return nome_razaosocial;
	}
	
	public void setNome_razaosocial(String nome_razaosocial) {
		this.nome_razaosocial = nome_razaosocial;
	}
	
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome_razaosocial=" + nome_razaosocial + ", cpf_cnpj=" + cpf_cnpj + "]";
	}
	
}
