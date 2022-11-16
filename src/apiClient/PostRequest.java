/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apiClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian Ade
 */
public class PostRequest implements Requestable {

    String uri;
    String jSon;

    public PostRequest(String uri, String jSon) {
        this.uri = uri;
        this.jSon = jSon;
    }

    @Override
    public HttpResponse<String> doRequest() {
        HttpResponse<String> response = null;

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(uri))
                    .POST(BodyPublishers.ofString(jSon))
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            response = client.send(request, BodyHandlers.ofString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return response;
    }

}
