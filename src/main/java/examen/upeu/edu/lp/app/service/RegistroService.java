package examen.upeu.edu.lp.app.service;

import examen.upeu.edu.lp.infraestructure.entity.RegistroEntity;
import examen.upeu.edu.lp.app.repository.*;
import java.util.List;
import java.util.Optional;

public class RegistroService {
    
    private final RegistroRepository registroRepository;

    public RegistroService(RegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }
    
    public List<RegistroEntity> getRegistro(){
        return (List<RegistroEntity>) registroRepository.getRegistro();
    }
    public RegistroEntity saveRegistro(RegistroEntity registroEntity){
        return registroRepository.saveRegistro(registroEntity);
    }
    public Optional<RegistroEntity> getRegistroById(Integer id){
        return registroRepository.getRegistroById(id);
    }
    public boolean deleteRegistroById(Integer id){
        return registroRepository.deleteRegistroById(id);
    }
}
