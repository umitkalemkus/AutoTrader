package com.autotrader.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //tags ="",
        features = {"@target/rerun.txt"},
        glue="src/test/java/com/autotrader/pages/Hook",
        plugin = {"html:target/rerun-default-cucumber-reports",
                "json:target/cucumber.json",}




)







public class FailedRunner {
}
