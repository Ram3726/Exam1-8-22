package checkWord;

import java.util.HashMap;

public class Sentence {

    public static void main(String[] args) {
        String  sentence = "I am learning java java and spring spring";//sentence


        String str [] = sentence.split(" ");//remove space and keep into array


        HashMap<String, Integer> words = new HashMap<>();//Hashmap declared

        for (int i = str.length -1; i >= 0; i--)//loop to iterate from top to down
        {
            if(words.containsKey(str[i])) {// if Hashmap contains word as key, go inside the block
                int count = words.get(str[i]);//count will get Integer value of Hashmap. Count will be 1.
                words.put(str[i], ++count);//Hashmap will add that key and value will increment by 1
            }
            else
            {
                words.put(str[i],1);//if Hashmap does not contain key then add into Hashmap. word will be key and value 1
            }
        }
        System.out.println(words);//print Hashmap words

    }
}
