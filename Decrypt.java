import java.util.ArrayList;

public class Decrypt {
	private ArrayList<String> descriptografado = new ArrayList<String>();

	public String decriptar(int key) {
		int a = (pegarDec(String.valueOf(key)));
		int b = (pegarKey(String.valueOf(key)));
		String binary = Integer.toBinaryString(a);
		transformarBit(binary, b);
		return transformandoDec();
	}

	int pegarKey(String decimal) {
		return Integer.parseInt(String.valueOf(decimal.charAt(8)) + String.valueOf(decimal.charAt(9)));
	}

	private int pegarDec(String dec) {
		return Integer.parseInt(String.valueOf(dec.charAt(0)) + String.valueOf(dec.charAt(1))
				+ String.valueOf(dec.charAt(2)) + String.valueOf(dec.charAt(3)) + String.valueOf(dec.charAt(4))
				+ String.valueOf(dec.charAt(5)) + String.valueOf(dec.charAt(6)) + String.valueOf(dec.charAt(7)));
	}

	private String transformarBit(String b, int key) {
		int x = b.length();
		while (x <= key) {
			if (x < key) {
				descriptografado.add("1");
			} else {
				for (char d : b.toCharArray()) {
					if (d == '0')
						descriptografado.add("1");
					else
						descriptografado.add("0");
				}
			}
			x++;
		}
		return descriptografado.toString();
	}

	private String transformandoDec() {
		String descrypt = "";
		for (int i = 0; i < descriptografado.size(); i++) {
			descrypt = descrypt + descriptografado.get(i);
		}
		return Integer.toString(Integer.parseInt(descrypt, 2));
	}
}
