/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printer;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Ade
 */
public class PopupPrinter implements Printable {

    String text;

    public PopupPrinter() {
    }

    public PopupPrinter(String text) {
        this.text = text;
    }
    
    @Override
    public void print() {
        JOptionPane.showMessageDialog(null, text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
