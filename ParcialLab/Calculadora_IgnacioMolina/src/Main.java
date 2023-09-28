
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora!!");

        System.out.println("-----------------------------------------------------");

        System.out.println("Colocar a continuación los dos números con los cuales se van a generar las operaciones de la calculadora: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int Opcion = 6;


        while (Opcion != 0) {

            System.out.println("-----------------------------------------------------");

            System.out.println("A continuación debe elegir la operacion que usted quiere generar");
            System.out.println("Las opciones son:");
            System.out.println("- Suma (1) - - Resta (2)- - Multiplicación (3)- - División (4)-");
            System.out.println("- Si quiere terminar el programa simplemente escriba 0 -");

            Opcion = sc.nextInt();

            System.out.println("-----------------------------------------------------");

            if (Opcion != 1 && Opcion != 2 && Opcion != 3 && Opcion != 4 && Opcion != 5 ) {

                System.out.println("El valor ingresado no es valido.");

            } else {

                if (Opcion == 1) {

                        int resultado = num1 + num2;
                        System.out.println("El resultado de la suma es: " + resultado);

                    } else if (Opcion == 2) {

                        int resultado = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resultado);

                    } else if (Opcion == 3) {

                        int resultado = num1 * num2;
                        System.out.println("El resultado de la multiplicación es: " + resultado);

                    } else if (Opcion == 4) {

                        if (num1 == 0 || num2 == 0) {

                            System.out.println("Uno de los dos números no es valido porque es 0!");

                        } else {

                            int resultado = num1 / num2;
                            System.out.println("El resultado de la división es: " + resultado);
                        }
                    }
                }
            }
        }
   }