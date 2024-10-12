package daw.t2.sanca.t2_service_atencionalcliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T2ServiceAtencionalclienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(T2ServiceAtencionalclienteApplication.class, args);
	}

}
