package com.jaysef.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
//		plugin = {"pretty", "html:target/cucumber"},
		plugin = "com.jaysef.test.CustomFormatter:target/cucumber-report.json"
//		plugin = {"pretty", "html:target/cucumber"},
//		monochrome = true
//		dryRun = true
		)
public class MyRunner {

}
