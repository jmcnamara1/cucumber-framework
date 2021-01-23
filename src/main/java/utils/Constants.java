package utils;

import io.restassured.http.Header;

public class Constants {

    private Constants() {
    }

    public static final Header JSON_CONTENT_TYPE_HEADER = new Header("Content-Type", "application/json");

}
