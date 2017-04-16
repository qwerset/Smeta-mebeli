package main;

import static org.junit.Assert.*;
import org.junit.*;

public class TestOboz {
	
	public oboz testoboz;
	
	@Before
	
	public void teststart() {
		testoboz = new oboz();
		testoboz.vannaya.doClick();
		testoboz.textField.setText("100000");	
		}
	
	@Test
	
	public void testprise() {
		String argument="115646";
		String rezult = raschet.PRISE(testoboz.textField.getText(), testoboz.tip, 7, testoboz.but[3]);
		assertEquals(argument,rezult);
		}
	
	@After
	
	public void teststop(){
		testoboz = null;
		}
	}