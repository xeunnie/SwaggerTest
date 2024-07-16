package org.example.swaager.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import static java.lang.ProcessHandleImpl.Info.info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().components(new Components()).info(info());
    }

    private Info info() {
        return new Info().title("my web").description("good").version("1.0.0");
    }
}
