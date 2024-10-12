package daw.t2.sanca.t2_service_atencionalcliente.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "app-service-ventas", url = "http://localhost:8082")
public interface VentasClient {
    @GetMapping("/ventas/historial/{clienteId}")
    String obtenerHistorialVentas(@PathVariable Long clienteId);
}