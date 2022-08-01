/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porcentaje5;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class CuadroTexto extends JTextField implements FocusListener {

    @Override
    public void focusGained(FocusEvent e) {
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255,247,2)));
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBorder(null);
    }
    
}
