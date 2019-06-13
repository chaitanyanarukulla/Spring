package com.chaiLab11.songr;

import org.junit.Test;

import static org.junit.Assert.*;

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
}