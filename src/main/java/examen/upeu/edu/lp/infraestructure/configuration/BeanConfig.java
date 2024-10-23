package examen.upeu.edu.lp.infraestructure.configuration;

import examen.upeu.edu.lp.app.repository.*;
import examen.upeu.edu.lp.app.service.*;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {
    @Bean
    public ReservacionService reservarService (ReservacionRepository reservacionRepository){
        return new ReservacionService(reservacionRepository);
    }
}
