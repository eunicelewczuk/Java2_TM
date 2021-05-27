package practica;

public class Contador {
    private int cont;

    public Contador(){
        this.cont = 0;
    }

    public Contador(int numero){
        this.cont = numero;
    }

    public Contador(Contador otroContador){
        this.cont = otroContador.getCont();
    }

    public void incrementar(int cant){
        this.cont += cant;
    }

    public void decrementar(int cant){
        this.cont -= cant;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
