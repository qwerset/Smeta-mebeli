﻿// подключение основного пакета даннах
package main;
//объявление класса, отвечающего за имеющиеся учетные записи, доступен из любого класса проекта
public class uchetki {
	//объявление и заполнение строкового массива логинов, доступен из любого класса проекта
	public  String[] login={"admin","red","blue","green","yellow" };
	//объявление и заполнение строкового массива паролей, доступен из любого класса проекта
	public  String[] password={"admin","red","blue","green","yellow" };
	// объявление метода проверки логина и пароля введенных пользователем с базой программы, доступен из любого класса проекта
	public  int bazalog(String LOGIN, String PASSWORD){
		// объявление целочисленной переменной, отвечающей за контроль допуска пользователей, стандартное значение означает некорректность введенных данных
		int x=0;
		// органиация цикла проверки введнных данных с базой логинов и паролей
		for (int i=0; i<login.length; i++){
			// условие проверки введнных данных с базой логинов и паролей
			if ( login[i].equals(LOGIN)  && password[i].equals(PASSWORD)) {
				// условие проверки введенных данных на соответствие с администраторскими
				if (i==0) { x=2;} 
				// иначе переменная контроля допуска получает значение для допуска обычного пользователя
				else { x=1;}
			}
		}
		// метов на выходе возвращает полученные данные, а именно переменную контроля допуска 
		return x;
	}
	
}
