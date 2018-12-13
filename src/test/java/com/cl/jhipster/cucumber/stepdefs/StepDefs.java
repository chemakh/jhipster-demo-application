package com.cl.jhipster.cucumber.stepdefs;

import com.cl.jhipster.JhipsterDemApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterDemApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
