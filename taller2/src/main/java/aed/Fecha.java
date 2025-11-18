package aed;

public class Fecha {

    int dia;
    int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
    }

    public Integer dia() {
        return this.dia;
    }


    public Integer mes() {
        return this.mes;
    }

    public String toString() {
        return this.dia + "/" + this.mes; 
    }

   
    @Override
    public boolean equals(Object otra) {
        if(otra == null || otra.getClass() != this.getClass()) return false;
        Fecha otraCast = (Fecha) otra;
        return
        this.dia().equals(otraCast.dia) &&
        this.mes().equals(otraCast.mes);
    }

    

    public void incrementarDia() {
        int _dia = dia;
        int _mes = mes;
        int ultimoDiaMes = diasEnMes(_mes);
        if (_dia < ultimoDiaMes){
            dia += 1;
        }
        else if ((_mes <= 12) && (_dia <= 30)) {
            dia = 1;
            mes += 1;
        }
        else {
            dia = 1;
            mes = 1;
        }
        
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
