package ushtrime.enums;

public class NotaTest {
    public static void main(String[] args) {
        Nota notaErblinit = Nota.DOBET;
        Nota notaEdipit = Nota.SHUME_MIRE;

        System.out.println(notaErblinit.getValue());
        System.out.println(notaErblinit.getName());

        if (notaEdipit.compareTo(notaErblinit) > 0) {
            System.out.println("Edipi ka vlersim me te mire");
        } else if (notaEdipit.compareTo(notaErblinit) == 0) {
            System.out.println("Jane te njejte");
        } else {
            System.out.println("Edipi ja ka leshu Erblinit!");
        }
    }
}






