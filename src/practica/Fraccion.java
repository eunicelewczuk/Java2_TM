package practica;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int n, int d){
        this.setNumerador(n);
        this.setDenominador(d);
    }

    public static Fraccion sumar(Fraccion f, Fraccion g){
        int nn = f.numerador * g.denominador + g.numerador * f.denominador;
        int nd = f.denominador * g.denominador;

        Fraccion x = new Fraccion(nn, nd);
        x.simplificar();
        return x;
    }

    public static Fraccion restar(Fraccion f, Fraccion g){
        int nn = f.numerador * g.denominador - g.numerador * f.denominador;
        int nd = f.denominador * g.denominador;

        Fraccion x = new Fraccion(nn, nd);
        x.simplificar();
        return x;
    }

    public static Fraccion multiplicar(Fraccion f, Fraccion g){
        int nn = f.numerador * g.numerador;
        int nd = f.denominador * g.denominador;

        Fraccion x = new Fraccion(nn, nd);
        x.simplificar();
        return x;
    }

    public static Fraccion dividir(Fraccion f, Fraccion g){
        int nn = f.numerador * g.denominador;
        int nd = f.denominador * g.numerador;

        Fraccion x = new Fraccion(nn, nd);
        x.simplificar();
        return x;
    }

    public static Fraccion sumar(Fraccion f, int numero){
        Fraccion g = new Fraccion(numero, 1);
        return sumar(f, g);
    }

    public static Fraccion restar(Fraccion f, int numero){
        Fraccion g = new Fraccion(numero, 1);
        return restar(f, g);
    }

    public static Fraccion multiplicar(Fraccion f, int numero){
        Fraccion g = new Fraccion(numero, 1);
        return multiplicar(f, g);
    }

    public static Fraccion dividir(Fraccion f, int numero){
        Fraccion g = new Fraccion(numero, 1);
        return dividir(f, g);
    }

    public void simplificar()
    {
        int i=2;
        while( i<=numerador && i<=denominador )
        {
            if( numerador%i==0 && denominador%i==0 )
            {
                numerador = numerador/i;
                denominador = denominador/i;
            }
            else
            {
                i++;
            }
        }
    }

    public void imprimir()
    {
        System.out.println(numerador+"/"+denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
