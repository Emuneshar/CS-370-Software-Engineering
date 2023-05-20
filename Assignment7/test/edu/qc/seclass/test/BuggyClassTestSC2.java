package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestSC2 {
    BuggyClass myBuggyClass;
    @Before
    public void setUp(){
        myBuggyClass= new BuggyClass();
    }

    @After
    public void tearDown(){
        myBuggyClass = null;
    }

    @Test
    public void buggyMethod2() {
        assertEquals(2, myBuggyClass.buggyMethod2(2, 1));
    }
}