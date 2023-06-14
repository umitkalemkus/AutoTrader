package com.autotrader.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        tags ="@unit_test",
        features = "src/test/resources/features",
        glue={"stepdefinitions", "Hook"},
        dryRun = false,
        plugin = {"html:target/default-cucumber-reports",
                    "json:target/cucumber.json",
        "rerun:target/rerun.txt"}




)





public class RunnerClass {







}
