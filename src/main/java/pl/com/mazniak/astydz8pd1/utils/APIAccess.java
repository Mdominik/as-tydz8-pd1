package pl.com.mazniak.astydz8pd1.utils;

public class APIAccess {
    static String api_key = "56e4cec4e8b920e53d26c8d5b1aa520d";
    static String url = "http://api.weatherstack.com/current?access_key=56e4cec4e8b920e53d26c8d5b1aa520d&query=";

    static public String getUrlByCity(String city) {
        return url.concat(city);
    }
}
