package examen.upeu.edu.lp.infraestructure.controller;

import examen.upeu.edu.lp.app.service.*;
import examen.upeu.edu.lp.infraestructure.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservacion")
public class ReservacionController {

    private final ReservacionService reservacionService;

    public ReservacionController(ReservacionService reservacionService) {
        this.reservacionService = reservacionService;
    }

    @GetMapping("/show")
    public String showReservas(Model model) {
        List<ReservacionEntity> reservaciones = reservacionService.getReservas();
        model.addAttribute("reservaciones", reservaciones);
        Collections.reverse(reservaciones);
        return "show";
    }

    @GetMapping("/view/{id}")
    public String getReservationById(@PathVariable Integer id, Model model) {
        Optional<ReservacionEntity> reservacionOptional = reservacionService.getReservaById(id);

        if (reservacionOptional.isPresent()) {
            ReservacionEntity reservacion = reservacionOptional.get();
            model.addAttribute("reservacion", reservacion);
            return "view"; // Redirecciona a la vista "view_reservacion.html"
        } else {
            return "error/404"; // O redirige a una página de error si la reserva no existe
        }
    }

    @GetMapping("/create")
    public String Reserva(Model model) {
        model.addAttribute("reserva", new ReservacionEntity());
        return "create";
    }

    @PostMapping("/create")
    public String saveReserva(@ModelAttribute ReservacionEntity reserva) {
        reservacionService.saveReserva(reserva);
        return "redirect:/reservacion/show";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        ReservacionEntity reserva = reservacionService.getReservaById(id).orElseThrow(() -> new IllegalArgumentException("ID no válido:" + id));
        model.addAttribute("reserva", reserva);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String eliminarReserva(@PathVariable Integer id) {
        reservacionService.deleteReserva(id);
        return "redirect:/reservacion/show";
    }
}
