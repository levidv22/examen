package examen.upeu.edu.lp.infraestructure.configuration;

import examen.upeu.edu.lp.app.service.RegistroService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public RegistroService registroService (RegistroRepository registroRepository){
        return new RegistroService(registroRepository);
    }
}
