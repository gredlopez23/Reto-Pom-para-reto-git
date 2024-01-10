package com.alkomprar.runner;
/*
 * @(#) Runner.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/",
        tags = "@RegistroExitoso",
        glue = "com.alkomprar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
