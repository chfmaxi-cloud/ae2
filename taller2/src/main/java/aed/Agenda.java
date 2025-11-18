package aed;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Fecha> agenda = new ArrayList<>();
    private ArrayList<Recordatorio> recordatorios = new ArrayList<>();
    private Fecha fechaActual;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = fechaActual;
        this.agenda.add(fechaActual);
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        recordatorios.add(recordatorio);
    }


    @Override
    public String toString() {
        String recordatorios = "";
        for (int i = 0; i < this.recordatorios.size();i += 1){
            Recordatorio recordatorio = this.recordatorios.get(i);
            Fecha fechaRecordatorio = recordatorio.fecha();
            if ((this.fechaActual.dia == fechaRecordatorio.dia) && (this.fechaActual.mes == fechaRecordatorio.mes)){
                recordatorios = recordatorios + (this.recordatorios.get(i))+ "\n";
            }
            }
        String recordatorioString = this.fechaActual + "\n" + "=====" + "\n" + recordatorios; 
        return recordatorioString;
    }


    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return this.fechaActual;
    }

}