import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 1
        //Variables
        Scanner sc = new Scanner(System.in);
        int arrayLength = 0;

        //Pedimos la longitud del array
        do{
            System.out.println("Introduzca la cantidad de elementos que tendrá el array");
            //Nos aseguramos de que sea un numero entero
            if(sc.hasNextInt()){
                //Si es un numeor entero, cogemos el input y se lo asignamos a arrayLength
                arrayLength = sc.nextInt();
                //Comprobamos que sea valido, y no menor a 1
                if(arrayLength < 1) {
                    System.out.println("El tamaño del array no es válido");
                }
            //Si no es un numero entero valido, le informamos
            }else{
                System.out.println("Porfavor, ingrese un número entero válido");
                //System.out.println("next : "+sc.next());
                //Con el método next(), descartarmos la entrada inválida, para que asi no intente procesarla
                //Y nos de error;
                sc.next();
            }
        }while (arrayLength < 1 );

        //Una vez sabemos la longitud del array, lo declaramos
        int[] numeros = new int[arrayLength];

        //Solicitamos que introduzca los valores del array
        for(int i = 0; i < numeros.length; i++){
            boolean esValido = false;
            do{
                System.out.println("Valor en la posición : "+(i+1));
                //Comprobamos que sea valido
                if(sc.hasNextInt()){
                    //En caso de que sí, agregamos el valor a esa posición del array
                    numeros[i] = sc.nextInt();
                    //Ponemos esValido a true, para que salga del bucle
                    esValido = true;
                }else{
                    System.out.println("Valor no valido para la posicion : "+(i+1));
                    //Para que no entre en bucle infinito, descartamos
                    sc.next();
                }
            }while (esValido == false);
        }
        //Mostramos el array para verificar que esté bien
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1)+" : "+numeros[i]);
        }

        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        //Aquí verificamos cual es el numero mayor y menor del array
        for (int i = 1; i < numeros.length ; i++) {
            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
        }

        System.out.println("El número mayor es : "+numeroMayor);
        System.out.println("El número menor es : "+numeroMenor);

        //Promedio de los números
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        double promedio = (double)suma / numeros.length;
        System.out.println("La media es : "+promedio);

        //Cantidad de números positivos y números negativos
        int cantidadNumerosNegativos = 0;
        int cantidadNumerosPositivos = 0;
        ArrayList<Integer> numerosPositivos = new ArrayList<Integer>();
        ArrayList<Integer> numerosNegativos = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 0){
                cantidadNumerosPositivos++;
                numerosPositivos.add(numeros[i]);
            }
            if(numeros[i] < 0){
                cantidadNumerosNegativos++;
                numerosNegativos.add(numeros[i]);
            }
        }

        System.out.println("Hay "+cantidadNumerosPositivos+" numeros positivos, y son :");
        for (int i = 0; i < numerosPositivos.size(); i++) {
            System.out.println(numerosPositivos.get(i));
        }
        System.out.println("Hay "+cantidadNumerosNegativos+" numeros negativos, y son :");
        for (int i = 0; i < numerosNegativos.size(); i++) {
            System.out.println(numerosNegativos.get(i));
        }

        //Números Pares e impares
        int cantidadNumerosPares = 0;
        int cantidadNumerosImpares = 0;

        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0){
                cantidadNumerosPares++;
                numerosPares.add(numeros[i]);
            }else{
                cantidadNumerosImpares++;
                numerosImpares.add(numeros[i]);
            }
        }

        System.out.println("Hay "+cantidadNumerosPares+ " números pares, y son :");
        for (int i = 0; i < numerosPares.size(); i++) {
            System.out.println(numerosPares.get(i));
        }
        System.out.println("Hay "+cantidadNumerosImpares+ " números impares, y son :");
        for (int i = 0; i < numerosImpares.size(); i++) {
            System.out.println(numerosImpares.get(i));
        }

        //El número que más se repite en el array
        //Declaramos un HashMap para usar la clave valor
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        //Declaramos e inicializamos la variable moda con un valor muy pequeño
        int moda = Integer.MIN_VALUE;
        //Inicializamos la frecuencia maxima a 1
        int maxFrecuencia = 1;
        //Por cada valor del array numeros, creamos una clave-valor en el hasmap
        //Siendo la clave el numero, y el valor, las veces que se repite
        for (int i = 0; i < numeros.length; i++) {
            //getOrDefault, se encarga de comprobar cuantas veces se repite, por defecto 0, y luego se incrementa en 1
            frecuencia.put(numeros[i], frecuencia.getOrDefault(numeros[i],0) +1);
        }

       //Muestro opcionalmente las clave valor
       //Y por cada posicion compruebo si las veces que se repite es mayor a maxFrecuencia
       //Si es asi maxFrecuencia es frecuencia.get(i) y moda es i
       for(int i : frecuencia.keySet()){
           System.out.println("clave : "+i+" valor : "+frecuencia.get(i));
           if(frecuencia.get(i)>maxFrecuencia){
               maxFrecuencia = frecuencia.get(i);
               moda = i;
           }
       }
        //Comprobamos que algún numero se repita, es decir, que haya alguna moda
       if(moda != Integer.MIN_VALUE){
           System.out.println("El número que más se repite es : "+moda+" y se repite "+maxFrecuencia+" veces");
       }else{
           System.out.println("No hay ninguna moda");
       }

    }
}
