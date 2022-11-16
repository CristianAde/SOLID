/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import apiClient.GetRequest;
import apiClient.PostRequest;
import apiClient.RequestHandler;
import apiClient.Requestable;
import com.google.gson.Gson;
import java.net.http.HttpResponse;
import model.Post;
import printer.ConsolePrinter;
import printer.PopupPrinter;
import printer.PrinterHandler;

/**
 *
 * @author Cristian Ade
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Post post = new Post(10,10,"Title","Body");
        Gson gSon = new Gson();
        String jSon = gSon.toJson(post);
        
        
        ConsolePrinter consolePrinter = new ConsolePrinter();
        PopupPrinter popupPrinter = new PopupPrinter();
        
        Requestable getRequest = new GetRequest("https://jsonplaceholder.typicode.com/posts");
        Requestable postRequest = new PostRequest("https://jsonplaceholder.typicode.com/posts", jSon);
        
        RequestHandler requestHandler = new RequestHandler();
        PrinterHandler printerHandler = new PrinterHandler();
        
        HttpResponse<String> response = requestHandler.handleRequest(getRequest);
        printResponse(consolePrinter, response, printerHandler, popupPrinter);
        
        response = requestHandler.handleRequest(postRequest);
        printResponse(consolePrinter, response, printerHandler, popupPrinter);
        
        
        
        
    }

    private static void printResponse(
            
            ConsolePrinter consolePrinter, 
            HttpResponse<String> response, 
            PrinterHandler printerHandler, 
            PopupPrinter popupPrinter) {
        
        consolePrinter.setText(response.body());
        printerHandler.handlePrint(consolePrinter);
        popupPrinter.setText(response.toString());
        printerHandler.handlePrint(popupPrinter);
        
    }
}
