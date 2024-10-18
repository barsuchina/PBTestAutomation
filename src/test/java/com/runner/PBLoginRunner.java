package com.runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber.json",
		},

		features = { "src/test/resources/ParabankLogin.feature"},
		glue = { "com.stepdef" }, // package name of step definition
		monochrome = true, //remove all ?? & console will be easily readable
dryRun = true, //check feature file
strict = true //check stepdef
		// ,tags= {"@smoke" "@regression"}
)
        
public class PBLoginRunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void setup() {
		// code
	}

}
