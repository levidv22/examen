package examen.upeu.edu.lp.app.repository;

import examen.upeu.edu.lp.infraestructure.entity.*;
import java.util.*;

public interface ReservacionRepository {
    public List<ReservacionEntity> getReservas();
    public ReservacionEntity saveReserva(ReservacionEntity reserva);
    public Optional<ReservacionEntity> getReservaById(Integer id);
    public boolean deleteReserva(Integer id);
}
