/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apiClient;

import java.net.http.HttpResponse;

/**
 *
 * @author Cristian Ade
 */
public class RequestHandler {
    
    public HttpResponse<String> handleRequest(Requestable request){
        return request.doRequest();
    }
    
}
