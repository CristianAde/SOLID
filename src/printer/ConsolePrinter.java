/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printer;

/**
 *
 * @author Cristian Ade
 */
public class ConsolePrinter implements Printable {

    String text;

    public ConsolePrinter() {
    }

    public ConsolePrinter(String text) {
        this.text = text;
    }
    
    @Override
    public void print() {
        System.out.println("Printing from ConsolePrinter: " + text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
