package examen.upeu.edu.lp.infraestructure.entity;

import jakarta.persistence.*;
import java.time.*;

@Entity
@Table(name = "reservation")
public class ReservacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String usuario;
    private LocalDateTime fechaHoraReserva;
    private Integer tiempoUso;
    private String responsable;
    private Double precio;

    @Enumerated(EnumType.STRING)
    private EstadoReserva estado;

    @Enumerated(EnumType.STRING)
    private Turno turno;

    public ReservacionEntity() {
    }

    public ReservacionEntity(Integer id, String usuario, LocalDateTime fechaHoraReserva, Integer tiempoUso, String responsable, EstadoReserva estado, Turno turno) {
        this.id = id;
        this.usuario = usuario;
        this.fechaHoraReserva = fechaHoraReserva;
        this.tiempoUso = tiempoUso;
        this.responsable = responsable;
        this.estado = estado;
        this.turno = turno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(LocalDateTime fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public Integer getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(Integer tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
