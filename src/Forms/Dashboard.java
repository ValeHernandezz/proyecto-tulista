package Forms;

import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private static double promedioV=0;
	private static int cantidadP=0;
	private static HashMap<String, Integer> vehiculosPorDepartamento;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(cantidadP, promedioV, vehiculosPorDepartamento);
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
	
	public Dashboard(int cantidadPersona, double promedioVehiculos,HashMap<String, Integer> vehiculosPorDepartamento) {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 826, 38);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_titulo_dashboard = new JLabel("Estadísticas de TuLista");
		lbl_titulo_dashboard.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 22));
		lbl_titulo_dashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo_dashboard.setBounds(0, 0, 833, 38);
		panel.add(lbl_titulo_dashboard);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 48, 788, 294);
		contentPane.add(panel_1);
		
		JLabel lbl_cantidad_persona = new JLabel("Personas ingresadas: "+cantidadPersona);
		panel_1.add(lbl_cantidad_persona);
		lbl_cantidad_persona.setFont(new Font("HP Simplified", Font.PLAIN, 19));
		
		JLabel lbl_promedio_vehiculos = new JLabel("Promedio de vehículos por persona: "+promedioVehiculos);
		panel_1.add(lbl_promedio_vehiculos);
		lbl_promedio_vehiculos.setFont(new Font("HP Simplified", Font.PLAIN, 19));
		
		JLabel lbl_vehiculos_departamento = new JLabel("Vehículos por departamento: "+vehiculosPorDepartamento);
		panel_1.add(lbl_vehiculos_departamento);
		lbl_vehiculos_departamento.setVerticalAlignment(SwingConstants.TOP);
		lbl_vehiculos_departamento.setFont(new Font("HP Simplified", Font.PLAIN, 19));
	}
}
