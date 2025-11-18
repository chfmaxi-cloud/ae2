package aed;

public class Horario {
    int hora;
    int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        return hora + ":" + minutos;
    }

    @Override
    public boolean equals(Object otro) {
        if (otro == null || otro.getClass() != this.getClass()) return false;
        Horario otroHorario = (Horario) otro;
        return otroHorario.hora == this.hora && 
        otroHorario.minutos == this.minutos;
    }

}
