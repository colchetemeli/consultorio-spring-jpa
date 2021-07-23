package br.com.meli.consultorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class ConsultorioApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ConsultorioApplication.class, args);
    }
}
