package jsges.nails.Model.articulos;

import jakarta.persistence.*;
import jsges.nails.DTO.articulos.LineaDTO;
import jsges.nails.Model.TipoObjeto;
import lombok.ToString;

@Entity
@ToString
public class Linea extends TipoObjeto {
    public Linea() {
        // Constructor por defecto necesario para JPA
    }

    public Linea(String nombre) {
        this.setDenominacion(nombre);
    }

    public Linea(LineaDTO model) {
        this.setDenominacion(model.denominacion);

    }
}