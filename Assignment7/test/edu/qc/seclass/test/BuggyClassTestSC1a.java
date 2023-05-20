package edu.qc.seclass.test;

import edu.qc.seclass.BuggyClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestSC1a {

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
    public void buggyMethod1() {
        assertEquals(1, myBuggyClass.buggyMethod1(2, 1));
    }
}