/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porcentaje5;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Porcentaje5 implements ActionListener{

    
    private static JPanel panel2;
    private static JButton botonCalcular;
    private static CuadroTexto valorCuadro;
    private static CuadroTexto porcentajeCuadro;
    private static JLabel valorEtiqueta;
    private static final String opcion[]={"","porcentaje de...","aumento porcentual","disminucion porcentual"};
    private static File icono;
    private static JLabel porcentajeEtiqueta;
    private static JLabel resultadoEtiqueta;
    private static Font myFont; 
    private static Font myFont2;
    private static JComboBox opciones;
    private static JLabel operacionEtiqueta; 
            
     
    public static void main(String[] args) {
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        myFont = new Font("Arial Black",Font.BOLD,15);
        icono = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Porcentaje5\\src\\porcentaje5\\S-tools.png");
        myFont2 = new Font("Arial Black",Font.BOLD,20);
        
        opciones = new JComboBox(opcion);
        
        JFrame frame = new JFrame();
        frame.setBounds(50,50,270,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(270,300));
        frame.setTitle("S-Tools");
        frame.setResizable(false);
        
        
        /*tituloEtiqueta = new JLabel("S-Tools");
        tituloEtiqueta.setForeground(WHITE);
        tituloEtiqueta.setFont(myFont);*/
        valorEtiqueta = new JLabel("Valor inicial:");
        porcentajeEtiqueta = new JLabel("Porcentaje:");
        valorCuadro = new CuadroTexto();
        porcentajeCuadro = new CuadroTexto();
        botonCalcular = new JButton("Calcular");
        resultadoEtiqueta = new JLabel("Resultado");
        operacionEtiqueta = new JLabel();
        
        frame.add(panel2);
        
        panel2.add(valorEtiqueta);
        panel2.add(porcentajeEtiqueta);
        panel2.add(opciones);
        panel2.add(valorCuadro);
        panel2.add(porcentajeCuadro);
        panel2.add(botonCalcular);
        panel2.add(resultadoEtiqueta);
        panel2.add(operacionEtiqueta);
        
        //tituloEtiqueta.setBounds(25,25,100,100);
        
        opciones.setBounds(20,20,210,25);
        opciones.setForeground(new Color(255,247,2));
        opciones.setBackground(new Color(24,24,24));
        opciones.setSelectedItem(opcion[1]);
        
        valorEtiqueta.setBounds(20, 60, 120, 25);
        valorEtiqueta.setFont(myFont);
        valorEtiqueta.setForeground(new Color(255,247,2));
        
        valorCuadro.setBounds(150,60,80,25);
        valorCuadro.setBackground(new Color(24,24,24));
        valorCuadro.setBorder(null);
        valorCuadro.setForeground(new Color(255,247,2));
        valorCuadro.addFocusListener(valorCuadro);
        
        porcentajeEtiqueta.setBounds(20,100,120,25);
        porcentajeEtiqueta.setFont(myFont);
        porcentajeEtiqueta.setForeground(new Color(255,247,2));
        
        porcentajeCuadro.setBounds(150,100,80,25);
        porcentajeCuadro.setBackground(new Color(24,24,24));
        porcentajeCuadro.setBorder(null);
        porcentajeCuadro.setForeground(new Color(255,247,2));
        porcentajeCuadro.addFocusListener(porcentajeCuadro);
        
        botonCalcular.setBounds(65,150,120, 25);
        botonCalcular.setFont(myFont);
        botonCalcular.setBackground(new Color(255,247,2));
        botonCalcular.setForeground(new Color(40,40,40));
        botonCalcular.setBorder(null);
        botonCalcular.addActionListener(new Porcentaje5());
        
        resultadoEtiqueta.setBounds(65,200,400,25);
        resultadoEtiqueta.setFont(myFont2);
        resultadoEtiqueta.setForeground(new Color(176,255,75));
        
        operacionEtiqueta.setBounds(65,230,300,25);
        operacionEtiqueta.setForeground(new Color(255,247,2));
        
        panel2.setBackground(new Color(40,40,40));
        
        frame.setVisible(true);
      
        
        
        
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
          float valorInicial = Float.parseFloat(valorCuadro.getText());;
        float resultado; 
        float porcentaje = Float.parseFloat(porcentajeCuadro.getText());
        String opcionMenu = (String) opciones.getSelectedItem();
        
        
        if(opcionMenu.equals("porcentaje de...")){
            resultado = (valorInicial*porcentaje)/100;
            resultadoEtiqueta.setText(""+resultado);
            operacionEtiqueta.setText(""+porcentaje+"% de "+valorInicial);
        }
        else if(opcionMenu.equals("aumento porcentual")){
            resultado = valorInicial + ((valorInicial*porcentaje)/100);
            resultadoEtiqueta.setText(""+resultado);
            operacionEtiqueta.setText(""+valorInicial+" + "+porcentaje+"%");
        }
        else if(opcionMenu.equals("disminucion porcentual")){
            resultado = valorInicial - ((valorInicial*porcentaje)/100);
            resultadoEtiqueta.setText(""+resultado);
            operacionEtiqueta.setText(""+valorInicial+" - "+porcentaje+"%");
        }
        else {
            JOptionPane.showMessageDialog(null,"Elija una opcion en el menu antes de realizar calculos");
        }
        }
        catch(Exception numberFormat){
          JOptionPane.showMessageDialog(null,"Solo se permite ingresar numeros");
        }
        
        
        
        
        valorCuadro.setText(null);
        porcentajeCuadro.setText(null);
    }
    
}
