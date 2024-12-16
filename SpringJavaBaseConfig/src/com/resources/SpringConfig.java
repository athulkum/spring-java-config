package com.resources;

import com.model.ArchonSolution;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean //bean is used to create a bean (object)
    public ArchonSolution createObj(){

        ArchonSolution archonSolution = new ArchonSolution();
        archonSolution.setName("Athul Kumar");
        archonSolution.setBehaviour("good");
        archonSolution.setStatus("java Developer");

        return archonSolution;

    }
}
