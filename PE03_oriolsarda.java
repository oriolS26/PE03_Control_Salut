import java.util.Scanner;

public class PE03_oriolsarda {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        //Variables
        String opcio1, Nom;
        int edat;
        double pes, altura;

        //Menu
        System.out.println("Menu");
        System.out.println("Sisusplau, escull una opcio entre a: Introduccio de dades, b: Modificar dades o c: Visualitzar dades");
        opcio1 = e.nextLine();

        switch (opcio1) {
            case "a":
                System.out.println("Has escollit Introduccio de dades");
                if (opcio1 == "a")
                {
                    System.out.println("Siusplau, introdueix el teu nom complet: ");
                    Nom = e.nextLine();
                    System.out.println("Siusplau, introdueix la teva edat: ");
                    edat = e.nextInt();
                    if (edat > 120) 
                    {
                        System.out.println("Edat incorrecta");
                    }
                    System.out.println("Siusplau, introdueix el teu pes en kg: ");
                    pes = e.nextDouble();
                    if (pes > 400) 
                    {
                        System.out.println("Pes incorrecte");
                    }  
                    System.out.println("Siusplau, introdueix la teva altura en metres: ");
                    altura = e.nextDouble();
                    if ((altura > 2.5) || (altura < 0.5))
                    {
                        System.out.println("Altura incorrecta");
                    }
                }   
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