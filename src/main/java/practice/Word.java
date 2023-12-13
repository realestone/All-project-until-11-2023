package practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Word {

    private String actualWord;
    private String hiddenWord;
    private String wordDescription;


}