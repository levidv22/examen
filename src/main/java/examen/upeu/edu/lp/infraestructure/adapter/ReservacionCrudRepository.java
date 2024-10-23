package examen.upeu.edu.lp.infraestructure.adapter;

import examen.upeu.edu.lp.infraestructure.entity.*;
import java.util.*;
import org.springframework.data.repository.*;

public interface ReservacionCrudRepository extends CrudRepository<ReservacionEntity, Integer>{
    List<ReservacionEntity> findByEstado(EstadoReserva estado);
    List<ReservacionEntity> findByTurno(Turno turno);
}
