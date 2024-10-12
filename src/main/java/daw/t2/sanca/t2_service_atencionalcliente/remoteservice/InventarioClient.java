package daw.t2.sanca.t2_service_atencionalcliente.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "app-service-inventario", url = "http://localhost:8081")
public interface InventarioClient {
    @GetMapping("/inventario/disponibilidad/{id}")
    String verificarDisponibilidad(@PathVariable Long id);
}