package ciclowhile;
import java.util.Scanner;
public class CicloWhile {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        
        while(!salir){
        System.out.println("===============================");
        System.out.println("Bienvenido a ....");
        System.out.println("1.- Saludar");
        System.out.println("2.- Despedir");
        System.out.println("3.- Cobrar");
        System.out.println("4.- Escapar");
        System.out.println("5.- Salir");
        System.out.println("==================================");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Buenos dias");
                break;
            case 2:
                int[] numeros = {1,2,3,4,5};
                Object[] numerosLetras = {12, "Elizabeth", 123.21, true, "Marco"};
                
              for(Object n1 : numerosLetras){
                      System.out.println(n1);
                }
               //for normal 
               for(int n=0;n<numeros.length ; n++){
                   if(numeros[n] == 2){
                     System.out.println("se ha encontrado el numero");
                   }else{
                      System.out.println("no se ha encontrado el numero");
                   }
               System.out.println(numeros[n]);
               }
               
                System.out.println("Chauu ... vuelva pronto");
                break;
            case 3:
                System.out.println("Quiero que me pagues");
                break;
            case 4:
                System.out.println("Se escapo...");
                break;
            case 5:
                salir = true;
                System.out.println("Gracias por usar nuestro menu");
                break;
            default:
                System.out.println("ingrese una opcion valida");
                break;
        }
        
    }
    }
}