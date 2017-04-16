package main;

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

public class zakaz extends JPanel {
	
	public JTextField textField;
	public JButton button;

		
		
	public zakaz(){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		double a=Math.random();
		int b= (int) (a*1000000000);
		String qwe = Integer.toString(b);
		
		JPanel zakaz = new JPanel();
		zakaz.setBounds(0, 0, 684, 662);
		add(zakaz);
		zakaz.setLayout(null);
		
		button = new JButton("Завершение работы программы");
		button.setForeground(new Color(165, 42, 42));
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		button.setBounds(103, 535, 471, 60);
		zakaz.add(button);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		textPane.setBackground(UIManager.getColor("Button.background"));
		textPane.setSelectedTextColor(Color.WHITE);
		textPane.setText("    Вы успешно оформили заказ!\r\n      Вся информация поступила \r\n                  на наш сервер.\r\n      Запомните указанный ниже \r\n        код, по нему Вы сможете\r\n   быстро оформить выбранные \r\n   товары и  услуги в отделениях\r\n                нашего магазина\r\n");
		textPane.setBounds(161, 64, 362, 206);
		zakaz.add(textPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		textField.setBounds(209, 317, 314, 49);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText(qwe);
		zakaz.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("№");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(161, 314, 31, 49);
		zakaz.add(label);
		
		JLabel label_1 = new JLabel("СПАСИБО!");
		label_1.setForeground(new Color(0, 128, 0));
		label_1.setFont(new Font("Arial", Font.ITALIC, 56));
		label_1.setBounds(188, 389, 298, 116);
		zakaz.add(label_1);
	}

}
