package examen.upeu.edu.lp.app.service;

import examen.upeu.edu.lp.app.repository.*;
import examen.upeu.edu.lp.infraestructure.entity.*;
import java.util.*;

public class ReservacionService {

    private final ReservacionRepository reservacionRepository;

    public ReservacionService(ReservacionRepository reservacionRepository) {
        this.reservacionRepository = reservacionRepository;
    }

    public List<ReservacionEntity> getReservas() {
        return (List<ReservacionEntity>) reservacionRepository.getReservas();
    }

    public ReservacionEntity saveReserva(ReservacionEntity reserva) {
        if (reserva.getTurno() == Turno.DIA) {
            reserva.setPrecio(reserva.getTiempoUso() * 40.0); // 40 soles por cada unidad de tiempo para el turno DIA
        } else if (reserva.getTurno() == Turno.NOCHE) {
            reserva.setPrecio(reserva.getTiempoUso() * 80.0); // 80 soles por cada unidad de tiempo para el turno NOCHE
        }
        return reservacionRepository.saveReserva(reserva);
    }

    public Optional<ReservacionEntity> getReservaById(Integer id) {
        return reservacionRepository.getReservaById(id);
    }

    public boolean deleteReserva(Integer id) {
        return reservacionRepository.deleteReserva(id);
    }
}
