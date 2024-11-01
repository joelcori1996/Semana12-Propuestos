/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author PRV
 */
public class Empleado {
    
    private double IngresoMensual;
    private double OtrosIngresos;
    private double GastoMensual;
    public Empleado(double xIngresoMensual, double xOtrosIngresos, double xGastoMensual)
    {
        this.IngresoMensual = xIngresoMensual;
             this.OtrosIngresos = xOtrosIngresos;
             this.GastoMensual = xGastoMensual;
                    
    }
    
    public double AhorroMensual()
    {
        double xAhorroMensual;
        xAhorroMensual = (this.IngresoMensual + this.OtrosIngresos) - this.GastoMensual;
        return(xAhorroMensual);
    }
    
     public double AhorroSemestral()
    {
        double xAhorroSemestral;
        xAhorroSemestral = ((this.IngresoMensual*6) + (this.OtrosIngresos*6)) - (this.GastoMensual*6);
        return(xAhorroSemestral);
    }
          public double AhorroAnual()
    {
        double xAhorroAnual;
        xAhorroAnual = ((this.IngresoMensual*12) + (this.OtrosIngresos*12)) - (this.GastoMensual*12);
        return(xAhorroAnual);
    }
     
}
