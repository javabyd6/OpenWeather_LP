package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.Service.WeatherService;
import pl.sda.weather.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta");
        String city = scanner.nextLine();


        ObjectMapper mapper = new ObjectMapper();

        WeatherService weatherService = new WeatherService("https://api.apixu.com/v1/current.json", "e2fc5f174f2e4a3fa12115806191003");
        Weather weather = weatherService.getCityWeather(city);

        System.out.println("Miasto: "+ city +" "+"-"+" "+ "Temperatura: " + weather.getCurrent().getTemp_c());

     }
}
