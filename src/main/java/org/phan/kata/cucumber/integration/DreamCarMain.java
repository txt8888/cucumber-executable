package org.phan.kata.cucumber.integration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

/**
 * Created by tcp on 09/14/2019.
 */
@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:report/cucumber-html", "json:report/cucumber.json" },
                 features = { "classpath:features" })
public class DreamCarMain {
    public static void main(String[] args) {
        JUnitCore.main(DreamCarMain.class.getCanonicalName());
    }
}
