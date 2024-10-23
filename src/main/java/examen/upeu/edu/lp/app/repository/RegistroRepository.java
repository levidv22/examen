import examen.upeu.edu.lp.infraestructure.entity.RegistroEntity;
import java.util.List;
import java.util.Optional;

public interface RegistroRepository {
    public List<RegistroEntity> getRegistro();
    public RegistroEntity saveRegistro(RegistroEntity registroEntity);
    public Optional<RegistroEntity> getRegistroById(Integer id);
    public boolean deleteRegistroById(Integer id);
}
