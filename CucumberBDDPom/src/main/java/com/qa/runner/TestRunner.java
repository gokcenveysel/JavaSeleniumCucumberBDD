package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:/Users/vgokcen/workspace/CucumberBDDPom/src/main/java/com/qa/features/beinsport.features",
		glue={"com/qa/stepDefinitions"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		
		)

public class TestRunner {

}
