package utils;

public class PropertyUtils {

    private PropertyUtils() {
    }

    public static String getPostCodeIoUrl() {
        return Configuration.get("postcode.io.url");
    }
}
