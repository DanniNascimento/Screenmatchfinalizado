//package br.com.alura.screenmatch;

//import br.com.alura.screenmatch.Principal.Principal;
//import br.com.alura.screenmatch.repositorio.SerieRepositorio;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class ScreenmatchApplicationSemWeb implements CommandLineRunner {
//	@Autowired
//	private SerieRepositorio repositorio;

//	public static void main(String[] args) {
//		SpringApplication.run(ScreenmatchApplicationSemWeb.class, args);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(repositorio);
//		principal.exibeMenu();
//	}
//}