package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class call {
    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api-mock-akm-ptpoc.payments.jpmorgan.com/tsapi/v1/payments?firmRootId=596c0f34-7d7a-4f9b-b6f8-91704a63828a"))
                .header("client_id", "0030000131")
                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IkcwUWx0cndpNV9MSXRUME45STNOX2ZqemoyayIsImtpZCI6IkcwUWx0cndpNV9MSXRUME45STNOX2ZqemoyayJ9.eyJhdWQiOiJKUE1DOlVSSTpSUy0xMTAwNTgtMTA0NDA0LVdQVEFQSU1PQ0tTSVQtREVWIiwiaXNzIjoiaHR0cDovL2lkYWQuanBtb3JnYW5jaGFzZS5jb20vYWRmcy9zZXJ2aWNlcy90cnVzdCIsImlhdCI6MTY4MDc4MzMxMiwibmJmIjoxNjgwNzgzMzEyLCJleHAiOjE2ODA3OTA1MTIsIkpQTUNJZGVudGlmaWVyIjoiSzAxNjY3OCIsIlJvbGUiOiJtb2NrX3VzZXItMTA0NDA0LTExMDA1OC1ERVYiLCJDbGllbnRJUEFkZHJlc3MiOiIxMDAuNzEuMTEyLjEwNCIsImF1dGhtZXRob2QiOlsiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2F1dGhlbnRpY2F0aW9ubWV0aG9kL3Rsc2NsaWVudCIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9hdXRoZW50aWNhdGlvbm1ldGhvZC94NTA5Il0sImFwcHR5cGUiOiJDb25maWRlbnRpYWwiLCJhcHBpZCI6IkNDLTExMDA1OC1LMDE2Njc4LTE3ODA4Ny1ERVYiLCJhdXRoX3RpbWUiOiIyMDIzLTA0LTA2VDEyOjE2OjEyLjEyM1oiLCJ2ZXIiOiIxLjAifQ.LL2LmYwheZVQUNEhWJAbHkCiw3ZPCVr82w4uGZOvrNqj7FVwhIrMKCRYHZYlhGRB_TF2u_hVT40vFBTPfpOxqEF-XgLeeaJUGxH5LB3eATDkRt9pq9feEvI4jh-lMdh9PNHCm8JaTbclAttO-4LmUwV4vdglhOWJabOiBku1BwHE4rAWnT9hL_3qTQcjKyN0wRWeD-IAXG8jBDQRboOBgbDanHhWK71Eh5F4qbFJcxj9r8NheB9H1THZOOO8a1-tNhO4hsJctnVE26nyx4kLmobzztYIiDGeHJnMfrWJSFIYVCeL-_KDaQ1evalbdLhLDsBqz09UEFDaKH95FjzlYw")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
    }
}
