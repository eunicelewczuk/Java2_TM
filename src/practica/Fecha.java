package practica;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    public GregorianCalendar fecha;

    public Fecha(){
        this.fecha = new GregorianCalendar();
    }

    public Fecha(int año, int mes, int dia){
        this.fecha = new GregorianCalendar(año, mes, dia);
    }

    public void sumarUnDia(){
        this.fecha.add(Calendar.DAY_OF_MONTH, 1);
    }

    @Override
    public String toString(){
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int año = fecha.get(Calendar.YEAR);
        return dia+"/"+mes+"/"+año;
    }

    public int getAño() {
        return this.fecha.get(Calendar.YEAR);
    }

    public int getMes() {
        return this.fecha.get(Calendar.MONTH);
    }

    public int getDia() {
        return this.fecha.get(Calendar.DAY_OF_MONTH);
    }

    public void setFecha(int año, int mes, int dia) {
        this.fecha.set(año, mes, dia);
    }
}
