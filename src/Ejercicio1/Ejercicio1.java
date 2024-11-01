
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double IngresoMensual, OtrosIngresos, GastoMensual;
        String NomEmpleado ;
        //Entrada
        System.out.print("Ingrese empleado :");
        NomEmpleado = lectura.next();
        System.out.print("Ingreso mensual :");
        IngresoMensual = lectura.nextDouble();
        System.out.print("Otros ingresos :");
        OtrosIngresos = lectura.nextDouble();
        System.out.print("Gasto mensual :");
        GastoMensual = lectura.nextDouble();

        Empleado objregEmpleado = new Empleado(IngresoMensual, OtrosIngresos, GastoMensual);
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("Empleado : " + NomEmpleado);
        System.out.println("Ahorro Mensual es : " + objregEmpleado.AhorroMensual());
        System.out.println("Ahorro Semestral es : " + objregEmpleado.AhorroSemestral());
        System.out.println("Ahorro Anual es : " + objregEmpleado.AhorroAnual());
    }
}
