package program;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

import entities.Request;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Request req = new Request("cpf_cnpj", "01482283565");
		
		
		

		String token = "";
		String token_original = "";
		
		
		HttpRequest request = HttpRequest.newBuilder().GET()
				.uri(URI.create("https://api.asetelecom.hubsoft.com.br/api/v1/integracao/cliente?busca=cpf_cnpj&termo_busca=01482283565"))
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + token_original)
				.build()
				;

		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(3))
				.followRedirects(Redirect.NORMAL).build();

		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

		System.out.println(response.body());
		System.out.println(response.statusCode());
		System.out.println(response.headers());

	}

}
