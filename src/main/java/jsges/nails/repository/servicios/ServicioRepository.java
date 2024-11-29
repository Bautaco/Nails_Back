package jsges.nails.repository.servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jsges.nails.Model.servicios.Servicio;

import java.util.List;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

    @Query("select p from Servicio p  where p.estado=0 ")
    List<Servicio> buscarNoEliminados();



    @Query("SELECT p FROM Servicio p WHERE p.estado = 0 ")
    List<Servicio> buscarExacto();

    @Query("SELECT p FROM Servicio p WHERE p.estado = 0")
    List<Servicio> buscarNoEliminados(@Param("consulta") String consulta);

}

