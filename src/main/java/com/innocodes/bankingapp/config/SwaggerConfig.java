package com.innocodes.bankingapp.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI customizeOpenApi(){
        final String securitySchemaName = "bearerAuth";
        return new OpenAPI()
                .info(new Info()
                        .title("E-Commerce App API")
                        .version("1.1")
                        .description("E-Commerce App API Documentation")
                )
                .addSecurityItem(new SecurityRequirement().addList(securitySchemaName))
                .components(new Components());
    }

}
