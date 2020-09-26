package fiboSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private static JTextField txtX1;
	private static JTextField txtX2;
	private static JTextField txtIteraciones;
	private JTextArea txtrNoIteraciones;
	private static JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtX1 = new JTextField();
		txtX1.setBounds(44, 42, 86, 20);
		contentPane.add(txtX1);
		txtX1.setColumns(10);
		
		txtX2 = new JTextField();
		txtX2.setBounds(44, 105, 86, 20);
		contentPane.add(txtX2);
		txtX2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null,fibo().toString());
				fibo();
			}
		});
		btnNewButton.setBounds(44, 216, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtrInicio = new JTextArea();
		txtrInicio.setText("Numero 1");
		txtrInicio.setBounds(44, 11, 74, 22);
		contentPane.add(txtrInicio);
		
		JTextArea txtrFin = new JTextArea();
		txtrFin.setText("Numero 2");
		txtrFin.setBounds(44, 73, 74, 22);
		contentPane.add(txtrFin);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(44, 164, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		txtrNoIteraciones = new JTextArea();
		txtrNoIteraciones.setText("No. Iteraciones");
		txtrNoIteraciones.setBounds(24, 131, 132, 22);
		contentPane.add(txtrNoIteraciones);
		
		comboBox = new JComboBox();
		comboBox.setBounds(184, 29, 89, 22);
		contentPane.add(comboBox);
	}
	
	
	public static void fibo() {
	
		int x1= Integer.parseInt(txtX1.getText());
        int x2=Integer.parseInt(txtX2.getText());
        int x3;
        int i=2;
        int ite=Integer.parseInt(txtIteraciones.getText());
        comboBox.removeAllItems();
        
        System.out.println(x1+" "+x2);

      
            do{
            x3=x1+x2;
            comboBox.addItem(Integer.toString(x3));
            System.out.println(x3);
            

            x1=x2;
            x2=x3;
            
        i++;
        }while(i<=ite);
		
            
           // JOptionPane.showMessageDialog(null,x4);
	}
	}


