/*
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
el bloque de código que tendrá el bucle deberá:

    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("########## If exercise ##########");
        numIsPositiveOrNegativeOrZero(1);
        numIsPositiveOrNegativeOrZero(0);
        numIsPositiveOrNegativeOrZero(-10);
        System.out.println("#################################\n\n######## while exercise #########");
        whileLoop(0);
        whileLoop(2);
        whileLoop(10);
        System.out.println("#################################\n\n####### do while exercise #######");
        int numeroWhile = 3;
        do {
            System.out.println("Value pre-increment is: " + numeroWhile);
            ++numeroWhile;
            System.out.println("Value post-increment is: " + numeroWhile);
        }while (numeroWhile < 3);
        System.out.println("#################################\n\n######### for exerciese #########");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Value numFor is: " + numeroFor);
        }
        System.out.println("#################################\n\n######## switch exerciese ########");
        seasonMessage("spring");
        seasonMessage("summer");
        seasonMessage("asdasd");
        System.out.println("#################################\n");

    }

    public static void numIsPositiveOrNegativeOrZero(int numeroIf) {
        String text = "Value " + numeroIf + " is: ";
        if ( numeroIf == 0) {
            System.out.println(text + "0");
        } else if (numeroIf > 0) {
            System.out.println(text + "positive");
        }else {
            System.out.println(text + "negative");
        }
    }

    public static void whileLoop(int numeroWhile) {
        System.out.println("<----  init while loop numWhile: " + numeroWhile + " ---->");
        while (numeroWhile < 3) {
            System.out.println("Value pre-increment is: " + numeroWhile);
            numeroWhile++;
            System.out.println("Value post-increment is: " + numeroWhile);
        }
        System.out.println("<---- fin while loop ---->\n");
    }

    public static void seasonMessage(String season) {
        switch (season.toLowerCase()) {
            case "summer":
                System.out.println("¡It's Summer!");
                break;
            case "winter":
                System.out.println("¡It's Winter!");
                break;
            case "spring":
                System.out.println("¡It's Spring!");
                break;
            case "autumn":
                System.out.println("¡It's Autumn!");
                break;
            default:
                System.out.println(season + " is not a season");
        }
    }
}