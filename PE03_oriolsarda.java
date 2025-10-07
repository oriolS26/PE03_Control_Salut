import java.util.Scanner;

public class PE03_oriolsarda {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("Sisusplau, escull una opcio entre a: Introduccio de dades, b: Modificar dades o c: Visualitzar dades");
        String opcio1 = e.nextLine();

        switch (opcio1) {
            case "a":
                System.out.println("Has escollit Introduccio de dades");
                break;
            case "b":
                System.out.println("Has escollit Modificar dades");
                break;
            case "c":
                System.out.println("Has escollit Visualitzar dades");
                break;
            default:
                System.out.println("Opcio incorrecta");
                break;
        }
    }
}