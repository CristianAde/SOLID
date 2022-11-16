/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apiClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import static java.time.temporal.ChronoUnit.SECONDS;

/**
 *
 * @author Cristian Ade
 */
public class GetRequest implements Requestable {

    String uri;

    public GetRequest(String uri) {
        this.uri = uri;
    }

    @Override
    public HttpResponse<String> doRequest() {
        HttpResponse<String> response = null;
        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .GET()
                    .timeout(Duration.of(10, SECONDS))
                    .uri(new URI(uri))
                    .build();

            HttpClient client = HttpClient.newHttpClient();

            try {
                response = client.send(getRequest, BodyHandlers.ofString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        return response;
    }
}
