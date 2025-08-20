import java.util.Scanner;

interface IInstrumento { void tocar(); }

class Violino implements IInstrumento {
    public void tocar() { System.out.println("Violino:  fiiiiiiuuu "); }
}
class Piano implements IInstrumento {
    public void tocar() { System.out.println("Piano:  plim plim plim "); }
}
class Tambor implements IInstrumento {
    public void tocar() { System.out.println("Tambor:  tum tum tum "); }
}

public class OrquestraVirtual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um instrumento (Violino, Piano, Tambor):");
        String escolha = sc.nextLine().toLowerCase();

        IInstrumento instrumento = switch (escolha) {
            case "violino" -> new Violino();
            case "piano"   -> new Piano();
            case "tambor"  -> new Tambor();
            default        -> null;
        };

        if (instrumento != null) instrumento.tocar();
        else System.out.println("Instrumento inválido.");
    }
}
