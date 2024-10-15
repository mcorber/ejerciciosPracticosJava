import java.util.Scanner;

public class EjercicioFacil5 {
    public static void main(String[] args) {
        //Ejercicio 5
        //Variables
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        boolean palabraValida = false;
        do{
            System.out.println("Introduce una palabra");
            if(sc.hasNextLine()){
                palabra = sc.nextLine();
                palabraValida = validarPalabra(palabra);
            }else{
                System.out.println("NO VALIDO");
                sc.next();
            }
        }while (!palabraValida);

        //Convertimos a minusculas
        palabra = palabra.trim();
        palabra = palabra.toLowerCase();

        int numVocales = 0;
        String[] palabraArray = palabra.split("");

        for(int i = 0; i<palabraArray.length;i++){
            if(esVocal(palabraArray[i])){
                numVocales++;
            }
        }

        System.out.println("En la palabra : "+palabra+" hay "+numVocales+" vocales");



    }
    private static boolean esVocal(String letra){
        String[] vocales = new String[5];
        vocales[0] = "a";
        vocales[1] = "e";
        vocales[2] = "i";
        vocales[3] = "o";
        vocales[4] = "u";
        for (int i = 0; i < vocales.length; i++) {
            if(letra.equals(vocales[i])){
                return true;
            }
        }
        return false;
    }
    private static boolean validarPalabra(String palabra){

        String[] arrayLetras;
        arrayLetras = palabra.split("");

        if(arrayLetras.length == 0){
            return false;
        }

        for(int i = 0; i < arrayLetras.length;i++){
            if(arrayLetras[i].equals(" ") || arrayLetras[i].equals("")){
                return false;
            }
        }
        return true;
    }
}
