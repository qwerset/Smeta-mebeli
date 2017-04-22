// указание основного пакета данных
package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//создание класса для вывода панели обозревателя, доступного из любого места проекта
public class oboz extends JPanel {

	// создание метода, делающего текстовое поле доступным из любой части проекта
	public JTextField textField;
	// создание метода, делающего надпись доступной из любой части проекта
	public JLabel label_1;
	// создание метода, делающего кнопку доступной из любой части проекта
	public JButton btnNewButton;
	// создание метода, делающего кнопку доступной из любой части проекта
	public JButton button_1;
	// создание метода, делающего кнопку доступной из любой части проекта
	public JButton b33;
	// создание метода, делающего кнопку доступной из любой части проекта
	public JButton vannaya;
	
	// объявление целочисленной переменной, отвечающей за выбор категории товаро(0-категоря не выбрана/1,2,3-соответсвующая числу категория)
	public int tip=0;
	// объявление целочисленного массива, отвечающего за статус кнопок товаров (0-не активирована/1-активирована)
	public int but[]={0,0,0,0,0,0,0};
	
	// объявление метода постороения панели для данного класса
	public oboz() {
	
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		// объявление элемента типа класса JPanel
		JPanel oboz = new JPanel();
		// задание границ панели
		oboz.setBounds(0, 0, 684, 662);
		// добавление панели 
		add(oboz);
		// задание стандартных параметров
		oboz.setLayout(null);
	
		JButton button = new JButton("Мгновенная консультация");
		button.setBounds(19, 10, 208, 23);
		button.setEnabled(false);
		oboz.add(button);
		button.setFont(new Font("Arial", Font.ITALIC, 11));
		button.setForeground(new Color(0, 0, 255));
	
		// создание новой надписи и запись в нее текста ""
		label_1 = new JLabel("");
		// задание границ надписи
		label_1.setBounds(449, 10, 124, 17);
		// размещение надписи на панели
		oboz.add(label_1);
		// задание шрифта теста надписи
		label_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		// размещение текста в центра надписи
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		// создание новой надписи и запись в нее текста "Вы вошли как: "
		JLabel label = new JLabel("Вы вошли как: ");
		// задание границ надписи
		label.setBounds(344, 12, 106, 15);
		// размещение надписи на панели
		oboz.add(label);
		// задание шрифта теста надписи
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		// задание цвета надписи
		label.setForeground(new Color(0, 128, 0));
				
				
		// создание новой кнопки для выхода из учетной записи и запись в нее текста "Выйти"
		btnNewButton = new JButton("Выйти");
		// задание границ кнопки
		btnNewButton.setBounds(583, 9, 88, 23);
		// размещение надписи на панели
		oboz.add(btnNewButton);
		// задание цвета текста в кнопке
		btnNewButton.setForeground(new Color(255, 0, 0));
		// задание шрифта теста надписи
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
	
		JButton button_7 = new JButton("Создать заказ");
		button_7.setBounds(345, 622, 139, 23);
		button_7.setEnabled(false);
		oboz.add(button_7);
		button_7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		button_7.setForeground(Color.BLUE);
		
		JButton kuhnya = new JButton("Кухонная мубель");
		kuhnya.setBounds(42, 55, 200, 50);
		oboz.add(kuhnya);
		kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
		
		vannaya = new JButton("Мебель для ванны");
		vannaya.setBounds(440, 55, 200, 50);
		oboz.add(vannaya);
		vannaya.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton spalnya = new JButton("Спальная мебель\r\n");
		spalnya.setBounds(241, 55, 200, 50);
		oboz.add(spalnya);
		spalnya.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton zanaves = new JButton("Выберите категорию товаров!");
		zanaves.setBounds(42, 126, 598, 422);
		oboz.add(zanaves);
		zanaves.setFont(new Font("Arial", Font.BOLD, 16));
		zanaves.setEnabled(false);
		
		textField = new JTextField();
		textField.setBounds(209, 623, 126, 21);
		oboz.add(textField);
		textField.setText("0");
		textField.setBackground(Color.WHITE);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		textField.setEditable(false);
		textField.setColumns(10);
		
		// =================================1 PRODUCT====================================
		
				// создание новой надписи из блока элементов 1 продукта и запись в нее текста ""	
				JLabel l31 = new JLabel("");
				// задание границ надписи
				l31.setBounds(60, 128, 110, 21);
				// размещение надписи на панели пользователя
				oboz.add(l31);
				// размещение текста надписи по центру
				l31.setHorizontalAlignment(SwingConstants.CENTER);
				
				// создание новой кнопкии выбора продукции из блока элементов 1 продукта и запись в нее текста ""
				JButton b31 = new JButton("");
				// задание границ кнопки
				b31.setBounds(60, 148, 110, 110);
				// размещение кнопки на панели пользователя
				oboz.add(b31);
				// задание цвета кнопки
				b31.setBackground(Color.WHITE);
				// объявление ожидания нажатия на кнопку
				b31.addActionListener(new ActionListener() {
					// создание метода выполняющего дейтвия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// выключение параметра активности кнопки vannaya
						vannaya.setEnabled(false);
						// выключение параметра активности кнопки spalnya
						spalnya.setEnabled(false);
						// выключение параметра активности кнопки kuhnya
						kuhnya.setEnabled(false);
						// условие проверки состояния нажатия кнопки, если кнопка не нажата, то...
						if (but[1]==0) {
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 1, but[1]));
							// изменение состояние кнопки на 1, т.е. включена
							but[1]=1;
						// иначе 		
						} else{
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet	
							textField.setText(raschet.PRISE(textField.getText(), tip, 1, but[1]));
							// изменение состояние кнопки на 0, т.е. включена
							but[1]=0;
						}
					// окончание действий при нажатии на кнопку
					}});
				
				// создание флаговой кнопки для подсчета доставки из блока элементов 1 продукта и запись в нее текста "Доставка"
				JCheckBoxMenuItem d31 = new JCheckBoxMenuItem("Доставка");
				// задание границ флаговой кнопки
				d31.setBounds(60, 278, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(d31);
				// задание розового цвета флаговой кнопки
				d31.setBackground(Color.PINK);
				// размещение текста флаговой кнопки по центру 
				d31.setHorizontalAlignment(SwingConstants.CENTER);
				// объявление ожидания нажатия на флаговую кнопку
				d31.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (d31.isSelected()) 
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 2, 0));
						// иначе
						else
							// текстовое поле принимает новое значение пр	еобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 2, 1));
					
					}
				// окончание действий при нажатии на флаговую кнопку
				});
				
				// создание флаговой кнопки для подсчета сборки из блока элементов 1 продукта и запись в нее текста "Сборка"
				JCheckBoxMenuItem s31 = new JCheckBoxMenuItem("Сборка");
				// задание границ флаговой кнопки
				s31.setBounds(60, 256, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(s31);
				// задание розового цвета флаговой кнопки
				s31.setBackground(Color.PINK);
				// размещение текста флаговой кнопки по центру
				s31.setHorizontalAlignment(SwingConstants.CENTER);
				// объявление ожидания нажатия на флаговую кнопку
				s31.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (s31.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 3, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 3, 1));
					
					}
				// окончание действий при нажатии на флаговую кнопку
				});
				
			// ===============================END 1 PRODUCT==================================
			// =================================2 PRODUCT====================================
				
				// создание новой кнопкии выбора продукции из блока элементов 2 продукта и запись в нее текста ""	
				JButton b32 = new JButton("");
				// задание цвета кнопки
				b32.setBackground(Color.WHITE);
				// задание границ кнопки
				b32.setBounds(289, 148, 110, 110);
				// размещение кнопки на панели пользователя
				oboz.add(b32);
				// объявление ожидания нажатия на кнопку
				b32.addActionListener(new ActionListener() {
					// создание метода выполняющего дейтвия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// выключение параметра активности кнопки vannaya
						vannaya.setEnabled(false);
						// выключение параметра активности кнопки spalnya
						spalnya.setEnabled(false);
						// выключение параметра активности кнопки kuhnya
						kuhnya.setEnabled(false);
						// условие проверки состояния нажатия кнопки, если кнопка не нажата, то...
						if (but[2]==0) {
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 4, but[2]));
							// изменение состояние кнопки на 1, т.е. включена
							but[2]=1;
						// иначе 		
						} else{
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet	
							textField.setText(raschet.PRISE(textField.getText(), tip, 4, but[2]));
							// изменение состояние кнопки на 0, т.е. включена
							but[2]=0;
							
						}
				// окончание действий при нажатии на кнопку
				}});
				
				// создание новой надписи из блока элементов 2 продукта и запись в нее текста ""
				JLabel l32 = new JLabel("");
				// размещение текста надписи по центру
				l32.setHorizontalAlignment(SwingConstants.CENTER);
				// задание границ надписи
				l32.setBounds(289, 128, 110, 21);
				// размещение надписи на панели пользователя
				oboz.add(l32);
				
				// создание флаговой кнопки для подсчета доставки из блока элементов 2 продукта и запись в нее текста "Доставка"
				JCheckBoxMenuItem d32 = new JCheckBoxMenuItem("Доставка");
				// размещение текста флаговой кнопки по центру 
				d32.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				d32.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				d32.setBounds(289, 278, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(d32);
				// объявление ожидания нажатия на флаговую кнопку
				d32.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (d32.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 5, 0));
						// иначе
						else
							// текстовое поле принимает новое значение пр	еобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 5, 1));
					
					}
				// окончание действий при нажатии на флаговую кнопку
				});
				
				// создание флаговой кнопки для подсчета сборки из блока элементов 2 продукта и запись в нее текста "Сборка"
				JCheckBoxMenuItem s32 = new JCheckBoxMenuItem("Сборка");
				// размещение текста флаговой кнопки по центру
				s32.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				s32.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				s32.setBounds(289, 256, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(s32);
				// объявление ожидания нажатия на флаговую кнопку
				s32.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (s32.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 6, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 6, 1));
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
			// ===============================END 2 PRODUCT==================================
			// =================================3 PRODUCT====================================
				
				// создание новой кнопкии выбора продукции из блока элементов 3 продукта и запись в нее текста ""
				b33 = new JButton("");
				// задание цвета кнопки
				b33.setBackground(Color.WHITE);
				// задание границ кнопки
				b33.setBounds(517, 148, 110, 110);
				// размещение кнопки на панели пользователя
				oboz.add(b33);
				// объявление ожидания нажатия на кнопку
				b33.addActionListener(new ActionListener() {
					// создание метода выполняющего дейтвия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// выключение параметра активности кнопки vannaya
						vannaya.setEnabled(false);
						// выключение параметра активности кнопки spalnya
						spalnya.setEnabled(false);
						// выключение параметра активности кнопки kuhnya
						kuhnya.setEnabled(false);
						// условие проверки состояния нажатия кнопки, если кнопка не нажата, то...
						if (but[3]==0) {
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 7, but[3]));
							// изменение состояние кнопки на 1, т.е. включена
							but[3]=1;
							// иначе 		
							} else{
								// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet	
								textField.setText(raschet.PRISE(textField.getText(), tip, 7, but[3]));
								// изменение состояние кнопки на 0, т.е. включена
								but[3]=0;
								}
						// окончание действий при нажатии на кнопку
						}});
				// создание новой надписи из блока элементов 3 продукта и запись в нее текста ""	
				JLabel l33 = new JLabel("Тумба-раковина");
				// размещение текста надписи по центру
				l33.setHorizontalAlignment(SwingConstants.CENTER);
				// задание границ надписи
				l33.setBounds(517, 128, 110, 21);
				// размещение надписи на панели пользователя
				oboz.add(l33);
				
				// создание флаговой кнопки для подсчета доставки из блока элементов 3 продукта и запись в нее текста "Доставка"
				JCheckBoxMenuItem d33 = new JCheckBoxMenuItem("Доставка");
				// размещение текста флаговой кнопки по центру 
				d33.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				d33.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				d33.setBounds(517, 278, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(d33);
				// объявление ожидания нажатия на флаговую кнопку
				d33.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (d33.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 8, 0));
						// иначе
						else
							// текстовое поле принимает новое значение пр	еобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 8, 1));
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
				// создание флаговой кнопки для подсчета сборки из блока элементов 3 продукта и запись в нее текста "Сборка"
				JCheckBoxMenuItem s33 = new JCheckBoxMenuItem("Сборка");
				// размещение флаговой кнопки на панели пользователя
				s33.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				s33.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				s33.setBounds(517, 256, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(s33);
				// объявление ожидания нажатия на флаговую кнопку
				s33.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (s33.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 9, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 9, 1));
					
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
			// ===============================END 3 PRODUCT==================================
			// =================================4 PRODUCT====================================
				
				// создание новой надписи из блока элементов 4 продукта и запись в нее текста ""	
				JLabel l34 = new JLabel("");
				// размещение текста надписи по центру
				l34.setHorizontalAlignment(SwingConstants.CENTER);
				// задание границ надписи
				l34.setBounds(60, 329, 110, 21);
				// размещение кнопки на панели пользователя
				oboz.add(l34);
				
				// создание новой кнопкии выбора продукции из блока элементов 4 продукта и запись в нее текста ""
				JButton b34 = new JButton("");
				// задание цвета кнопки
				b34.setBackground(Color.WHITE);
				// задание границ кнопки
				b34.setBounds(60, 349, 110, 110);
				// размещение кнопки на панели пользователя
				oboz.add(b34);
				// объявление ожидания нажатия на кнопку
				b34.addActionListener(new ActionListener() {
					// создание метода выполняющего дейтвия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// выключение параметра активности кнопки vannaya
						vannaya.setEnabled(false);
						// выключение параметра активности кнопки spalnya
						spalnya.setEnabled(false);
						// выключение параметра активности кнопки kuhnya
						kuhnya.setEnabled(false);
						// условие проверки состояния нажатия кнопки, если кнопка не нажата, то...
						if (but[4]==0) {
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 10, but[4]));
							// изменение состояние кнопки на 1, т.е. включена
							but[4]=1;
							// иначе 		
							} else{
								// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet	
								textField.setText(raschet.PRISE(textField.getText(), tip, 10, but[4]));
								// изменение состояние кнопки на 0, т.е. включена
								but[4]=0;
						}
						// окончание действий при нажатии на кнопку
						}});
				
				// создание флаговой кнопки для подсчета доставки из блока элементов 4 продукта и запись в нее текста "Доставка"
				JCheckBoxMenuItem d34 = new JCheckBoxMenuItem("Доставка");
				// размещение текста флаговой кнопки по центру 
				d34.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				d34.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				d34.setBounds(60, 479, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(d34);
				// объявление ожидания нажатия на флаговую кнопку
				d34.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (d34.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 11, 0));
						// иначе
						else
							// текстовое поле принимает новое значение пр	еобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 11, 1));
					
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
				// создание флаговой кнопки для подсчета сборки из блока элементов 4 продукта и запись в нее текста "Сборка"
				JCheckBoxMenuItem s34 = new JCheckBoxMenuItem("Сборка");
				// размещение текста флаговой кнопки по центру
				s34.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				s34.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				s34.setBounds(60, 457, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(s34);
				// объявление ожидания нажатия на флаговую кнопку
				s34.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (s34.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 12, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 12, 1));
					
					}
					// окончание действий при нажатии на флаговую кнопку
					});
				
			// ===============================END 4 PRODUCT==================================
			// =================================5 PRODUCT====================================
				
				// создание новой надписи из блока элементов 5 продукта и запись в нее текста ""	
				JLabel l35 = new JLabel("");
				// размещение текста надписи по центру
				l35.setHorizontalAlignment(SwingConstants.CENTER);
				// задание границ надписи
				l35.setBounds(289, 329, 110, 21);
				// размещение надписи на панели пользователя
				oboz.add(l35);
			
				// создание новой кнопкии выбора продукции из блока элементов 5 продукта и запись в нее текста ""
				JButton b35 = new JButton("");
				// задание цвета кнопки
				b35.setBackground(Color.WHITE);
				// задание границ кнопки
				b35.setBounds(289, 349, 110, 110);
				// размещение кнопки на панели пользователя
				oboz.add(b35);
				// объявление ожидания нажатия на кнопку
				b35.addActionListener(new ActionListener() {
					// создание метода выполняющего дейтвия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// выключение параметра активности кнопки vannaya
						vannaya.setEnabled(false);
						// выключение параметра активности кнопки spalnya
						spalnya.setEnabled(false);
						// выключение параметра активности кнопки kuhnya
						kuhnya.setEnabled(false);
						// условие проверки состояния нажатия кнопки, если кнопка не нажата, то...
						if (but[5]==0) {
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 13, but[5]));
							// изменение состояние кнопки на 1, т.е. включена
							but[5]=1;
							// иначе 		
							} else{
								// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet	
								textField.setText(raschet.PRISE(textField.getText(), tip, 13, but[5]));
								// изменение состояние кнопки на 0, т.е. включена
								but[5]=0;
							}
						// окончание действий при нажатии на кнопку
						}});
				
				// создание флаговой кнопки для подсчета сборки из блока элементов 5 продукта и запись в нее текста "Доставка"
				JCheckBoxMenuItem s35 = new JCheckBoxMenuItem("Сборка");
				// размещение текста флаговой кнопки по центру 
				s35.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				s35.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				s35.setBounds(289, 457, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(s35);
				// объявление ожидания нажатия на флаговую кнопку
				s35.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (s35.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 15, 0));
						// иначе
						else
							// текстовое поле принимает новое значение пр	еобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 15, 1));
					
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
				// создание флаговой кнопки для подсчета доставки из блока элементов 5 продукта и запись в нее текста "Сборка"
				JCheckBoxMenuItem d35 = new JCheckBoxMenuItem("Доставка");
				// размещение текста флаговой кнопки по центру
				d35.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				d35.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				d35.setBounds(289, 479, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(d35);
				// объявление ожидания нажатия на флаговую кнопку
				d35.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (d35.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 14, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 14, 1));
					
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
			// ===============================END 5 PRODUCT==================================
			// =================================6 PRODUCT====================================

				// создание новой надписи из блока элементов 6 продукта и запись в нее текста ""	
				JLabel l36 = new JLabel("");
				// размещение текста надписи по центру
				l36.setHorizontalAlignment(SwingConstants.CENTER);
				// задание границ надписи
				l36.setBounds(517, 329, 110, 21);
				// размещение надписи на панели пользователя
				oboz.add(l36);
				
				// создание новой кнопкии выбора продукции из блока элементов 6 продукта и запись в нее текста ""
				JButton b36 = new JButton("");
				// задание цвета кнопки
				b36.setBackground(Color.WHITE);
				// задание границ кнопки
				b36.setBounds(517, 349, 110, 110);
				// размещение кнопки на панели пользователя
				oboz.add(b36);
				// объявление ожидания нажатия на кнопку
				b36.addActionListener(new ActionListener() {
					// создание метода выполняющего дейтвия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// выключение параметра активности кнопки vannaya
						vannaya.setEnabled(false);
						// выключение параметра активности кнопки spalnya
						spalnya.setEnabled(false);
						// выключение параметра активности кнопки kuhnya
						kuhnya.setEnabled(false);
						// условие проверки состояния нажатия кнопки, если кнопка не нажата, то...
						if (but[6]==0) {
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 16, but[6]));
							// изменение состояние кнопки на 1, т.е. включена
							but[6]=1;
							// иначе 		
							} else{
								// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet	
								textField.setText(raschet.PRISE(textField.getText(), tip, 16, but[6]));
								// изменение состояние кнопки на 0, т.е. включена
								but[6]=0;
						}
						// окончание действий при нажатии на кнопку
						}});
				
				// создание флаговой кнопки для подсчета сборки из блока элементов 6 продукта и запись в нее текста "Сборка"
				JCheckBoxMenuItem s36 = new JCheckBoxMenuItem("Сборка");
				// размещение текста флаговой кнопки по центру
				s36.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				s36.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				s36.setBounds(517, 457, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(s36);
				// создание метода выполняющего действия при нажатии на флаговую кнопку
				s36.addActionListener(new ActionListener() {
					// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
					public void actionPerformed(ActionEvent e) {
						// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
						if (s36.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 18, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 18, 1));
					
						}
					// окончание действий при нажатии на флаговую кнопку
					});
				
				// создание флаговой кнопки для подсчета доставки из блока элементов 6 продукта и запись в нее текста "Доставка"
				JCheckBoxMenuItem d36 = new JCheckBoxMenuItem("Доставка");
				// размещение текста флаговой кнопки по центру 
				d36.setHorizontalAlignment(SwingConstants.CENTER);
				// задание розового цвета флаговой кнопки
				d36.setBackground(Color.PINK);
				// задание границ флаговой кнопки
				d36.setBounds(517, 479, 110, 22);
				// размещение флаговой кнопки на панели пользователя
				oboz.add(d36);
				// объявление ожидания нажатия на флаговую кнопку
				d36.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на флаговую кнопку
					public void actionPerformed(ActionEvent e) {
						// условие проверки состояни нажатия кнопки, если флаговая кнопка не нажата, то...
						if (d36.isSelected())
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 17, 0));
						// иначе
						else
							// текстовое поле принимает новое значение преобразованное в ходе выполнения метода PRISE из класса raschet
							textField.setText(raschet.PRISE(textField.getText(), tip, 17, 1));
					
						}
					// окончание действий при нажатии на флаговую кнопку
					});
			// ===============================END 6 PRODUCT==================================
				
				// создание новой надписи и запись в нее "Общая стоимость:"
				JLabel label_2 = new JLabel("Общая стоимость:");
				// задание границ надписи
				label_2.setBounds(67, 626, 132, 15);
				// размещение надписи на панели пользователя
				oboz.add(label_2);
				// задание фонового цвета надписи
				label_2.setBackground(Color.LIGHT_GRAY);
				// задание цвета текста надписи
				label_2.setForeground(Color.RED);
				// задание шрифта отображаемого в надписи текта
				label_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
					
				// создание новой кнопки и запись в нее текста "ВЫХОД"
				button_1 = new JButton("ВЫХОД");
				// задание границ кнопки
				button_1.setBounds(550, 614, 124, 41);
				// размещение кнопки на панели пользователя
				oboz.add(button_1);
				// уставновка иконки кнопки
				button_1.setIcon(new ImageIcon(user.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
				// задание фонового цвета кнопки
				button_1.setBackground(Color.LIGHT_GRAY);
			
			// PIK KAETEGORY	
				
				// объявление ожидания нажатия на кнопку "vannaya"
				vannaya.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// запись в переменную ключевого значения для данной категории товаров
						tip =3;
						// выключение параметра активности кнопки zanaves
						zanaves.setVisible(false);
						// задание шрифта текста отображаемого в надписи кнопки
						vannaya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
						// задание красного цвета текста кнопки 
						vannaya.setForeground(Color.RED);
						// задание границ кнопки
						vannaya.setBounds(440, 55, 200, 60);
						// задание шрифта текста отображаемого в надписи кнопки
						spalnya.setFont(new Font("Arial", Font.BOLD, 14));
						// задание границ кнопки
						spalnya.setBounds(241, 55, 200, 50);
						// задание черного цвета текста кнопки 
						spalnya.setForeground(Color.BLACK);
						// задание шрифта текста отображаемого в надписи кнопки
						kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
						// задание границ кнопки
						kuhnya.setBounds(42, 55, 200, 50);
						// задание черного цвета текста кнопки 
						kuhnya.setForeground(Color.BLACK);
						// изменение теста в надписи
						l31.setText("Тумба-раковина");
						// изменение теста в надписи
						l32.setText("Светильник");
						// изменение теста в надписи
						l33.setText("Душевая кабина");
						// изменение теста в надписи
						l34.setText("Напольный камод");
						// изменение теста в надписи
						l35.setText("Зеркало-шкаф");
						// изменение теста в надписи
						l36.setText("Зеркало");
						}
					// окончание действий при нажатии на флаговую кнопку "vannaya"
					});
				
				// объявление ожидания нажатия на кнопку "kuhnya"
				kuhnya.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на кнопку
					public void actionPerformed(ActionEvent arg0) {
						// запись в переменную ключевого значения для данной категории товаров
						tip =1;
						// выключение параметра активности кнопки zanaves
						zanaves.setVisible(false);
						// задание шрифта текста отображаемого в надписи кнопки
						kuhnya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
						// задание красного цвета текста кнопки 
						kuhnya.setForeground(Color.RED);
						// задание границ кнопки
						kuhnya.setBounds(42, 55, 200, 60);
						// задание шрифта текста отображаемого в надписи кнопки
						spalnya.setFont(new Font("Arial", Font.BOLD, 14));
						// задание границ кнопки
						spalnya.setBounds(241, 55, 200, 50);
						// задание черного цвета текста кнопки 
						spalnya.setForeground(Color.BLACK);
						// задание шрифта текста отображаемого в надписи кнопки
						vannaya.setFont(new Font("Arial", Font.BOLD, 14));
						// задание границ кнопки
						vannaya.setBounds(440, 55, 200, 50);
						// задание черного цвета текста кнопки 
						vannaya.setForeground(Color.BLACK);
						// изменение теста в надписи
						l31.setText("Гарнитур (тип А)");
						// изменение теста в надписи
						l32.setText("Гарнитур (тип Б)");
						// изменение теста в надписи
						l33.setText("Гарнитур (тип В)");
						// изменение теста в надписи
						l34.setText("Стол со стульями");
						// изменение теста в надписи
						l35.setText("Кухонный угол");
						// изменение теста в надписи
						l36.setText("Шкаф навесной");
						}
					// окончание действий при нажатии на флаговую кнопку "kuhnya"
					});
				
				// объявление ожидания нажатия на кнопку "spalnya"
				spalnya.addActionListener(new ActionListener() {
					// создание метода выполняющего действия при нажатии на кнопку
					
					public void actionPerformed(ActionEvent arg0) {
						// запись в переменную ключевого значения для данной категории товаров
						tip =2;
						// выключение параметра активности кнопки zanaves
						zanaves.setVisible(false);
						// задание шрифта текста отображаемого в надписи кнопки
						spalnya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
						// задание красного цвета текста кнопки 
						spalnya.setForeground(Color.RED);
						// задание границ кнопки
						spalnya.setBounds(241, 55, 200, 60);
						// задание шрифта текста отображаемого в надписи кнопки
						kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
						// задание границ кнопки
						kuhnya.setBounds(42, 55, 200, 50);
						// задание черного цвета текста кнопки 
						kuhnya.setForeground(Color.BLACK);
						// задание шрифта текста отображаемого в надписи кнопки
						vannaya.setFont(new Font("Arial", Font.BOLD, 14));
						// задание границ кнопки
						vannaya.setBounds(440, 55, 200, 50);
						// задание черного цвета текста кнопки 
						vannaya.setForeground(Color.BLACK);
						// изменение теста в надписи
						l31.setText("Кровать (тип А)");
						// изменение теста в надписи
						l32.setText("Кровать (тип Б)");
						// изменение теста в надписи
						l33.setText("Кровать (тип В)");
						// изменение теста в надписи
						l34.setText("Тумба прикроватная");
						// изменение теста в надписи
						l35.setText("Шкаф");
						// изменение теста в надписи
						l36.setText("Зеркало настенное");
					}
					// окончание действий при нажатии на флаговую кнопку "vannaya"
					});
			//* END PIK KAETEGORY	
			}
		}
