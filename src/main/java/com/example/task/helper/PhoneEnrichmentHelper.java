package com.example.task.helper;

import com.example.task.model.Phone;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class PhoneEnrichmentHelper {

    public Phone enrich(Phone phone) throws IOException {
        Response response = getDetails(phone.getName());

        /*
         * Response processing should be here
         */

        return phone;
    }

    private Response getDetails(String phoneName) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.techspecs.io/v4/product/detail?productId=63e96260ff7af4b68a304280")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Accept-Encoding", "")
                .addHeader("Authorization", "Bearer <eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImN1c19OU0VIZGg3TnpzRzh6ZSIsIm1vZXNpZlByaWNpbmdJZCI6InByaWNlXzFNUXF5dkJESWxQbVVQcE1SWUVWdnlLZSIsImlhdCI6MTY3Nzc5MzA3N30.NJKITQzi4vw7TrLuiguhnTb7TPH0ACqC3FaBiV1rP5s>")
                .build();

        return client.newCall(request)
                .execute();
    }

    public static void main(String[] args) {
        try {
            new PhoneEnrichmentHelper().enrich(null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}