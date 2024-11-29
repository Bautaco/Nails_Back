package jsges.nails.mappers;

import org.springframework.http.ResponseEntity;

import jsges.nails.DTO.articulos.ArticuloVentaDTO;
import jsges.nails.DTO.articulos.LineaDTO;
import jsges.nails.Model.articulos.ArticuloVenta;
import jsges.nails.Model.articulos.Linea;

public abstract class ArticuloMapper {

    public static ArticuloVentaDTO toDTO(ArticuloVenta articuloVenta) {
        ArticuloVentaDTO articuloVentaDTO = new ArticuloVentaDTO(articuloVenta);
        return articuloVentaDTO;
    }

    public static ArticuloVenta toEntity(ArticuloVentaDTO articuloVentaDTO, ResponseEntity<LineaDTO> linea) {
        ArticuloVenta articuloVenta = new ArticuloVenta();
        articuloVenta.setId(articuloVentaDTO.id);
        articuloVenta.setDenominacion(articuloVentaDTO.denominacion);
        articuloVenta.setLinea(linea);
        return articuloVenta;
    }

    public static ArticuloVenta toEntity(ArticuloVentaDTO model, Linea linea) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toEntity'");
    }
}