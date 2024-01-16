package com.trantorinc.wellnesstracker;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication(
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
    basePackages = {"com.trantorinc.wellnesstracker" , "org.openapitools.configuration"},
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class WellnessTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WellnessTrackerApplication.class, args);
    }

    @Bean(name = "com.trantorinc.wellnesstracker.OpenApiGeneratorApplication.jsonNullableModule")
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}