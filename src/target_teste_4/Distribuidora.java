package target_teste_4;

public class Distribuidora {

	public static void main(String[] args) {

		double sp = 67.83643;

		double rj = 36.67866;
		double mg = 29.22988;
		double es = 27.16548;
		double outros = 19.84953;

		double total = (sp + rj + mg + es + outros);
		System.out.printf("Valor total mensal da distribuidora: %.2f ", total);
		System.out.println();
		System.out.printf("O percentual de SP, do valor total mensal é de: %.2f ", (sp / total * 100));
		System.out.println();
		System.out.printf("O percentual de RJ, do valor total mensal é de: %.2f  ", (rj / total * 100));
		System.out.println();
		System.out.printf("O percentual de MG, do valor total mensal é de: %.2f ", (mg / total * 100));
		System.out.println();
		System.out.printf("O percentual de ES, do valor total mensal é de: %.2f ", (es / total * 100));
		System.out.println();
		System.out.printf("O percentual de Outros, do valor total mensal é de: %.2f ", (outros / total * 100));

	}
}