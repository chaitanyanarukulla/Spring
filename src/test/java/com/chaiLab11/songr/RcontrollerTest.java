package com.chaiLab11.songr;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RcontrollerTest {

    @Test
    public void getcapitalize() {
        Rcontroller classUndertest = new Rcontroller();
        String output = "CHAIT";
        assertEquals(output,classUndertest.getcapitalize("chait"));
    }

    @Test
    public void test_reverse() {
        Rcontroller classUndertest = new Rcontroller();
        String output = "world hello ";
        assertEquals(output,classUndertest.reverse("hello world"));

    }

    @Autowired
    Rcontroller RController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test_ControllerIsAutowired() {
        assertNotNull(RController);
    }

    @Test
    public void test_RequestToRootGives_HelloWorld() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(content().string(containsString("Hello, world! It's a beautiful day!")));
    }
    @Test
    public void test_RequestToRoot_Reverse() throws Exception {
        mockMvc.perform(get("/reverse?sentance=hello world")).andExpect(content().string(containsString("world hello ")));
    }

    @Test
    public void test_RequestToRoot_capitalize() throws Exception {
        mockMvc.perform(get("/capitalize/its friday")).andExpect(content().string(containsString("ITS FRIDAY")));
    }
}