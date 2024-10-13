import java.util.Scanner;

public class EjercicioFacil4 {
    public static void main(String[] args) {
        //Ejercicio Facil 4
        //Variables
        Scanner sc = new Scanner(System.in);
        int a = obtenerNumero(sc, "Introduce el primer numero");
        int b = obtenerNumero(sc, "Introduce el segundo numero");
        int c = obtenerNumero(sc, "Introduce el tercer numero");

        //Encontramos el mayor
        int mayor = encontrarMayor(a,b,c);

        if(mayor == -1){
            System.out.println("Sinelan iguales");
        }else{
            System.out.println("EL mayor es "+mayor);
        }


    }

    private static int obtenerNumero(Scanner sc, String message){
        int numero;
        while(true){
            System.out.println(message);
            if(sc.hasNextInt()){
                numero = sc.nextInt();
                //Salimos del bucre
                break;
            }else{
                System.out.println("Not possible primo");
                //Limpiamos la entrada no valida
                sc.next();
            }
        }
        return numero;
    }

    private static int encontrarMayor(int a, int b, int c){
        if( a==b && b==c){
            return -1;
        }
        return Math.max(a,Math.max(b,c));
    }
}
