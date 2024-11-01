
package Ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args)
    {
        Scanner lectura = new Scanner(System.in);
        double Compra1, Compra2, Compra3,Compra4;
        //Entrada
        System.out.print("Ingresa compra 1 :");
        Compra1 = lectura.nextDouble();
        System.out.print("Ingresa compra 2 :");
        Compra2 = lectura.nextDouble();
        System.out.print("Ingresa compra 3 :");
        Compra3 = lectura.nextDouble();
        System.out.print("Ingresa compra 4 :");
        Compra4 = lectura.nextDouble();

        RegistroCompra objregCompra = new RegistroCompra(Compra1,Compra2, Compra3, 
                                                         Compra4);
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("Total de compras : " + objregCompra.Total());
        System.out.println("Promedio de compras : " + objregCompra.Promedio());
        System.out.println("Compra mayor: " + objregCompra.Mayor());
        System.out.println("Compra menor : " + objregCompra.Menor());
    }
}
