package ru.checkdev.notification;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class NtfSrvTest extends TestCase {

    public NtfSrvTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(NtfSrvTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }
}
