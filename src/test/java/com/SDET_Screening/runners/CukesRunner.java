package com.SDET_Screening.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features/",
        glue = "com/SDET_Screening/step_definitions/",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}
