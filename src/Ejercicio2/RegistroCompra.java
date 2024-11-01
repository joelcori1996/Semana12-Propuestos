package Ejercicio2;
public class RegistroCompra {

    private double Compra1;
    private double Compra2;
    private double Compra3;
    private double Compra4;

    public RegistroCompra(double xcompra1, double xcompra2, double xcompra3, double xcompra4) {
        this.Compra1 = xcompra1;
        this.Compra2 = xcompra2;
        this.Compra3 = xcompra3;
        this.Compra4 = xcompra4;
    }

    public double Total() {
        return (this.Compra1 + this.Compra2 + this.Compra3 + this.Compra4);
    }

    public double Promedio() {
        return ((this.Compra1 + this.Compra2 + this.Compra3 + this.Compra4) / 4);
    }

    public double Mayor() {
        double xmayor;
        xmayor = this.Compra1;
        if (this.Compra2 > xmayor) {
            xmayor = this.Compra2;
        }
        if (this.Compra3 > xmayor) {
            xmayor = this.Compra3;
        }
        if (this.Compra4 > xmayor) {
            xmayor = this.Compra4;
        }
        return (xmayor);
    }

    public double Menor() {
        double xmenor;
        xmenor = this.Compra1;
        if (this.Compra2 < xmenor) {
            xmenor = this.Compra2;
        }
        if (this.Compra3 < xmenor) {
            xmenor = this.Compra3;
        }
        if (this.Compra4 < xmenor) {
            xmenor = this.Compra4;
        }
        return (xmenor);
    }
}
