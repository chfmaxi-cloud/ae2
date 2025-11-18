package aed;
import java.util.ArrayList;

class ArregloRedimensionableDeRecordatorios {
    private ArrayList<Recordatorio> listaRecordatorios = new ArrayList<>();

    public ArregloRedimensionableDeRecordatorios() {
        this.listaRecordatorios = new ArrayList<>(listaRecordatorios);
    }

    public int longitud() {
        return this.listaRecordatorios.size();
    }

    public void agregarAtras(Recordatorio i) {
        this.listaRecordatorios.add(i);
    }

    public Recordatorio obtener(int i) {
        return this.listaRecordatorios.get(i);
    }

    public void quitarAtras() {
        this.listaRecordatorios.remove(longitud()-1);
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.listaRecordatorios.set(indice,valor);
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.listaRecordatorios = listaRecordatorios;
        }


    public ArregloRedimensionableDeRecordatorios copiar() {
        return null;
    }
}

