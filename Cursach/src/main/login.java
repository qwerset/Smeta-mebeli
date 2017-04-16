// указание основного пакета данных
package main;

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
		
	JPanel login = new JPanel();
	login.setBackground(new Color(221, 160, 221));
	login.setBounds(0, 0, 684, 662);
	add(login);
	login.setLayout(null);
	
	//* TELEFON
	JTextPane textPane_1 = new JTextPane();
	textPane_1.setBounds(42, 542, 165, 45);
	login.add(textPane_1);
	textPane_1.setText("  *Забыли логин или пароль?\r\n          Позвоните в службу \r\nподдержки тел. 8-800-300-0550");
	textPane_1.setForeground(new Color(107, 142, 35));
	textPane_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
	textPane_1.setEditable(false);
	//*textPane_1.setDropMode(DropMode.ON);
	textPane_1.setBackground(new Color(221, 160, 221));
	
	//* VVEDITE
	JLabel label_3 = new JLabel("Введите:");
	label_3.setBounds(130, 267, 63, 15);
	login.add(label_3);
	label_3.setForeground(Color.BLACK);
	label_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	
	//* VARNING
	JLabel label = new JLabel("Внимание!");
	label.setBounds(329, 167, 69, 15);
	login.add(label);
	label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	label.setForeground(Color.RED);
	label.setBackground(Color.LIGHT_GRAY);
	
	//* INSTRUCTIONS
	JTextPane textPane = new JTextPane();
	textPane.setBounds(100, 119, 486, 81);
	login.add(textPane);
	textPane.setEditable(false);
	textPane.setBackground(new Color(221, 160, 221));
	textPane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	textPane.setForeground(Color.BLUE);
	//*textPane.setDropMode(DropMode.ON);
	textPane.setText("         Здравствуйте, Вы вользуетесь программой МебельныйРай, \r\n             для продолжения работы необходимо войти в систему.\r\n              Если у Вас нет учетной записи, зарегистрируйтесь или \r\n     войдите как \"обозреватель\".                     В режиме \"обозреватель\" \r\n               нельзя произвести заказ или получить консультацию.");
	
	//* LOGIN
	textField = new JTextField();
	textField.setText("red");
	textField.setBounds(150, 304, 86, 20);
	login.add(textField);
	textField.setColumns(10);
	
	//* PASS
	textField_1 = new JTextField();
	textField_1.setText("red");
	textField_1.setBounds(150, 342, 86, 20);
	login.add(textField_1);
	textField_1.setColumns(10);
	
	//* LOGIN
	JLabel label_1 = new JLabel("Логин - ");
	label_1.setBounds(61, 307, 55, 14);
	login.add(label_1);
	label_1.setHorizontalAlignment(SwingConstants.RIGHT);
	label_1.setVerticalAlignment(SwingConstants.BOTTOM);
	
	//* PASS
	JLabel label_2 = new JLabel("Пароль - ");
	label_2.setBounds(61, 345, 55, 14);
	login.add(label_2);
	label_2.setHorizontalAlignment(SwingConstants.RIGHT);
	label_2.setVerticalAlignment(SwingConstants.BOTTOM);
	
	//* IN
	button = new JButton("ВОЙТИ");
	button.setBounds(121, 376, 86, 23);
	login.add(button);
	button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	button.setForeground(new Color(34, 139, 34));
	button.setBackground(new Color(221, 160, 221));
	
	//* REGISTRATION
	JButton btnNewButton = new JButton("Зарегестрироваться");
	btnNewButton.setBounds(385, 301, 197, 23);
	login.add(btnNewButton);
	btnNewButton.setForeground(new Color(0, 0, 205));
	btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	btnNewButton.setBackground(new Color(221, 160, 221));
	
	//* OBOZREVATEL
	obozr = new JButton("Войти как обозреватель");
	obozr.setBounds(385, 339, 201, 23);
	login.add(obozr);
	obozr.setForeground(Color.RED);
	obozr.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
	obozr.setBackground(new Color(221, 160, 221));
	
	//* EXIT
	button_1 = new JButton("ВЫХОД");
	button_1.setBounds(550, 615, 125, 41);
	login.add(button_1);
	button_1.setBackground(new Color(221, 160, 221));
	button_1.setIcon(new ImageIcon(login.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
	
	
}}
