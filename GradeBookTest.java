/*
 * Class: CMSC203 CRN 25800
 * Instructor: Greg Grinberg
 * Description: A program that takes in grades, gives a final grade, the highest grade, and lowest grade.
 * Due: 10/11/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Sereen Sultana_
*/

package homework;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
GradeBook g1;
GradeBook g2;
	@Before
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(80.0);
		g1.addScore(90.0);
		
		g2.addScore(80.0);
		g2.addScore(60.0);
	}
	

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertEquals(2.0,g1.getScoreSize(), 0.01);
		assertTrue(g1.toString().equals("80.0 90.0"));
		assertEquals(2.0,g2.getScoreSize(), 0.01);
		assertTrue(g2.toString().equals("80.0 60.0"));
		//fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		assertEquals(170.0, g1.sum(),0.1); //Addition of all the grades in the g1 instance
		assertEquals(140.0,g2.sum(),0.1); //Addition of all the grades in the g2 instance
		//fail("Not yet implemented");
	}

	@Test
	public void testMinimum() {
		assertEquals(80.0,g1.minimum(),0.1); //Returns the lowest grade in g1 instance
		assertEquals(60.0,g2.minimum(),0.1); //Returns the lowest grade in g2 instance
		//fail("Not yet implemented");
	}

	@Test
	public void testFinalScore() {
		assertEquals(90.0,g1.finalScore(),0.1);
		assertEquals(80.0,g2.finalScore(),0.1);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}

}
