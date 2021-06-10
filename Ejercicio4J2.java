import java.util.Random;
import java.util.Scanner;

public class Ejercicio4J2 {

    public static void main(String[] args) {
        // variables a utilizar
        Scanner sc = new Scanner(System.in);
        Random Aleatoreo = new Random();
        int Muestra;
        // un for para recorrer la edad de las 20 personas
        for (int i = 1; i < 20; i++) {
            // un Aleatoreo pa que crea las edades y luego son evaluadas
            Muestra = Aleatoreo.nextInt(50) + 1;
            //condicion que define si es mayor o menor de edad
            if (Muestra >= 18) {
                System.out.println(Muestra + " Mayor de edad");
            } else {
                System.out.println(Muestra + " Menor de edad");
            }

        }
    }
}