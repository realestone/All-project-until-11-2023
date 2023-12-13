package boilerplacecode;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Helicopter {
    private String name;
    private int speed;
    private Car car; //asocijacija
    private List<Pilot> pilots;
}

