package main;

import static org.junit.Assert.*;
import org.junit.*;

public class TestUser {
	
	public user testuser;
	
	@Before
	
	public void teststart() {
		testuser = new user();
		testuser.kuhnya.doClick();
		testuser.textField.setText("0");
		}
	
	@Test
	
	public void testprise() {
		String argument="10017";
		String rezult = raschet.PRISE(testuser.textField.getText(), testuser.tip, 16, testuser.but[6]);
		testuser.textField.setText(raschet.PRISE(testuser.textField.getText(), testuser.tip, 16, testuser.but[6]));
		rezult = raschet.PRISE(testuser.textField.getText(), testuser.tip, 18, 0);
		assertEquals(argument,rezult);
		}
	
	@After
	
	public void teststop(){
		testuser = null;
		}
	
	}