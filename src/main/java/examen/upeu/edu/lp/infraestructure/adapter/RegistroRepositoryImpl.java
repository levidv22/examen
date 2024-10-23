package examen.upeu.edu.lp.infraestructure.adapter;

import org.springframework.stereotype.Repository;
import examen.upeu.edu.lp.app.repository.*;
import examen.upeu.edu.lp.infraestructure.entity.RegistroEntity;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class RegistroRepositoryImpl implements RegistroRepository {

    private final RegistroCrudRepository registroCrudRepository;

    
    public RegistroRepositoryImpl(RegistroCrudRepository registroCrudRepository) {
        this.registroCrudRepository = registroCrudRepository;
    }

    @Override
    public List<RegistroEntity> getRegistro() {
        return (List<RegistroEntity>) registroCrudRepository.findAll();
    }

    @Override
    public RegistroEntity saveRegistro(RegistroEntity registroEntity) {
        return registroCrudRepository.save(registroEntity);
    }

    @Override
    public Optional<RegistroEntity> getRegistroById(Integer id) {
        return registroCrudRepository.findById(id);
    }

    @Override
    @Transactional
    public boolean deleteRegistroById(Integer id) {
        registroCrudRepository.deleteById(id);
        return true;
    }
}
