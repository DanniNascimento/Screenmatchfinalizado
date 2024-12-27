package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Principal.Principal;
import br.com.alura.screenmatch.repositorio.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}
}