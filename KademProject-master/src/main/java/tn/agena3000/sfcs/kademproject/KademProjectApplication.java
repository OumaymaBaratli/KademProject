package tn.agena3000.sfcs.kademproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.agena3000.sfcs.kademproject.entities.Universite;

@SpringBootApplication
public class KademProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(KademProjectApplication.class, args);
        Universite uni = Universite.builder()
                .nomUniv("Esprit")
                .build();
    }

}
