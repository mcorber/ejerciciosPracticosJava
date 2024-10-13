import java.util.Scanner;

public class EjercicioFacil3 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int multiplicador = -1;

        //Solicitamos el multiplicador
        do{
            System.out.println("Introduzca el número del cual desea su tabla :");
            if(sc.hasNextInt()){
                multiplicador = sc.nextInt();
                if(multiplicador < 0){
                    System.out.println("No se permiten valores negativos");
                }
            }else{
                System.out.println("Error");
                sc.next();
            }
        }while (multiplicador < 0);

        //Lógica
        for(int i = 1; i <= 10; i++){
            System.out.println(multiplicador+" x "+i+" = "+(i*multiplicador));
        }
    }
}
