﻿// указание основного пакета данных
package main;

//импортирование класса для выполнения тестов 
import static org.junit.Assert.*;
//импортирование класса для использования аннотаций
import org.junit.*;

//создание класса для тестирования панели пользователя, доступный из любого места проекта
public class TestUser {
	
	// объявление элемента типпа класс oboz
	public user testuser;
	
	// аннотация указывающая на метод, выполняемый перед запуском теста
	@Before
	
	// объявление метода выполняемого перед запуском теста
	public void teststart() {
		// создание нового элемента класса oboz
		testuser = new user();
		// организация нажатия на кнопку выбора категории кухонной мебели
		testuser.kuhnya.doClick();
		// запись строковых данных в поле ввода текста 
		testuser.textField.setText("0");
		}
	
	// аннотация указывающая на метод, выполняемый в ходе теста 
	@Test
	
	// создание метода для тестирования
	public void testprise() {
		// объявление строковой переменной и запись в нее аргумента, для последующей проверки с результатом выполнения теста
		String argument="10017";
		//объявление строковой переменной
		String rezult;
		// запись в поле ввода текста данных, полученных в результате выполнения расчета программы по расчету стоимости товара
		testuser.textField.setText(raschet.PRISE(testuser.textField.getText(), testuser.tip, 16, testuser.but[6]));
		// запись в строковую переменную результатов, полученных в результате выполнения расчета программы расчету стоимости товара и его сборки
		rezult = raschet.PRISE(testuser.textField.getText(), testuser.tip, 18, 0);
		// сравнение аргумента и результата теста
		assertEquals(argument,rezult);
		}
	
	// аннотация указывающая на метод, выполняемый после выполнения теста 
	@After
	
	// объявление метода выполняемого после выполнения теста 
	public void teststop(){
		// делаем элемент пустым и неинициализированным
		testuser = null;
		}
	
	}
