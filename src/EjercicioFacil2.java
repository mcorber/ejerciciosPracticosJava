import java.util.Scanner;

public class EjercicioFacil2 {
    public static void main(String[] args) {
        //Ejercicio 2
        //Variables
        Scanner sc = new Scanner(System.in);

        //Solicitamos un numero entero
        int primerosN = 0;
        do{
            System.out.println("Introduzca un numero positivos para calcular los N primeros numeros");
            if(sc.hasNextInt()){
                primerosN = sc.nextInt();
                if(primerosN < 1){
                    System.out.println("Tamaño no valido");
                }
            }else{
                System.out.println("No posible");
                sc.next();
            }
        }while (primerosN < 1);

        int suma = 0;

        for (int i = 0; i <= primerosN; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los primeros "+ primerosN+" es : "+suma);
    }
}
