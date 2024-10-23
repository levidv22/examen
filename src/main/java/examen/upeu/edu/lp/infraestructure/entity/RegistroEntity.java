package examen.upeu.edu.lp.infraestructure.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "registro")
public class RegistroEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreEstudiante;
    private String correoUniversitario;
    private Integer codigoUniversitario;
    private LocalDateTime FechaHora;
    private Double Precio;

    public RegistroEntity() {
    }

    public RegistroEntity(Integer id, String nombreEstudiante, String correoUniversitario, Integer codigoUniversitario, LocalDateTime FechaHora, Double Precio) {
        this.id = id;
        this.nombreEstudiante = nombreEstudiante;
        this.correoUniversitario = correoUniversitario;
        this.codigoUniversitario = codigoUniversitario;
        this.FechaHora = FechaHora;
        this.Precio = Precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCorreoUniversitario() {
        return correoUniversitario;
    }

    public void setCorreoUniversitario(String correoUniversitario) {
        this.correoUniversitario = correoUniversitario;
    }

    public Integer getCodigoUniversitario() {
        return codigoUniversitario;
    }

    public void setCodigoUniversitario(Integer codigoUniversitario) {
        this.codigoUniversitario = codigoUniversitario;
    }

    public LocalDateTime getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(LocalDateTime FechaHora) {
        this.FechaHora = FechaHora;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
    
    
    
    
}
