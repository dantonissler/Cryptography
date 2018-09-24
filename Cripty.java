public class Cripty {
	public String criptografar(int num) {
		String binary = "";
		while (num > 0) {
			if (num % 2 == 0)
				binary = "1" + binary;
			else
				binary = "0" + binary;
			num /= 2;
		}
		return Integer.toString(Integer.parseInt(binary, 2)) + binary.length();
	}
}