
import java.util.ArrayList;
import java.util.Scanner;

public class Gimnas {
    
    private String nom;
    private String CIF;
    private String telefon;

    ArrayList<Client> clients;

    public void gestionarGimnas(){
        boolean sortir = false;
        Scanner teclat = new Scanner(System.in);

        do {
            //Menu principal del Gimnas
            System.out.println("************ Menu Gimnas ************");
            System.out.println("1.Gestio de Clients");
            System.out.println("2.Visualitzar els Clients");
            System.out.println("3.Visualitzar les activitats");
            System.out.println("4.Activitats més reservades");
            System.out.println("5.Sortir");
            System.out.println("\nTria una de les opcions:");

            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    gestioGimnas();
                    break;
                case 2:
                    visualitzarClients();
                    break;
                case 3:
                    visualitzarActDia();
                    break;
                case 4:
                    visualitzarActRes();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("L'Opció no és vàlida");
            }

            System.out.println(("opció: ") + opcio);

        } while (!sortir);
    }

    private void gestioGimnas() {
        gestioClient();
    }

    private void visualitzarClients() {

    }

    private void visualitzarActDia() {

    }

    private void visualitzarActRes() {
        
    }

    public void gestioClient(){
        boolean sortir = false;
        Scanner teclat = new Scanner(System.in);

        do {
            //Menu principal del Gimnas
            System.out.println("************ Menu Client ************");
            System.out.println("1.Consulta Client");
            System.out.println("2.Alta de Client");
            System.out.println("3.Baixa de Client");
            System.out.println("4.Modificar Client");
            System.out.println("5.Enrere");
            System.out.println("\nTria una de les opcions:");

            while(!teclat.hasNextInt()) {
                System.out.println("Valor no valid");
                teclat.next();
                System.out.println("Introdueix un número enter");
            }

            int opcio = teclat.nextInt();
            teclat.nextLine();

            switch (opcio) {
                case 1:
                    consultaClient();
                    break;
                case 2:
                    altaClient();
                    break;
                case 3:
                    baixaClient();
                    break;
                case 4:
                    modificarClient();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("L'Opció no és vàlida");
            }

            System.out.println(("opció: ") + opcio);

        } while (!sortir);
    }
    
    private void consultaClient(){

        //demanar el DNI
        Client c = new Client();
        
        c.consultaClient();
        
    }

    private void altaClient(){
        Client c = new Client();
        
        c.altaClient();
    }

    private void baixaClient(){

    }

    private void modificarClient(){

    }

}