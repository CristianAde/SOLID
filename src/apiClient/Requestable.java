/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package apiClient;

import java.net.http.HttpResponse;

/**
 *
 * @author Cristian Ade
 */
public interface Requestable {
    public HttpResponse<String> doRequest();
}
