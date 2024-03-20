package br.com.cbf.campeonatobrasileiro;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Campeonato Brasileiro Digital")
                        .description("API projeto campeonato brasileiro digital")
                        .version("1.0")
                        .termsOfService("https://www.facebook.com/angelinha.nunes.3")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")
                        )
                ).externalDocs(
                        new ExternalDocumentation()
                                .description("Criador - Mauricio Andreotti")
                                .url("https://www.linkedin.com/in/mauricio-andreotti/"));
    }

}
