package com.bhaskar;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppTest {

    @Test
    public void testHelloWorld() {
        App app = new App();
        assertNotNull(app);
    }

    @Test
    public void testGetFormattedCurrentDate() {
        String formattedDate = App.getFormattedCurrentDate();
        assertNotNull(formattedDate);
    }

    @Test
    public void testGetHostname() {
        String hostname = App.getHostname();
        assertNotNull(hostname);
    }
}

