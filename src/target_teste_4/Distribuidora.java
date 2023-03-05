package target_teste_4;

public class Distribuidora {

	public static void main(String[] args) {

		double sp = 67.83643;

		double rj = 36.67866;
		double mg = 29.22988;
		double es = 27.16548;
		double outros = 19.84953;

		double total = (sp + rj + mg + es + outros);
		System.out.println("Valor total mensal da distribuidora: " + total + "\n");

		System.out.println("O percentual de SP, do valor total mensal é de: " + sp / total * 100 + "%");
		System.out.println("O percentual de RJ, do valor total mensal é de: " + rj / total * 100 + "%");
		System.out.println("O percentual de MG, do valor total mensal é de: " + mg / total * 100 + "%");
		System.out.println("O percentual de ES, do valor total mensal é de: " + es / total * 100 + "%");
		System.out.println("O percentual de Outros, do valor total mensal é de: " + outros / total * 100 + "%");

	}
}