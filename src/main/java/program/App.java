package program;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Resposta;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {

<<<<<<< HEAD
		String token_demo = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjE1YjBhYjQzNWQ5NjJmMDg4YTc1YjYzMzZlYjc1NjdjYWU5N2Y0MWQyOTIzZDliMzllZDcwNTdmNjkxMGJiYzY3NDQzOWQzYzNmNWI1YjZiIn0.eyJhdWQiOiIxMTg2IiwianRpIjoiMTViMGFiNDM1ZDk2MmYwODhhNzViNjMzNmViNzU2N2NhZTk3ZjQxZDI5MjNkOWIzOWVkNzA1N2Y2OTEwYmJjNjc0NDM5ZDNjM2Y1YjViNmIiLCJpYXQiOjE3MDc1MDMzNDUsIm5iZiI6MTcwNzUwMzM0NSwiZXhwIjoxNzEwMDk1MzQ0LCJzdWIiOiI2NjU0Iiwic2NvcGVzIjpbXX0.T6l4kTYTYpSXO2unSrtBDKKxyrotT-lWve2lhoob0zIluLsPdTYNAqN6Cy0L4h5oB6bl1_4-GtBJn9YssxXAfM-o0IZwZMq1jHB3cl0xF4bukL8cURcPEt0JM3noIQ3aK_XIYPFxCAYdDNTGnx7W6YBLTimcn5vPHQ8YRCbBWJn6SQfGarHqcXP1mkoaSfhVD3yAhFHnJRBTUX-IG23profNPUQlhzd3Bbku8Qpm5T8zUNfIQdMHgP6xf9vYpIL1GR8m21yeZKt9y_JOmnx0wjyd5qfXgl53-qqraQqOjMiaWT7aJOJxbLXeh-Cg1CRhHZQ8d6zl8QpmM_liUfBt04aNqGjYHCRxoHgm1Lld3XPXL67jex8vNw2er-vP10A8EqZwFPt8yumvs4sx0pgAFdWAbFvuusTwk4MAJQRS2IR3HlKSwuZ8WtPUIlT2QwrxNHQlBdWPssYX_8z19YRpNWRsICIQQWkdLfB4RKOzs4iUEma_ay_yT96oo4X6Y12ViZq6XWg-kTEjQoul4gqUbjJAgGGLm4lj5MZUpZ6rhQkGpzkOVMn5EwIb5eT9X7glrzmBYKWO7lW3pHkCeUw-9QSs1S5mo2LBo7o1aSRh48hPJEmNsGJVqcmrB5mc9RMY2rg8-CulVb9SLKhd68ARiDAJEVEAYUKFE-8C7pZ7Glo";
		String token_original = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjM3M2NkOWExM2JkOWJmZWQxMDM0MjlkZGU5NDU0OGM3NGYyNmQwZmRiMjAwMWE1ODZhNThkZWNjZDFmODJjZmVmMjBhNWE0MGQxMWZjOWIzIn0.eyJhdWQiOiIyNSIsImp0aSI6IjM3M2NkOWExM2JkOWJmZWQxMDM0MjlkZGU5NDU0OGM3NGYyNmQwZmRiMjAwMWE1ODZhNThkZWNjZDFmODJjZmVmMjBhNWE0MGQxMWZjOWIzIiwiaWF0IjoxNzEwMTc3NjU5LCJuYmYiOjE3MTAxNzc2NTksImV4cCI6MTcxMjc2OTY1OSwic3ViIjoiMjkzIiwic2NvcGVzIjpbXX0.Q8JuDB2DsDGLHR7NTmyopD4jyd9PHKAgMZs4_XE28AilLnirZ4cUKaxe0gGY8gw1b14hECkDtWbEeHEyNaRXcMCf8pRlIaJMDsvoVWXPli5u47QPZ3vc1WM3FrGDiwivGWDoNEKwOXP8MR8Q_sjgx4lDpLK0e3pKStyE9GBPG1hC_YRRw3_qPPuzuk9GTiToIBdtIeR6RfxPBwGUyOm-p7yOzgFCPhB8NPgp7slT2gSissgy4OXoiG_GE4XKikSOQuqKDz4EdChW6cmqpqexHJJHeMHACAY_NBUDp0eEuOKhCvzf4MAufTyaLf3Qcr8S4ohxAUQS5l9Liy5VUFUlDUU5ASoHpxnGYZSha7KhDOlrwoeK9tsi8vAPCH4WY_jqkQInKS2B-3fW_Ib80eUMEKZpGTWkf5n8xjxSKCvUv2gymeTHxzNowydz5KN_Gh9cR_2fjl5lakFLCMHNBhrVu62nc2grpQnbFGMHQ-v5Im4RhU46mjEEkHzbM8ZzX7Mvtnf0pOE0QYI7cGxDoCh0IaJKogUdotc-ymyv_gnX08iz0--T5DwVsimy6ms_kSPx7ouObvY3e-4CR-M3n0I18GNlMv6rLj0g3seN5TqxOXTvxPwuvOYJnB8LPF45Z4qtRx4bhrBR6J9JPv-XuGYh8EaknxHeyyYiX3KYX9Obf7I";
=======
		String token = "";
		String token_original = "";
>>>>>>> 18f5a5f516273e5b8ed2a4137557b65404d5fb42
		
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("https://api.asetelecom.hubsoft.com.br/api/v1/integracao/cliente?busca=cpf_cnpj&termo_busca=01482283565"))
				.header("Content-Type", "application/json")
				.header("Authorization", "Bearer " + token_original)
				.build();

		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(3))
				.followRedirects(Redirect.NORMAL).build();

		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

		System.out.println(response.body());
		System.out.println(response.statusCode());
		System.out.println(response.headers());


		Resposta resposta;
		
		
	        if (response.statusCode() == 200) {
	        	ObjectMapper mapper = new ObjectMapper();
	            resposta = mapper.readValue(response.body(), Resposta.class);
	        
	            System.out.println(resposta);
	            
	            System.out.println(resposta.getClientes());
	            
	        } else {
	            System.out.println("Error in sending a GET request");
	        }
	}

}
