package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/main/java/com/features/login.feature",
glue="com.stepdef",
dryRun=false,
monochrome=true,
plugin={"html:target"}
//tags="@pawan"


)
public class TestRunner {

	

	
}
