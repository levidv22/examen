package examen.upeu.edu.lp.infraestructure.adapter;

import examen.upeu.edu.lp.infraestructure.entity.RegistroEntity;
import org.springframework.data.repository.CrudRepository;

public interface RegistroCrudRepository extends CrudRepository<RegistroEntity, Integer>{
   
}
