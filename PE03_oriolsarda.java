import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.Year;

public class PE03_oriolsarda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
        String opcio1, Nom, pesStr, alturaStr, opcio2;
        String nouNom;
        String categoria,nomVisualitzat;
        int fcmax,fc50,fc80,anyNaix;
        double imc,aigua;
        //calcul variables
        int edat = 0;
        double pes = 0.0, altura = 0.0;
        String nom = "";
        boolean dadesIntrod = false;
        while (true) {

        //Menu
        System.out.println("Menu");
        System.out.println("Sisusplau, escull una opcio entre:  ");
        System.out.println("1: Introduccio de dades");
        System.out.println("2: Modificar dades");
        System.out.println("3: Visualitzar dades");
        System.out.println("4: Sortir");
        opcio1 = scanner.nextLine();

        switch (opcio1) {
            case "1":
                System.out.println("Has escollit Introduccio de dades");
                try
                {
                    //Nom
                    System.out.println("Siusplau, introdueix el teu nom complet: ");
                    Nom = scanner.nextLine();
                    if (Nom.equals(""))
                    {
                        System.out.println("Nom incorrecte");
                        break;
                    }
                    //Edat
                    System.out.println("Siusplau, introdueix la teva edat: ");
                    edat = Integer.parseInt(scanner.nextLine());
                    if (edat > 120 || edat < 0)
                    {
                        System.out.println("Error: L'edat ha de ser un enter posistiu positiu mes petit o igual que 120");
                        break;
                    }
                    //Pes
                    System.out.println("Siusplau, introdueix el teu pes en kg: ");
                    pesStr = scanner.nextLine().replace(',', '.');
                    pes = Double.parseDouble(pesStr);
                    if ((pes > 400) || (pes <= 0))
                    {
                        System.out.println("Error: El pes no pot ser major que 400 kg");
                        break;
                    }  
                    //Altura
                    System.out.println("Siusplau, introdueix la teva altura en metres: ");
                    alturaStr = scanner.nextLine().replace(',', '.');
                    altura = Double.parseDouble(alturaStr);
                    if ((altura >= 2.5) || (altura <= 0.5))
                    {
                        System.out.println("Altura incorrecta");
                        break;
                    }
                    dadesIntrod = true;
                }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Error: format numèric invàlid");
                        System.out.println(e.getMessage());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error inesperat");
                        System.out.println(e.getMessage());
                    }
                break;
            case "2":
                System.out.println("Has escollit Modificar dades");
                if (!dadesIntrod) 
                {
                    System.out.println("Error: Primer has d'introduir les dades");
                    break;
                }
                System.out.println("Quina dada vols modificar? (nom, edat, pes, altura)");
                opcio2 = scanner.nextLine();
                try 
                {
                    switch (opcio2) {
                        case "nom":
                            System.out.println("Introdueix el nou nom: ");
                            nouNom = scanner.nextLine();
                            if (nouNom.equals(""))
                            {
                                System.out.println("Nom incorrecte");
                            }
                            else
                            {
                                nom = nouNom;
                                System.out.println("Nom modificat correctament");
                            }
                            break;
                        case "edat":
                            System.out.println("Introdueix la nova edat: ");
                            edat = Integer.parseInt(scanner.nextLine());
                             if (edat > 120 || edat < 0)
                            {
                                System.out.println("Error: L'edat ha de ser un enter posistiu positiu mes petit o igual que 120");
                            }
                            else
                            {
                                System.out.println("Edat modificada correctament");
                            }
                            break;
                        case "pes":
                            System.out.println("Introdueix el nou pes");
                            pes = Double.parseDouble(scanner.nextLine().replace(',', '.'));
                            if ((pes > 400) || (pes <= 0)) 
                            {
                                System.out.println("Error: El pes no pot ser major que 400 kg");
                            }
                            else
                            {
                                System.out.println("Pes modificat correctament");
                            }
                            break;
                        case "altura":
                            System.out.println("Introdueix la nova altura (m): ");
                            altura = Double.parseDouble(scanner.nextLine().replace(',', '.'));
                            if ((altura >= 2.5) || (altura <= 0.5))
                            {
                                System.out.println("Altura incorrecta");
                            }
                            else
                            {
                                System.out.println("Dades introduides correctament");
                            }
                            break;
                        default:
                            System.out.println("Camp no vàlid");
                    }
                } 
                catch (NumberFormatException e)
                    {
                        System.out.println("Error: format numèric invàlid");
                        System.out.println(e.getMessage());
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error inesperat");
                        System.out.println(e.getMessage());
                    }
                break;
            case "3":
                System.out.println("Has escollit Visualitzar dades");
                 if (!dadesIntrod) 
                {
                    System.out.println("Error: Primer has d'introduir les dades");
                    break;
                }
                //Normalitzar Nom
                nomVisualitzat = normalitzarNom(nom);

                //Calcul
                imc = pes / (altura * altura);
                if (imc < 18.5) 
                {
                    categoria = "Baix pes";
                } 
                else if (imc < 25) 
                {
                    categoria = "Pes normal";
                } 
                else if (imc < 30) 
                {
                    categoria = "Sobrepès";
                } 
                else 
                {
                    categoria = "Obesitat";
                }

            case "4":
                System.out.println("Has escollit Sortir");
                break;
            default:
                System.out.println("Opcio incorrecta");
                break;
            }
        }
    }
}