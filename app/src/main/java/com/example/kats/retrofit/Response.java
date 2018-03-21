package com.example.kats.retrofit;

/**
 * Created by tanya on 21/3/18.
 */

public class Response
{
    private String version;
    private String termsofService;

    public Response(String version, String termsofService) {
        this.version = version;
        this.termsofService = termsofService;
    }

    public String getVersion() {
        return version;
    }

    public String getTermsofService() {
        return termsofService;
    }
}
