public class Teste {
	public static void main(String[] args) {
		// Incira sua chave de 8 digitos.
		Cripty c = new Cripty();
		System.out.println(c.criptografar(21425876));

		// Recolha o numero descripitografado
		Decrypt d = new Decrypt();
		System.out.println(d.decriptar(1212855525));
	}
}