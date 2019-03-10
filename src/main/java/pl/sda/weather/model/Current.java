package pl.sda.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {

    private String last_updated_epoch;
    private String last_updated;
    private int temp_c;
    private int temp_f;
    private int is_day;
    private Condition condition;
    private double wind_mph;
    private double wind_kph;
    private int wind_degree;
    private String wind_dir;
    private int pressure_mb;
    private double pressure_in;
    private int precip_mm;
    private int precip_in;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double feelslike_f;
    private int vis_km;
    private int vis_miles;
    private int uv;


}
