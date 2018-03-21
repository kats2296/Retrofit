package com.example.kats.retrofit;

/**
 * Created by tanya on 21/3/18.
 */

public class Data
{
    private Response response;

    private History history;


    public History getHistory() {
        return history;
    }

    public Response getResponse() {
        return response;

    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Data{" +
                "response=" + response +
                ", history=" + history +
                '}';
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
