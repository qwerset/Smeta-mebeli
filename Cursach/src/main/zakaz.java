// указание основного пакета данных
package main;

// импортирование классов для последующего использования 
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

//создание класса для вывода информации о заказе, доступный из любого места проекта
public class zakaz extends JPanel {
	 
	// создание метода, делающего текстовое поле доступным из любой части проекта
	public JTextField textField;
	// создание метода, делающего кнопку доступной из любой части проекта
	public JButton button;
	
	// создание метода для построения напели заказ, доступный для обращения из всего проекта
	public zakaz(){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		// объявление численной переменной и запись в нее случайного числа от 0 до 1
		double a=Math.random();
		// объявление целочисленной переменной и запись в нее целой части результата арифметического действия
		int b= (int) (a*1000000000);
		// объявление строковой переменной и запись в нее преобразованных данных
		String qwe = Integer.toString(b);
		
		// объявление элемента типа класса JPanel
		JPanel zakaz = new JPanel();
		// задание границ панели
		zakaz.setBounds(0, 0, 684, 662);
		// добавление панели 
		add(zakaz);
		// задание стандартных параметров
		zakaz.setLayout(null);
		
		// создание новой кнопки и запись в нее теста "Завершение работы программы"
		button = new JButton("Завершение работы программы");
		// задание цвета кнопки 
		button.setForeground(new Color(165, 42, 42));
		// задание шрифта отображаемого в кнопке текста
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		// задание границ кнопки
		button.setBounds(103, 535, 471, 60);
		// добавление кнопки на панель
		zakaz.add(button);
		
		// создание текстовой панели
		JTextPane textPane = new JTextPane();
		// выключение атрибута редактирования
		textPane.setEditable(false);
		// задание границ текстовой панели
		textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		// задание фона текстовой панели
		textPane.setBackground(UIManager.getColor("Button.background"));
		// запись текста в текстовую панель
		textPane.setText("    Вы успешно оформили заказ!\r\n      Вся информация поступила \r\n                  на наш сервер.\r\n      Запомните указанный ниже \r\n        код, по нему Вы сможете\r\n   быстро оформить выбранные \r\n   товары и  услуги в отделениях\r\n                нашего магазина\r\n");
		// задание границ текстовой панели
		textPane.setBounds(161, 64, 362, 206);
		// размещение текстовой панели
		zakaz.add(textPane);
		
		// создание текстового поля
		textField = new JTextField();
		// задание шрифта отображаемого текста в текстовом поле
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		// задание границ текстового поля
		textField.setBounds(209, 317, 314, 49);
		// установка атрибута отображение текста по центру  
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		// запись в тестовое поле содержимое строковой переменной 
		textField.setText(qwe);
		// размещение текстового поля на панели
		zakaz.add(textField);
		
		// создание новой надписи и запись в нее "№"
		JLabel label = new JLabel("№");
		// задание шрифта отображаемого текста в надписи
		// задание границ надписи
		label.setBounds(161, 314, 31, 49);
		// размещение надписи на панели
		zakaz.add(label);
		
		// создание новой надписи и запись в нее "СПАСИБО!"
		JLabel label_1 = new JLabel("СПАСИБО!");
		// задание шрифта отображаемого текста в надписи
		label_1.setForeground(new Color(0, 128, 0));
		// задание границ надписи
		label_1.setFont(new Font("Arial", Font.ITALIC, 56));
		// задание границ надписи
		label_1.setBounds(188, 389, 298, 116);
		// размещение надписи на панели
		zakaz.add(label_1);
	}

}
