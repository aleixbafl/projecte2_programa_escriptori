public class Dni {
    private String dni;
    private int numero;
    private char lletra;

    public boolean validarDni (String dni){

        if( dni.length() !=9) return false;

        char utilPos = dni.charAt(8);

        if (!(Character.isLetter(utlPos))) return false;

        letraMayuscula = Character.toUpperCase(utilPos);

        String dniNum=dni.substring(0, 8);

        if(!soloNumeros(dniNum)) return false;
        if(!(calcularlletraDNI(dniNum)==letraMayuscula)) return false;

        return true;

    }
}
