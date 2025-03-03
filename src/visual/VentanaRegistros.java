package visual;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaRegistros {

	public JFrame frame;
	public JTextField fieldVertice;
	public JTextField fieldLatitud;
	public JTextField fieldLongitud;
	public JTextField fieldOrigen;
	public JTextField fieldDestino;
	public JTextField fieldPeso;
	public JButton buttonSalir;
	public JButton buttonGuardarVertice;
	public JButton buttonGuardarArista;
	public JRadioButton buttonRadio;
	public JComboBox<String> boxUbicaciones;
	public JButton buttonCargarPredeterminado;
	public JButton buttonEjecutarPrim;
	public JButton buttonEjecutarKruskal;
	public JButton buttonLimpiarMapa;

	public VentanaRegistros() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		buttonSalir = new JButton("SALIR");
		buttonSalir.setBounds(212, 352, 70, 22);
		frame.getContentPane().add(buttonSalir);
		
		fieldVertice = new JTextField();
		fieldVertice.setBounds(13, 49, 86, 20);
		frame.getContentPane().add(fieldVertice);
		fieldVertice.setColumns(10);
		
		fieldLatitud = new JTextField();
		fieldLatitud.setBounds(13, 90, 86, 20);
		frame.getContentPane().add(fieldLatitud);
		fieldLatitud.setColumns(10);
		
		fieldLongitud = new JTextField();
		fieldLongitud.setBounds(13, 128, 86, 20);
		frame.getContentPane().add(fieldLongitud);
		fieldLongitud.setColumns(10);
		
		buttonGuardarVertice = new JButton("GUARDAR");
		buttonGuardarVertice.setBounds(13, 230, 89, 23);
		frame.getContentPane().add(buttonGuardarVertice);
		
		fieldOrigen = new JTextField();
		fieldOrigen.setBounds(387, 49, 86, 20);
		frame.getContentPane().add(fieldOrigen);
		fieldOrigen.setColumns(10);
		
		fieldDestino = new JTextField();
		fieldDestino.setBounds(387, 90, 86, 20);
		frame.getContentPane().add(fieldDestino);
		fieldDestino.setColumns(10);
		
		buttonGuardarArista = new JButton("GUARDAR");
		buttonGuardarArista.setBounds(387, 167, 89, 23);
		frame.getContentPane().add(buttonGuardarArista);
		
		buttonRadio = new JRadioButton("");
		buttonRadio.setBounds(120, 167, 21, 23);
		frame.getContentPane().add(buttonRadio);
		
		boxUbicaciones = new JComboBox<String>();
		boxUbicaciones.setBounds(13, 197, 99, 22);
		frame.getContentPane().add(boxUbicaciones);
		
		JLabel lblNewLabel = new JLabel("Vertice");
		lblNewLabel.setBounds(13, 29, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Latitud");
		lblNewLabel_1.setBounds(13, 75, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Longitud");
		lblNewLabel_2.setBounds(13, 113, 70, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Usar Ubicaciones");
		lblNewLabel_3.setBounds(13, 171, 106, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vertice Origen");
		lblNewLabel_4.setBounds(387, 35, 100, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vertice Destino");
		lblNewLabel_5.setBounds(387, 75, 100, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		fieldPeso = new JTextField();
		fieldPeso.setBounds(387, 128, 46, 20);
		frame.getContentPane().add(fieldPeso);
		fieldPeso.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Peso");
		lblNewLabel_6.setBounds(387, 113, 86, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		buttonCargarPredeterminado = new JButton("CARGAR VERTICES DE PRUEBA");
		buttonCargarPredeterminado.setFont(new Font("Tahoma", Font.PLAIN, 9));
		buttonCargarPredeterminado.setBounds(156, 288, 180, 23);
		frame.getContentPane().add(buttonCargarPredeterminado);
		
		buttonEjecutarPrim = new JButton("EJECUTAR PRIM");
		buttonEjecutarPrim.setBounds(156, 254, 180, 23);
		frame.getContentPane().add(buttonEjecutarPrim);
		
		buttonEjecutarKruskal = new JButton("EJECUTAR KRUSKAL");
		buttonEjecutarKruskal.setBounds(156, 220, 180, 23);
		frame.getContentPane().add(buttonEjecutarKruskal);
		
		JLabel lblNewLabel_7 = new JLabel("CREAR ARISTA");
		lblNewLabel_7.setBounds(387, 11, 126, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CREAR VERTICE");
		lblNewLabel_8.setBounds(13, 11, 99, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		buttonLimpiarMapa = new JButton("LIMPIAR MAPA");
		buttonLimpiarMapa.setBounds(192, 318, 112, 23);
		frame.getContentPane().add(buttonLimpiarMapa);
		
		frame.setVisible(true);
	}
}
