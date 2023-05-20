package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers2() {
        mycustomstring.setString("No Numbers here?");
        assertEquals(0, mycustomstring.countNumbers());
        // Tests what happens when there are no numbers in the string
    }

    @Test (expected = NullPointerException.class)
    public void testCountNumbers3() {
    	mycustomstring.setString(null);
        mycustomstring.countNumbers();
        // Tests for NullPointerException
    }

    @Test
    public void testCountNumbers4() {
    	mycustomstring.setString("Lets check if it's contiguous 69 420 42");
        assertEquals(3, mycustomstring.countNumbers());
        // Tests if the method searches for contiguous numbers
    }

    @Test
    public void testCountNumbers5() {
    	mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
        // Tests what happens when the string is empty
    }

    @Test
    public void testCountNumbers6() {
    	mycustomstring.setString("123456789");
        assertEquals(1, mycustomstring.countNumbers());
        // Tests what happens when the string is all numbers
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString("the weather is nice today");
        assertEquals("h ete snc oa", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test (expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false);
        // Tests for NullPointerException
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
        // Tests for IllegalArguementException
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("the weather is nice today");
        assertEquals("h ete snc oa", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("Print the whole thing");
        assertEquals("Print the whole thing", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("Print the whole thing");
    	mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-4, false);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("oHjEjLoLhO WbOgRgLbD");
        assertEquals("HELLOWORLD", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
        // Contains a Hidden message "HELLOWORLD"
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("DbLgRgObW OhLoLjEjHo");
        assertEquals("DLROWOLLEH", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
        // Contains a Hidden message "HELLOWORLD" spelled backwards in the string to make sure it works in reverse
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("DcbLcgRcgOcbW cOchLcoLcjEcjHco");
    	assertEquals("DLROWOLLEH", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    	// Tests if n changes and spacing changes we should get the same message "HELLOWORLD"
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("ocHjcEjcLocLhcOc WbcOgcRgcLbcD");
    	assertEquals("HELLOWORLD", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    	// Tests if n changes and spacing changes we should get the same message "HELLOWORLD"
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("jWkAhKbAbNgDvA   4gEcVhA");
    	assertEquals("WAKANDA 4EVA", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    	// Shows that every n'th character works with numbers as well
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("AhVcEg4   AvDgNbAbKhAkWj");
    	assertEquals("AVE4 ADNAKAW", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    	// Shows that every n'th character works with numbers as well BACKWARDS
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(5, 2);
        // Tests for IllegalArgumentException higher start point than endpoint
    }

    @Test (expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring3() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(2, 6);
        // Tests for NullPointerException for given conditions 
    }

    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(-1, 6);
        // Tests for MyIndexOutOfBoundsException for given conditions 
    }

    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString("b4N4n4");
        mycustomstring.convertDigitsToNamesInSubstring(1, this.mycustomstring.getString().length()+2);
        // Tests for MyIndexOutOfBoundsException for given conditions
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString("erufne3nkdfvn");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 9);
    	assertEquals("erufneThreenkdfvn", mycustomstring.getString());
    	// Testing Single Digit
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
    	mycustomstring.setString("b4N4n4");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 6);
    	assertEquals("bFourNFournFour", mycustomstring.getString());
        // Testing Multiple Digits
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
    	mycustomstring.setString("My Zip Code is 12345");
    	mycustomstring.convertDigitsToNamesInSubstring(1, 20);
    	assertEquals("My Zip Code is OneTwoThreeFourFive", mycustomstring.getString());
    }

}
