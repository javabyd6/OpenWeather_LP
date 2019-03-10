package pl.sda.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {

    private Integer last_updated_epoch;
    private String last_updated;
    private Double temp_c;
    private Double temp_f;
    private String is_day;
    private Condition condition;


}
