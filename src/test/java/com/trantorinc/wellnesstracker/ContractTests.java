package com.trantorinc.wellnesstracker;

import in.specmatic.test.SpecmaticJUnitSupport;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.Objects;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ContractTests extends SpecmaticJUnitSupport {
    @BeforeAll
    public static void setUp() {
        String resourcePath = "openapi.yaml";
        File apiContract = new File(Objects.requireNonNull(ContractTests.class.getClassLoader().getResource(resourcePath)).getFile());
        System.setProperty("contractPaths", apiContract.getAbsolutePath());
        System.setProperty("host", "localhost");
        System.setProperty("port", "8080");
    }
}