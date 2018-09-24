package com.poc.micro1.cucumber.stepdefs;

import com.poc.micro1.MyFirstApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyFirstApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
