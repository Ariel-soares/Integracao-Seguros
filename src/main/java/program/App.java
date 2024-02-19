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
		
		
		

		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjE1YjBhYjQzNWQ5NjJmMDg4YTc1YjYzMzZlYjc1NjdjYWU5N2Y0MWQyOTIzZDliMzllZDcwNTdmNjkxMGJiYzY3NDQzOWQzYzNmNWI1YjZiIn0.eyJhdWQiOiIxMTg2IiwianRpIjoiMTViMGFiNDM1ZDk2MmYwODhhNzViNjMzNmViNzU2N2NhZTk3ZjQxZDI5MjNkOWIzOWVkNzA1N2Y2OTEwYmJjNjc0NDM5ZDNjM2Y1YjViNmIiLCJpYXQiOjE3MDc1MDMzNDUsIm5iZiI6MTcwNzUwMzM0NSwiZXhwIjoxNzEwMDk1MzQ0LCJzdWIiOiI2NjU0Iiwic2NvcGVzIjpbXX0.T6l4kTYTYpSXO2unSrtBDKKxyrotT-lWve2lhoob0zIluLsPdTYNAqN6Cy0L4h5oB6bl1_4-GtBJn9YssxXAfM-o0IZwZMq1jHB3cl0xF4bukL8cURcPEt0JM3noIQ3aK_XIYPFxCAYdDNTGnx7W6YBLTimcn5vPHQ8YRCbBWJn6SQfGarHqcXP1mkoaSfhVD3yAhFHnJRBTUX-IG23profNPUQlhzd3Bbku8Qpm5T8zUNfIQdMHgP6xf9vYpIL1GR8m21yeZKt9y_JOmnx0wjyd5qfXgl53-qqraQqOjMiaWT7aJOJxbLXeh-Cg1CRhHZQ8d6zl8QpmM_liUfBt04aNqGjYHCRxoHgm1Lld3XPXL67jex8vNw2er-vP10A8EqZwFPt8yumvs4sx0pgAFdWAbFvuusTwk4MAJQRS2IR3HlKSwuZ8WtPUIlT2QwrxNHQlBdWPssYX_8z19YRpNWRsICIQQWkdLfB4RKOzs4iUEma_ay_yT96oo4X6Y12ViZq6XWg-kTEjQoul4gqUbjJAgGGLm4lj5MZUpZ6rhQkGpzkOVMn5EwIb5eT9X7glrzmBYKWO7lW3pHkCeUw-9QSs1S5mo2LBo7o1aSRh48hPJEmNsGJVqcmrB5mc9RMY2rg8-CulVb9SLKhd68ARiDAJEVEAYUKFE-8C7pZ7Glo";
		String token_original = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjdjOTI4ZmQwOWM3YTU2MWE3ZjZiYTNhZGY3OGMxZGNjNGZmYjkwOTNlNWFiMzBkN2JiZGNjZWY1OTkyYmVkZTg3ODViNzJiMmE4MjVmNjM1In0.eyJhdWQiOiIyNSIsImp0aSI6IjdjOTI4ZmQwOWM3YTU2MWE3ZjZiYTNhZGY3OGMxZGNjNGZmYjkwOTNlNWFiMzBkN2JiZGNjZWY1OTkyYmVkZTg3ODViNzJiMmE4MjVmNjM1IiwiaWF0IjoxNzA3NTAxMDI1LCJuYmYiOjE3MDc1MDEwMjUsImV4cCI6MTcxMDA5MzAyNSwic3ViIjoiMjkzIiwic2NvcGVzIjpbXX0.pGG0gdVwkErivqX_AOhUgLiJk0RF1w0whCKxOUHHj6L2k86DGVo8cTqAg8tCo9pA53XfDr40-n_JRs7NpT72Z00lEd2jUM_FrabNE3fvLguor5bkYq9CvXe_LsiV77CHOJBiHxoE-iZXGpnCXcp0V0RTvqEtJnn-TddU4N466h7ZIMLmyL-CTb-jMwKkqpu7hv8di4mo2azPWBqpVm1jvoRiV9LsPNdf1pqhTcb7WH23g0z8lBl4wlcgqh1yI2Q5wQNQWeDH9ehtUISQSU8gXzN4UN2UDVs47x5PBCBXjAauWKtwNEBdeqeFlnDwl0oVndQRyu_UgfWlrK4jVPoZYQZDoICzQO4aDByo4uzhldrwrlpNPG1aW4sKpPPFiam5QEeoR9ZP_DtEBNL8sR3AtcVKkMkuUzxiijuZH_EeNxbVSWsOyerbbZFxVmlU1hP3PdAz9maoeR25ZJKax43PfkFERwylGCYbPnoJHm9_bd5qs634OUReVQYjB9Zv1I-rYGbc5LPcHt6waF3eqkHUE-juvIZgpIjfz_wvSvJxl96KOwzTBlzo11otxLUl3pjez3bwkPyHbzpD9RRIx0h_uINg6-PIpsBaG0oIOgFzVLf88VevBjsw9PlHbRoeKPbKhtRLznQRaZqgV2-KMsdDbREUHk2cEdo1wFcj5ZCFoUw";
		
		
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
