﻿// указание основного пакета данных
package main;
// объявление класса, отвечающего за расчет общей стоимости заказа, доступен из любого класса проекта
public class raschet {
	// объявление и заполнение массива цен, доступен всем классам проекта. Первая строка остается пустой
	public static int[][] prise ={{}, 
			// заполнение второй строки массива, для категории товаров - кухонная мебель
			{0, 3526, 514, 441,4546, 594, 441,5646, 514, 421,6646, 554, 471,27556, 514, 441,9546, 564, 471},
			// заполнение третей строки массива, для категории товаров - спальная мебель
			{0, 12235, 454, 423,7824, 954, 477,8765, 534, 345,3452, 565, 453,35234, 514, 4351,12345, 576, 790},
			// заполнение четвертой строки массива, для категории товаров - мебель для ванны
			{0, 34552, 344, 442,7456, 494, 461,15646, 875, 456,12353, 545, 345,1243, 514, 451,7899, 727, 234}};
	// объявление метода подсчета цены заказа, метод принимает имеющеюся суммы, категорию товара, номер товара и дейтвие для этого товара
	public static String PRISE(String p, int a, int b, int c) {
		// объявление целочисленной переменной и запись в нее текущей стоимости товара
		int summa = Integer.parseInt(p);
		// объявление целочисленной переменной для цены добавления/удаления нового товара
		int change=prise[a][b];
		// если пользователь прибаляет товар, то к текущей стоимости товара прибвляется цена нового товара
		if (c==0){ summa=summa+change;} 
		// если пользователь убирает товар, то от текущей стоимости товара убавляется цена убираемого товара
		else { summa=summa-change; }
		// объявление строковой переменно и запись в нее преобразованную стоимость заказа
		String summ=Integer.toString(summa);
		// метод на выходе возвращает полученную стоимость заказа
		return summ;
	}
}
