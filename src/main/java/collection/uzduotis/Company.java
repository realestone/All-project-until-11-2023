package collection.uzduotis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {

    String name;

    List<Integer> id;

    Set<String> employersNames;

    Map<Integer, Employers> employersMap;



    List<Integer> fillListWithEmployersID(){
        id.add(3456);
        id.add(6667);
        id.add(9900);
        id.add(4422);
        return id;
    }

    public static void main(String[] args) {
        List<Integer> id = new ArrayList<>();


    }

    }


