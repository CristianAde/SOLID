/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printer;

import apiClient.Requestable;
import java.net.http.HttpResponse;

/**
 *
 * @author Cristian Ade
 */
public class PrinterHandler {
    
    public void handlePrint(Printable printer){
        printer.print();
    }
    
}
