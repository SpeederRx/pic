package br.com.pic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PicApp {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PicApp.class, args);
		System.out.println("************** Sistema Inicializado com Sucesso! ***************");
	}

}
