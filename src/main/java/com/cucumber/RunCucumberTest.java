package com.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",publish = true, plugin = { "json:target/cucumber.json", "pretty",
        "html:target/cucumber-reports" })
public class RunCucumberTest{
}