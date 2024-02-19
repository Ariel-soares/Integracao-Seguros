package entities;

import java.io.Serializable;

public class Request implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String busca;
	private String termo_busca;
	
	
	public Request(String busca, String termo_busca) {
		this.busca = busca;
		this.termo_busca = termo_busca;
	}


	@Override
	public String toString() {
		return "Request [busca=" + busca + ", termo_busca=" + termo_busca + "]";
	}
	
	
}
