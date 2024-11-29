package jsges.nails.DTO.articulos;

import javax.sound.sampled.Line;

import jsges.nails.DTO.TipoObjetoDTO;

public class LineaDTO extends TipoObjetoDTO {

    public LineaDTO() {
       super();
    }

    public LineaDTO(Line linea) {
        this.id= ((TipoObjetoDTO) linea).getId();
        this.denominacion= ((TipoObjetoDTO) linea).getDenominacion();
    }
}