package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Servico {

	
	private Endereco_cadastral endereco_fiscal;
	
	public Servico(){
	}

	public Servico(Endereco_cadastral endereco_fiscal) {
		this.endereco_fiscal = endereco_fiscal;
	}

	public Endereco_cadastral getEndereco_fiscal() {
		return endereco_fiscal;
	}

	public void setEndereco_fiscal(Endereco_cadastral endereco_fiscal) {
		this.endereco_fiscal = endereco_fiscal;
	}

	@Override
	public String toString() {
		return "Servico [endereco_fiscal=" + endereco_fiscal + "]";
	}
	
}
