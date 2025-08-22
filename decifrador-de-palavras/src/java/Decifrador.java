import java.util.Scanner;

public class Decifrador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine().toLowerCase();

        boolean rara = false;
        String sequencia = "";

        for (int i = 0; i < palavra.length() - 2; i++) {

            char a = palavra.charAt(i);
            char b = palavra.charAt(i + 1);
            char c = palavra.charAt(i + 2);

            if (b == a + 1 && c == b + 1) {
                rara = true;
                sequencia = "" + a + b + c;
                break;

            }
        }
        if (rara) {
            System.out.println("Palavra Rara: contém sequência alfabética: \"" + sequencia + "\"");
        } else {
            System.out.println("Palavra comum: não contém sequência alfabética de 3 letras.");
        }
    }
}