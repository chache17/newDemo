package com.newDemo.features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by miguel.coca on 5/19/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/java/com/newDemo/features",
        glue={"com.newDemo.features.steps"})
public class RunCucumberFeatures {
}
