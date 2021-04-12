package cidades;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) {

		Main app = new Main();
		app.start();

	}

	private void start() {
		Map<String, String> cidades = new HashMap<String, String>();

		cidades.put("SRS", "Santa Rita do Sapucai");
		cidades.put("PA", "Pouso Alegre");
		cidades.put("ITA", "Itajubá");
		cidades.put("ZORO", "Conceição dos Ouros");
		cidades.put("CAXU", "Cachoeira de Minas");

		System.out.println("Iterando o mapa criado");
		for (Map.Entry<String, String> entry : cidades/* Nome do mapa criado */.entrySet()) {
			System.out.println("Sigla: " + entry.getKey() + " --> Cidade: " + entry.getValue());
		}

		System.out.println("\nImprimindo somente o valor da chave ZORO");
		System.out.println("Valor: " + cidades.get("ZORO"));

		String search = "MG";
		System.out.println("\nProcurando o valor da chave " + search);
		if (cidades.containsKey(search)) {
			System.out.println("Valor da Chave " + search + " = " + cidades.get(search));
		} else {
			System.out.println("Chave não existe");
		}

		cidades.put("SRS", "Santa Rita");
		System.out.println("\nAlterando o valor da chave SRS e iterando");

		for (Map.Entry<String, String> entry : cidades/* Nome do mapa criado */.entrySet()) {
			System.out.println("Sigla: " + entry.getKey() + " --> Cidade: " + entry.getValue());
		}
	}
}