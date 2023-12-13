package practice;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private List<Word> wordList;

    private String userName;


}
