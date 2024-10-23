package examen.upeu.edu.lp.infraestructure.adapter;

import examen.upeu.edu.lp.app.repository.*;
import examen.upeu.edu.lp.infraestructure.entity.*;
import jakarta.transaction.*;
import java.util.*;
import java.util.Optional;
import org.springframework.stereotype.*;

@Repository
public class ReservacionRepositoryImpl implements ReservacionRepository {

    private final ReservacionCrudRepository reservacionCrudRepository;

    public ReservacionRepositoryImpl(ReservacionCrudRepository reservacionCrudRepository) {
        this.reservacionCrudRepository = reservacionCrudRepository;
    }

    @Override
    public List<ReservacionEntity> getReservas() {
        return (List<ReservacionEntity>) reservacionCrudRepository.findAll();
    }

    @Override
    public ReservacionEntity saveReserva(ReservacionEntity reserva) {
        return reservacionCrudRepository.save(reserva);
    }

    @Override
    public Optional<ReservacionEntity> getReservaById(Integer id) {
        return reservacionCrudRepository.findById(id);
    }

    @Override
    @Transactional
    public boolean deleteReserva(Integer id) {
        reservacionCrudRepository.deleteById(id);
        return true;
    }
}
