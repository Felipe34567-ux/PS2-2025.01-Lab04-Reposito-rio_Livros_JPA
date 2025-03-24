package br.felipe.acervo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.felipe.aplicacao.ConsoleApp;

@SpringBootApplication
public class  AcervoApplication implements CommandLineRunner {
    @Autowired
    private ConsoleApp consoleApp;

    public static void main(String[] args) {
        SpringApplication.run(AcervoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        consoleApp.iniciar();
    }
}