package br.com.infob.controle_epi.controle_epi.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Controle de EPI API",
        version = "1.0",
        description = "API para o sistema de controle de EPI"
    )
)
public class Swagger {
    
}
