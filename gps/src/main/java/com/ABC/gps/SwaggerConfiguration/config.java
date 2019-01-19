package com.ABC.gps.SwaggerConfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class config {

        public Docket productApi() {

            return new Docket(DocumentationType.SWAGGER_2)

                    .select().apis(RequestHandlerSelectors.basePackage("com.ABC.controllers"))

                    .paths(regex("/retsgps.*"))

                    .build();

        }

    }
}
