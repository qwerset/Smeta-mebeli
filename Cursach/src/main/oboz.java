// ываыва
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

public class oboz extends JPanel {

	public JTextField textField;
	public JLabel label_1;
	public JButton btnNewButton;
	public JButton button_1;
	public JButton b33;
	public JButton vannaya;
	
	public int tip=0;
	 //* BUTTONFLAG
	
	int but[]={0,0,0,0,0,0,0};
	
	public oboz() {
	
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		JPanel oboz = new JPanel();
		oboz.setBounds(0, 0, 684, 662);
		add(oboz);
		oboz.setLayout(null);
	
		JButton button = new JButton("Мгновенная консультация");
		button.setBounds(19, 10, 208, 23);
		button.setEnabled(false);
		oboz.add(button);
		button.setFont(new Font("Arial", Font.ITALIC, 11));
		button.setForeground(new Color(0, 0, 255));
	
		JLabel label = new JLabel("В вошли как: ");
		label.setBounds(344, 12, 90, 15);
		oboz.add(label);
		label.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		label.setForeground(new Color(0, 128, 0));
	
		label_1 = new JLabel("");
		label_1.setBounds(449, 10, 124, 17);
		oboz.add(label_1);
		label_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnNewButton = new JButton("Выйти");
		btnNewButton.setBounds(583, 9, 88, 23);
		oboz.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 0, 0));
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
		
		//* =================================1 PRODUCT====================================
		
				JLabel l31 = new JLabel("Тумба-раковина");
				l31.setBounds(60, 128, 110, 21);
				oboz.add(l31);
				l31.setHorizontalAlignment(SwingConstants.CENTER);
				
				JButton b31 = new JButton("");
				b31.setBounds(60, 148, 110, 110);
				oboz.add(b31);
				b31.setBackground(Color.WHITE);
				b31.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vannaya.setEnabled(false);
						spalnya.setEnabled(false);
						kuhnya.setEnabled(false);
						
						if (but[1]==0) {
							textField.setText(raschet.PRISE(textField.getText(), tip, 1, but[1]));
							but[1]=1;
							
								
						} else{
							textField.setText(raschet.PRISE(textField.getText(), tip, 1, but[1]));
							but[1]=0;
							
						}
					}});
				
				JCheckBoxMenuItem d31 = new JCheckBoxMenuItem("Доставка");
				d31.setBounds(60, 278, 110, 22);
				oboz.add(d31);
				d31.setBackground(Color.PINK);
				d31.setHorizontalAlignment(SwingConstants.CENTER);
				d31.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (d31.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 2, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 2, 1));
					
					}
				});
				
				JCheckBoxMenuItem s31 = new JCheckBoxMenuItem("Сборка");
				s31.setBounds(60, 256, 110, 22);
				oboz.add(s31);
				s31.setBackground(Color.PINK);
				s31.setHorizontalAlignment(SwingConstants.CENTER);
				s31.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (s31.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 3, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 3, 1));
					
					}
				});
				
			//* ===============================END 1 PRODUCT==================================
			//* =================================2 PRODUCT====================================
						
				JButton b32 = new JButton("");
				b32.setBackground(Color.WHITE);
				b32.setBounds(289, 148, 110, 110);
				oboz.add(b32);
				b32.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vannaya.setEnabled(false);
						spalnya.setEnabled(false);
						kuhnya.setEnabled(false);
						if (but[2]==0) {
								textField.setText(raschet.PRISE(textField.getText(), tip, 4, but[2]));
								but[2]=1;
								
						} else{
							textField.setText(raschet.PRISE(textField.getText(), tip, 4, but[2]));
							but[2]=0;
							
						}
					}});
				
				JLabel l32 = new JLabel("Тумба-раковина");
				l32.setHorizontalAlignment(SwingConstants.CENTER);
				l32.setBounds(289, 128, 110, 21);
				oboz.add(l32);
				
				JCheckBoxMenuItem d32 = new JCheckBoxMenuItem("Доставка");
				d32.setHorizontalAlignment(SwingConstants.CENTER);
				d32.setBackground(Color.PINK);
				d32.setBounds(289, 278, 110, 22);
				oboz.add(d32);
				d32.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (d32.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 5, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 5, 1));
					
					}
				});
				
				JCheckBoxMenuItem s32 = new JCheckBoxMenuItem("Сборка");
				s32.setHorizontalAlignment(SwingConstants.CENTER);
				s32.setBackground(Color.PINK);
				s32.setBounds(289, 256, 110, 22);
				oboz.add(s32);
				s32.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (s32.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 6, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 6, 1));
					
					}
				});
				
			//* ===============================END 2 PRODUCT==================================
			//* =================================3 PRODUCT====================================
				
				b33 = new JButton("");
				b33.setBackground(Color.WHITE);
				b33.setBounds(517, 148, 110, 110);
				oboz.add(b33);
				b33.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vannaya.setEnabled(false);
						spalnya.setEnabled(false);
						kuhnya.setEnabled(false);
						if (but[3]==0) {
								textField.setText(raschet.PRISE(textField.getText(), tip, 7, but[3]));
								but[3]=1;
						} else{
							textField.setText(raschet.PRISE(textField.getText(), tip, 7, but[3]));
							but[3]=0;
						}
					}});
				
				JLabel l33 = new JLabel("Тумба-раковина");
				l33.setHorizontalAlignment(SwingConstants.CENTER);
				l33.setBounds(517, 128, 110, 21);
				oboz.add(l33);
				
				JCheckBoxMenuItem d33 = new JCheckBoxMenuItem("Доставка");
				d33.setHorizontalAlignment(SwingConstants.CENTER);
				d33.setBackground(Color.PINK);
				d33.setBounds(517, 278, 110, 22);
				oboz.add(d33);
				d33.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (d33.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 8, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 8, 1));
					
					}
				});
				
				JCheckBoxMenuItem s33 = new JCheckBoxMenuItem("Сборка");
				s33.setHorizontalAlignment(SwingConstants.CENTER);
				s33.setBackground(Color.PINK);
				s33.setBounds(517, 256, 110, 22);
				oboz.add(s33);
				s33.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (s33.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 9, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 9, 1));
					
					}
				});
				
			//* ===============================END 3 PRODUCT==================================
			//* =================================4 PRODUCT====================================
				
				JLabel l34 = new JLabel("Тумба-раковина");
				l34.setHorizontalAlignment(SwingConstants.CENTER);
				l34.setBounds(60, 329, 110, 21);
				oboz.add(l34);
				
				JButton b34 = new JButton("");
				b34.setBackground(Color.WHITE);
				b34.setBounds(60, 349, 110, 110);
				oboz.add(b34);
				b34.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vannaya.setEnabled(false);
						spalnya.setEnabled(false);
						kuhnya.setEnabled(false);
						if (but[4]==0) {
								textField.setText(raschet.PRISE(textField.getText(), tip, 10, but[4]));
								but[4]=1;
						} else{
							textField.setText(raschet.PRISE(textField.getText(), tip, 10, but[4]));
							but[4]=0;
						}
					}});
				
				JCheckBoxMenuItem d34 = new JCheckBoxMenuItem("Доставка");
				d34.setHorizontalAlignment(SwingConstants.CENTER);
				d34.setBackground(Color.PINK);
				d34.setBounds(60, 479, 110, 22);
				oboz.add(d34);
				d34.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (d34.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 11, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 11, 1));
					
					}
				});
				
				JCheckBoxMenuItem s34 = new JCheckBoxMenuItem("Сборка");
				s34.setHorizontalAlignment(SwingConstants.CENTER);
				s34.setBackground(Color.PINK);
				s34.setBounds(60, 457, 110, 22);
				oboz.add(s34);
				s34.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (s34.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 12, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 12, 1));
					
					}
				});
				
			//* ===============================END 4 PRODUCT==================================
			//* =================================5 PRODUCT====================================
				
				JLabel l35 = new JLabel("Тумба-раковина");
				l35.setHorizontalAlignment(SwingConstants.CENTER);
				l35.setBounds(289, 329, 110, 21);
				oboz.add(l35);
			
				JButton b35 = new JButton("");
				b35.setBackground(Color.WHITE);
				b35.setBounds(289, 349, 110, 110);
				oboz.add(b35);
				b35.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vannaya.setEnabled(false);
						spalnya.setEnabled(false);
						kuhnya.setEnabled(false);
						if (but[5]==0) {
								textField.setText(raschet.PRISE(textField.getText(), tip, 13, but[5]));
								but[5]=1;
						} else{
							textField.setText(raschet.PRISE(textField.getText(), tip, 13, but[5]));
							but[5]=0;
						}
					}});
				
				JCheckBoxMenuItem s35 = new JCheckBoxMenuItem("Сборка");
				s35.setHorizontalAlignment(SwingConstants.CENTER);
				s35.setBackground(Color.PINK);
				s35.setBounds(289, 457, 110, 22);
				oboz.add(s35);
				s35.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (s35.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 15, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 15, 1));
					
					}
				});
				
				JCheckBoxMenuItem d35 = new JCheckBoxMenuItem("Доставка");
				d35.setHorizontalAlignment(SwingConstants.CENTER);
				d35.setBackground(Color.PINK);
				d35.setBounds(289, 479, 110, 22);
				oboz.add(d35);
				d35.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (d35.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 14, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 14, 1));
					
					}
				});
				
			//* ===============================END 5 PRODUCT==================================
			//* =================================6 PRODUCT====================================

				JLabel l36 = new JLabel("Тумба-раковина");
				l36.setHorizontalAlignment(SwingConstants.CENTER);
				l36.setBounds(517, 329, 110, 21);
				oboz.add(l36);
				
				JButton b36 = new JButton("");
				b36.setBackground(Color.WHITE);
				b36.setBounds(517, 349, 110, 110);
				oboz.add(b36);
				b36.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vannaya.setEnabled(false);
						spalnya.setEnabled(false);
						kuhnya.setEnabled(false);
						if (but[6]==0) {
								textField.setText(raschet.PRISE(textField.getText(), tip, 16, but[6]));
								but[6]=1;
						} else{
							textField.setText(raschet.PRISE(textField.getText(), tip, 16, but[6]));
							but[6]=0;
						}
					}});
				
				JCheckBoxMenuItem s36 = new JCheckBoxMenuItem("Сборка");
				s36.setHorizontalAlignment(SwingConstants.CENTER);
				s36.setBackground(Color.PINK);
				s36.setBounds(517, 457, 110, 22);
				oboz.add(s36);
				s36.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (s36.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 18, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 18, 1));
					
					}
				});
				
				JCheckBoxMenuItem d36 = new JCheckBoxMenuItem("Доставка");
				d36.setHorizontalAlignment(SwingConstants.CENTER);
				d36.setBackground(Color.PINK);
				d36.setBounds(517, 479, 110, 22);
				oboz.add(d36);
				d36.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if (d36.isSelected())
						textField.setText(raschet.PRISE(textField.getText(), tip, 17, 0));
					else
						textField.setText(raschet.PRISE(textField.getText(), tip, 17, 1));
					
					}
				});
			//* ===============================END 6 PRODUCT==================================
				
				//* SUMM textField.setText(raschet.PRISE
				JLabel label_2 = new JLabel("Общая стоимость:");
				label_2.setBounds(67, 626, 132, 15);
				oboz.add(label_2);
				label_2.setBackground(Color.LIGHT_GRAY);
				label_2.setForeground(Color.RED);
				label_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
					
				//* EXIT					
				button_1 = new JButton("ВЫХОД");
				button_1.setBounds(550, 614, 124, 41);
				oboz.add(button_1);
				button_1.setIcon(new ImageIcon(user.class.getResource("/javax/swing/plaf/metal/icons/ocean/warning.png")));
				button_1.setBackground(Color.LIGHT_GRAY);
			
			//* PIK KAETEGORY	
				vannaya.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						tip =3;
						zanaves.setVisible(false);
						vannaya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
						vannaya.setForeground(Color.RED);
						vannaya.setBounds(440, 55, 200, 60);
						spalnya.setFont(new Font("Arial", Font.BOLD, 14));
						spalnya.setBounds(241, 55, 200, 50);
						spalnya.setForeground(Color.BLACK);
						kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
						kuhnya.setBounds(42, 55, 200, 50);
						kuhnya.setForeground(Color.BLACK);
						l31.setText("Тумба-раковина");
						l32.setText("Светильник");
						l33.setText("Душевая кабина");
						l34.setText("Напольный камод");
						l35.setText("Зеркало-шкаф");
						l36.setText("Зеркало");
						}
				});
				
				kuhnya.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						tip =1;
						zanaves.setVisible(false);
						kuhnya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
						kuhnya.setForeground(Color.RED);
						kuhnya.setBounds(42, 55, 200, 60);
						spalnya.setFont(new Font("Arial", Font.BOLD, 14));
						spalnya.setBounds(241, 55, 200, 50);
						spalnya.setForeground(Color.BLACK);
						vannaya.setFont(new Font("Arial", Font.BOLD, 14));
						vannaya.setBounds(440, 55, 200, 50);
						vannaya.setForeground(Color.BLACK);
						l31.setText("Гарнитур (тип А)");
						l32.setText("Гарнитур (тип Б)");
						l33.setText("Гарнитур (тип В)");
						l34.setText("Стол со стульями");
						l35.setText("Кухонный угол");
						l36.setText("Шкаф навесной");
						}
				});
				spalnya.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						tip =2;
						zanaves.setVisible(false);
						spalnya.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
						spalnya.setForeground(Color.RED);
						spalnya.setBounds(241, 55, 200, 60);
						kuhnya.setFont(new Font("Arial", Font.BOLD, 14));
						kuhnya.setBounds(42, 55, 200, 50);
						kuhnya.setForeground(Color.BLACK);
						vannaya.setFont(new Font("Arial", Font.BOLD, 14));
						vannaya.setBounds(440, 55, 200, 50);
						vannaya.setForeground(Color.BLACK);
						l31.setText("Кровать (тип А)");
						l32.setText("Кровать (тип Б)");
						l33.setText("Кровать (тип В)");
						l34.setText("Тумба прикроватная");
						l35.setText("Шкаф");
						l36.setText("Зеркало настенное");
					}
				});
			//* END PIK KAETEGORY	
			}
		}
