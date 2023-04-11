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
                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IkcwUWx0cndpNV9MSXRUME45STNOX2ZqemoyayIsImtpZCI6IkcwUWx0cndpNV9MSXRUME45STNOX2ZqemoyayJ9.eyJhdWQiOiJKUE1DOlVSSTpSUy0xMTAwNTgtMTA0NDA0LVdQVEFQSU1PQ0tTSVQtREVWIiwiaXNzIjoiaHR0cDovL2lkYWQuanBtb3JnYW5jaGFzZS5jb20vYWRmcy9zZXJ2aWNlcy90cnVzdCIsImlhdCI6MTY4MTIzNjk0NiwibmJmIjoxNjgxMjM2OTQ2LCJleHAiOjE2ODEyNDQxNDYsIkpQTUNJZGVudGlmaWVyIjoiSzAxNjY3OCIsIlJvbGUiOiJtb2NrX3VzZXItMTA0NDA0LTExMDA1OC1ERVYiLCJDbGllbnRJUEFkZHJlc3MiOiIxMDAuNzEuMTEyLjgwIiwiYXV0aG1ldGhvZCI6WyJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvYXV0aGVudGljYXRpb25tZXRob2QvdGxzY2xpZW50IiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2F1dGhlbnRpY2F0aW9ubWV0aG9kL3g1MDkiXSwiYXBwdHlwZSI6IkNvbmZpZGVudGlhbCIsImFwcGlkIjoiQ0MtMTEwMDU4LUswMTY2NzgtMTc4MDg3LURFViIsImF1dGhfdGltZSI6IjIwMjMtMDQtMTFUMTg6MTY6NDYuNzYxWiIsInZlciI6IjEuMCJ9.HDlqoMpD5KhZXplJn84jJUdvzj4rfDRUuQ0F36Q5_2T_b8IUn0bGcDhwF8aMbx4P4bz7Y2QzZsHefqSBTygXMImekqq-NZQndChdEvsy_CApbnVcbnADATMF_ETdIqpohrw4V5TGVuS2-COojEwzd_45TxzaQbtNkRM6yLfrwT9GINq67UwBmC9Ux5vlsZvhK_uLwO7v1QZzdEWZU7YN4900hmJGuG11JMb3c9QCcQjxcLdUqwmHo5r1mE2o4_7IzkxRFhaKNAt3vjS_LKiqRrS4svD6WiiUdIHfaCk3a1S6OZSe3iXqk7IGOUGFI8WNTbAwp6gCXka6MKdLAR5Rpw")
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
