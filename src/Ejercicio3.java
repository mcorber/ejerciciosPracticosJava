import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ejercicio 3
        int arrayLength = 0;
        Scanner sc = new Scanner(System.in);
        //Pedimos el length del array
        do{
            System.out.println("Introduzca la longitud del array");
            if(sc.hasNextInt()){
                arrayLength = sc.nextInt();
            }else{
                System.out.println("Valor inválido");
                sc.next();
            }
        }while(arrayLength<1);

        //Creamos e inicializamos el array
        int[] array = new int[arrayLength];

        //Solicitamos los elementos del array
        for(int i : array){
            boolean esValido = false;
            do{
                System.out.println("Introduzca un valor en la posición : "+(i+1));
                if(sc.hasNextInt()){
                    array[i]= sc.nextInt();
                    esValido = true;
                }else{
                    System.out.println("Caracter no válido");
                    sc.next();
                }
            }while (!esValido);
        }

        //Solicitamos al usuario que ingrese el valor objetivo para la suma
        int objetivoSuma = 0;
        boolean valorObjetivoValido = false;
        do{
            System.out.println("Introduzca el valor objetivo para la suma");
            if(sc.hasNextInt()){
                objetivoSuma = sc.nextInt();
                if(objetivoSuma < 2){
                    System.out.println("Valor no valido");
                }else{
                    valorObjetivoValido = true;
                }
            }else{
                System.out.println("Caracter no valido");
                sc.next();
            }
        }while (objetivoSuma == 0 || objetivoSuma < 2 || valorObjetivoValido == false);

        for (int i = 0; i < array.length; i++) {
            int suma = 0;
            ArrayList<Integer> subArray = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                suma = suma + array[j];
                subArray.add(array[j]);
                if(suma == objetivoSuma){
                    System.out.print("[");
                    for(int k = 0; k <subArray.size();k++){
                        System.out.print(subArray.get(k)+", ");
                    }
                    System.out.print("]");
                    break;
                }
            }
        }
    }


}
