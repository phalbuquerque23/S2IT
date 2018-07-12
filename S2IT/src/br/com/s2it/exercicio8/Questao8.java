package br.com.s2it.exercicio8;
public class Questao8 {

	static int maior = 0;
	static int menor = 0;

	public int retornaValor(int valorA, int valorB) {

		boolean stop = false;

		int a = valorA;
		int b = valorB;
		int c = 0;

		int qtdA = qtdDigitos(a);
		int qtdB = qtdDigitos(b);

		int posA = 0;
		int posB = 0;

		String numero = "";

		char[] charA = (a + "").toCharArray();
		char[] charB = (b + "").toCharArray();

		while (!stop) {

			while (qtdA > 0) {
				numero += (charA[posA] + "");

				qtdA--;
				posA++;
				
				break;

			}

			while (qtdB > 0) {
				numero += (charB[posB] + "");
				qtdB--;
				posB++;

				break;

			}

			if (qtdA == 0 && qtdB == 0) {

				c = Integer.parseInt(numero);
			}

			if (qtdA == 0 && qtdB == 0) {
				stop = true;
			}
		}


		return c > 1000000 ? -1 : c;
	}

	public static int qtdDigitos(int n) {
		n = Math.abs(n);
		if (n == 0)
			return 1;
		else
			return (int) (Math.log10(n) + 1);
	}

}
