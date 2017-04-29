// указание основного пакета данных
package main;
 
// импортирование классов для последующего использования 
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import javax.swing.JPanel;

public class login extends JPanel {
	
	// создание элемента textField типа JTextField, доступным для обращения из всего проекта
	public JTextField textField;
	// создание элемента textField типа JTextField, доступным для обращения из всего проекта
	public JTextField textField_1;
	// создание элемента button типа JButton, доступнм для обращения из всего проекта
	public JButton button;
	// создание элемента button_1 типа JButton, доступнм для обращения из всего проекта
	public JButton button_1;
	// создание элемента obozr типа JButton, доступнм для обращения из всего проекта
	public JButton obozr;
		
	public login() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		// объявление элемента типа класса JPanel
		JPanel login = new JPanel();
		// задание цвета панели
		login.setBackground(new Color(221, 160, 221));
		// задание границ панели
		login.setBounds(0, 0, 684, 662);
		// добавление панели 
		add(login);
		// задание стандартных параметров
		login.setLayout(null);
		
		// создание текстовой панели
		JTextPane textPane_1 = new JTextPane();
		// задание границ текстовой панели
		textPane_1.setBounds(42, 542, 165, 45);
		// размещение текстовой панели
		login.add(textPane_1);
		// запись текста в текстовую панель
		textPane_1.setText("  *Забыли логин или пароль?\r\n          Позвоните в службу \r\nподдержки тел. 8-800-300-0550");
		// задание границ текстовой панели
		textPane_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		// выключение атрибута редактирования
		textPane_1.setEditable(false);
		//задание цвета текстовой панели
		textPane_1.setBackground(new Color(221, 160, 221));
	
		// создание новой надписи и запись в нее текста "Введите:"
		JLabel label_3 = new JLabel("Введите:");
		// задание границ надписи
		label_3.setBounds(130, 267, 63, 15);
		// размещение надписи на панели
		login.add(label_3);
		// задание цвета надписи
		label_3.setForeground(Color.BLACK);
		// задание шрифта теста надписи
		label_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	
		// создание новой надписи и запись в нее текста "Внимание!"
		JLabel label = new JLabel("Внимание!");
		// задание границ надписи
		label.setBounds(329, 167, 69, 15);
		// размещение надписи на панели
		login.add(label);
		// задание шрифта теста надписи
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		// задание шрифта теста надписи
		label.setForeground(Color.RED);
		// задание цвета надписи
		label.setBackground(Color.LIGHT_GRAY);
	
		// создание текстовой панели
		JTextPane textPane = new JTextPane();
		// задание границ текстовой панели
		textPane.setBounds(100, 119, 486, 81);
		// размещение текстовой панели
		login.add(textPane);
		// выключение атрибута редактирования
		textPane.setEditable(false);
		//задание цвета текстовой панели
		textPane.setBackground(new Color(221, 160, 221));
		// задание границ текстовой панели
		textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		//задание цвета текстовой панели
		textPane.setForeground(Color.BLUE);
		// запись текста в текстовую панель
		textPane.setText("         Здравствуйте, Вы вользуетесь программой МебельныйРай, \r\n             для продолжения работы необходимо войти в систему.\r\n              Если у Вас нет учетной записи, зарегистрируйтесь или \r\n     войдите как \"обозреватель\".                     В режиме \"обозреватель\" \r\n               нельзя произвести заказ или получить консультацию.");
	
		// создание новго текстового поля
		textField = new JTextField();
		// запись в текстовое поле текста "red" 
		textField.setText("red");
		// задание грниц текстового поля
		textField.setBounds(150, 304, 86, 20);
		// размещение текстового поля на панели
		login.add(textField);
		// количество символов в строке 
		textField.setColumns(10);
	
		// создание новго текстового поля
		textField_1 = new JTextField();
		// запись в текстовое поле текста "red" 
		textField_1.setText("red");
		// задание грниц текстового поля
		textField_1.setBounds(150, 342, 86, 20);
		// размещение текстового поля на панели
		login.add(textField_1);
		// количество символов в строке 
		textField_1.setColumns(10);
	
		// создание новой надписи и запись в нее текста "Логин - "
		JLabel label_1 = new JLabel("Логин - ");
		// задание границ надписи
		label_1.setBounds(61, 307, 55, 14);
		// размещение надписи на панели
		login.add(label_1);
		// отображать текст надписи от правой границы
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		// формат текста надписи
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
	
		// создание новой надписи и запись в нее текста "Пароль - "
		JLabel label_2 = new JLabel("Пароль - ");
		// задание границ надписи
		label_2.setBounds(61, 345, 55, 14);
		// размещение надписи на панели
		login.add(label_2);
		// отображать текст надписи от правой границы
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		// формат текста надписи
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
	
		// создание новой кнопки для выхода из учетной записи и запись в нее текста "ВОЙТИ"
		button = new JButton("ВОЙТИ");
		// задание границ кнопки
		button.setBounds(121, 376, 86, 23);
		// размещение надписи на панели
		login.add(button);
		// задание шрифта теста надписи
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		// задание цвета текста в кнопке
		button.setForeground(new Color(34, 139, 34));
		// задание цвета текста кнопки
		button.setBackground(new Color(221, 160, 221));
	
		// создание новой кнопки для выхода из учетной записи и запись в нее текста "Зарегистрироваться"
		JButton btnNewButton = new JButton("Зарегистрироваться");
		// задание границ кнопки
		btnNewButton.setBounds(385, 301, 197, 23);
		// размещение надписи на панели
		login.add(btnNewButton);
		// выключение атрибута активности
		btnNewButton..setEditable(false);
		// задание цвета текста в кнопке
		btnNewButton.setForeground(new Color(0, 0, 205));
		// задание шрифта теста надписи
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		// задание цвета надписи
		btnNewButton.setBackground(new Color(221, 160, 221));
	
		// создание новой кнопки для выхода из учетной записи и запись в нее текста "Войти как обозреватель"
		obozr = new JButton("Войти как обозреватель");
		// задание границ кнопки
		obozr.setBounds(385, 339, 201, 23);
		// размещение надписи на панели
		login.add(obozr);
		// задание цвета текста в кнопке
		obozr.setForeground(Color.RED);
		// задание шрифта теста надписи
		obozr.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		// задание цвета кнопки
		obozr.setBackground(new Color(221, 160, 221));
	
		// создание новой кнопки для выхода из учетной записи и запись в нее текста "ВЫХОД"
		button_1 = new JButton("ВЫХОД");
		// задание границ кнопки
		button_1.setBounds(550, 615, 125, 41);
		// размещение надписи на панели
		login.add(button_1);
		// задание цвета кнопки
		button_1.setBackground(new Color(221, 160, 221));
		//установка иконки на кнопку
		button_1.setIcon(new ImageIcon(login.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
	
	
	}}
