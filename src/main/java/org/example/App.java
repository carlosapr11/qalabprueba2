package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int edad = 19;
        boolean bEsHombre = true;

        /*
        Solo podrán entrar a la discote los chicos mayores a 20 años,
        y las chicas mayores a 18 años.
         */
        if(bEsHombre){
            System.out.println("Es hombre");
            System.out.println("Desarrollando ejercicios 1");

            if(edad > 20){
                System.out.println("Si puede entrar a la fiesta");
            }else{
                System.out.println("no puede entrar  a la fiesta");
            }
        }else{
            System.out.println("Es Mujer");
            if(edad > 18){
                System.out.println("Si puede entrar a la fiesta");
            }else{
                System.out.println("no puede entrar  a la fiesta");
            }
        }






    }
}
