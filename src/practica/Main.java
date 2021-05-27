package practica;

public class Main {

    public static void main(String[] args) {
        Fraccion f = new Fraccion(7,8);
        Fraccion g = new Fraccion(2,3);
        Fraccion.sumar(f, g).imprimir();

        int numero = 15;
        Fraccion.dividir(f, numero).imprimir();

        Fecha fecha = new Fecha(2018,5,6);
        System.out.println(fecha);
        fecha.sumarUnDia();
        System.out.println(fecha);

        //Pruebo rpad
        System.out.println(StringUtil.rpad("5",3,'0'));

        //Pruebo ltrim
        System.out.println(StringUtil.ltrim("   hola todo bien"));

        //Pruebo rtrim
        System.out.println(StringUtil.rtrim("hola  "));

        //Pruebo trim
        System.out.println(StringUtil.trim("  chau  "));
    }
}
