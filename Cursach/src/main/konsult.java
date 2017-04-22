// указание основного пакета данных
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;

//создание класса вывода панели консультации, доступного из любого места проекта
public class konsult extends JPanel {
	// создание элемента button типа JButton, доступного для обращения из всего проекта
	public JButton button;
	// создание метода для построения напели консультации, доступного для обращения из всего проекта
	public konsult() {
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		// создание панели консультации
		JPanel konsult = new JPanel();
		// размещение элементов на панели 
		add(konsult, BorderLayout.CENTER);
		// задание размеров панели консультации
		konsult.setBounds(0, 0, 684, 662);
		//размещение панели
		add(konsult);
		
		// создание новой текстовой панели		
		JTextPane textPane = new JTextPane();
		// задание цвета текстовой панели (R,G,B)
		textPane.setForeground(new Color(220, 20, 60));
		// уточнение шрифта текста на текстовой панели
		textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		// установление аргумента панели
		textPane.setAlignmentX(5.0f);
		// задание ориентации отображения текста на текстовой панели
		textPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		// отключение функции редактирования текстовой панели
		textPane.setEditable(false);
		// задание фона текстовой панели 
		textPane.setBackground(UIManager.getColor("Button.background"));
		// размещение текста в тектовой панели
		textPane.setText("К сожалению, данная функция \r\n\r\n       временно недоступна.\r\n\r\n       Если у вас есть вопрос,\r\n\r\n      позвоните по телефону:\r\n\r\n                8-800-300-0550\r\n");
		// задание границ текстовой панели
		textPane.setBounds(107, 66, 419, 301);
		// размещение текстовой панели на панели консультации
		konsult.add(textPane);
		
		// создание новой надписи и запись в нее текста "♥"
		JLabel lblNewLabel = new JLabel("♥");
		// уточнение шрифта текста надписи
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 99));
		// задание цвета текста надписи 
		lblNewLabel.setForeground(new Color(139, 0, 0));
		// задание границ надписи
		lblNewLabel.setBounds(57, 329, 105, 215);
		// размещение надписи на панели консультации 
		konsult.add(lblNewLabel);

		// создание новой надписи и запись в нее текста "Приносим свои извинения!"	
		JLabel label = new JLabel("Приносим свои извинения!");
		// уточнение шрифта текста надписи
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		// задание цвета текста надписи 
		label.setForeground(new Color(107, 142, 35));
		// задание границ надписи
		label.setBounds(212, 397, 335, 80);
		// размещение надписи на панели консультации 
		konsult.add(label);
		
		
		// создание новой кнопки и запись в нее текста " ВЕРНУТЬСЯ"	
		button = new JButton("ВЕРНУТЬСЯ");
		// уточнение шрифта текста кнопки
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		// задание цвета фона кнопки
		button.setBackground(new Color(30, 144, 255));
		// задание цвета текста кнопки
		button.setForeground(new Color(0, 0, 0));
		// задание границ кнопки
		button.setBounds(245, 600, 221, 59);
		// размещение надписи на панели консультации 
		konsult.add(button);
	}

}
