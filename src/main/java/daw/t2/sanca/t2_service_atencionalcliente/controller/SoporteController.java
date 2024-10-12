package daw.t2.sanca.t2_service_atencionalcliente.controller;

import daw.t2.sanca.t2_service_atencionalcliente.remoteservice.InventarioClient;
import daw.t2.sanca.t2_service_atencionalcliente.remoteservice.VentasClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/soporte")
public class SoporteController {

    private final VentasClient ventasClient;
    private final InventarioClient inventarioClient;

    @PostMapping("/ticket")
    public String crearTicket(@RequestParam Long clienteId, @RequestParam String descripcion) {
        String historial = ventasClient.obtenerHistorialVentas(clienteId);
        return "Ticket creado para cliente " + clienteId + ". Historial: " + historial;
    }

    @GetMapping("/consultar-disponibilidad/{autoId}")
    public String consultarDisponibilidad(@PathVariable Long autoId) {
        return inventarioClient.verificarDisponibilidad(autoId);
    }
}