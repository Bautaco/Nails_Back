package jsges.nails.Model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Eliminables {
    public final int ESTADO_ACTIVO = 0;
    public final int ESTADO_ELIMINADO = 1;

    @Column(columnDefinition = "INTEGER", nullable = false)
    private int estado = 0;

    public Eliminables() {
        this.estado = ESTADO_ACTIVO;
    }

    public Eliminables(int estado) {
        this.setEstado(estado);
    }

    public void asEliminado() {
        this.estado = ESTADO_ELIMINADO;
    }

    public void setEstado(int estado) {
        if (estado != ESTADO_ACTIVO && estado != ESTADO_ELIMINADO) {
            throw new IllegalArgumentException("El estado solo puede ser 0 (activo) o 1 (eliminado).");
        }
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
    
    public String getEstadoString() {
        return this.estado == 0 ? "Activo" : "Eliminado";
    }
}
