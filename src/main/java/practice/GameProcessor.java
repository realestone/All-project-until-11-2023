package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GameProcessor {

    String fileWay = "src/main/resources/wordList";

    public List<Word> createWordList() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileWay));
        String singleLine;
        List<Word> wordList = new ArrayList<>();

        while((singleLine = br.readLine()) != null) {
            String[] seperatedValue = singleLine.split(",");
            Word word = new Word();
            word.setActualWord(seperatedValue[0]);
            word.setWordDescription(seperatedValue[1]);
            wordList.add(word);
        }
    return wordList;
    }
    public Word getRandomWord(List<Word> wordList) {
        Collections.shuffle(wordList);
        return wordList.get(0);
    }
    public void playGame() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Word> wordList = createWordList();
        Word randomWord = getRandomWord(wordList);
        String word = randomWord.getActualWord();
        String maskedWord = word.replaceAll("\\D", "*");
        System.out.println(maskedWord);
        System.out.println(word);
        boolean isWordGuessed = false;
        int maxTries = 5;
        int tries = 0;

        while (!(tries > maxTries) && !isWordGuessed) {

            System.out.println("Current: " );
            System.out.println("Word description: " );
            System.out.println("Tries left: " );
            System.out.println("Enter a letter: " );
            String letter = scanner.next();
            System.out.println(letter);
            char[] array = new char[word.length()];


            if (word.contains(letter)) {
                System.out.println(word.indexOf(letter));
                System.out.println(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                    maskedWord.indexOf(array[i]);
                }
                }

            }


        }



    }







