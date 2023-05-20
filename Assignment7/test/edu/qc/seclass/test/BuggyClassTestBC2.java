package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestBC2 {
    BuggyClass myBuggyClass;
    @Before
    public void setUp() throws Exception {
        myBuggyClass= new BuggyClass();
    }

    @After
    public void tearDown() throws Exception {
        myBuggyClass = null;
    }

    @Test
    public void buggyMethod2() {
        assertEquals(5, myBuggyClass.buggyMethod2(2, 6));
    }
}