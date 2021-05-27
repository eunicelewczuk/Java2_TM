package practica;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente(){
        saldo = 0;
    }

    public CuentaCorriente(double saldo){
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente c){
        this.saldo = c.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double dinero){
        this.saldo += dinero;
    }

    public void egreso(double dinero){
        this.saldo -= dinero;
    }

    public void reintegro(double dinero){
        this.saldo -= dinero;
    }

    //This le transfiere a otraCuenta
    public void transferencia(CuentaCorriente otraCuenta, double dinero){
        this.saldo -= dinero;
        otraCuenta.saldo += dinero;
    }
}
