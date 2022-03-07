import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Client {
    private Dni DNIC;
    private String nom;
    private String cognom;
    private String compteBanc;
    private int telefon;
    private LocalDate dataNaixement;
    private String correuElectro;
}

public void consultaClient(){
    Scanner teclat = new Scanner(System.in);

    System.out.println("************ Consulta DNI ************");
    System.out.println("introdueix el DNI del client que vols consultar: ");

    String dni = teclat.next();

    Client cli = consultaClientBD(dni);

    if(cli !=null){
        System.out.println(cli);
    }else{
        System.out.println("Client no trobat");
    }
}

private Client consultaClientBD(String dni){
    ConexioBDGimnas conGimnas = new ConexioBDGimnas();
    Connecttion con = conGimnas.conectar();

    String consulta = "SELECT * FROM client WHERE dni = ?";

    PreparedStatement sentencia = con.PreparedStatement(consulta);

    sentencia.setString(1, dni);

    ResultSet rs = sentencia.executeQuery();

    if(rs.next()){

        this.dni(rs.getString("dni"));
        this.cognom=rs.getString("Cognoms")

        this.dataNaixement = rs.getData("dataNeixement").toLocalDate;
    }
    return null;
}

public void altaClient(){

    Scanner teclat = new Scanner(System.in)
    //solicitem el dni a donar d'alta fins que sigui correcte

    Dni diniObj = new Dni();
    boolean dniCorrect0 = false;
    String dni;

    do{

        System.out.println("Introdueix el dni del client que vols donar d'alta: ");
        dni=teclat.nex();

    }while(dniObj.validarDni(dni));

    this.dni.setDni(dni);

    private void cargarDatosDeSentenciaEnSentencia(PreparedStatement ps) throws SQLException{
        ps.setString(1, this.dni.getDni());
        ps.setString(2, this.nom);
        ps.setString(3, this.cognom1);
        ps.setString(4, this.cognom2);
        ps.setString(5, this.CCC.getCCC());
        ps.setString(6, this.telefon.getTelefon());
        ps.setString(7, this.email.getEmail());
        ps.setString(8, dataNaixement.toString());
    }

    private void cargarDatosDeSentenciaEnClient(ResultSet rs) throws SQLException{
        this.setDni (new Dni(rs.getString("dni")));
        this.setNom (rs.getString("nom"));
        this.setCognom1 (rs.getString("Cognom1"));
        this.setCognom1 (rs.getString("Cognom2"));
        this.setEmail (new CorreuElectronic(rs.getString("email")));
        this.email=new CorreuElectronic(rs.getString("email")));
        this.setCCC (new CompteBancari(rs.getString("CCC")));

        this.setDataNeixement (rs.getString("dataNeixement").toLocalDate());
        calcularEdad();
    }

    public void altaClient() throws SQLException{
        Scanner tecla = new Scanner(System.in);

        String dni;
        Dni dniObj = new Dni;
        do{
            System.out.println("Introdueix el dni del client que vols donar d'alta: ");
            dni = tecla.next();
        } while (!dniObj.validarDni(dni));
        //fiquem el dni en l'Objecte dni
        dniObj.setDni(dni);

        //un cop validat el dni, l'assignem a l'assignem a l'atribut dni del Objecte Client
        setDni(dniObj);
    }
} 