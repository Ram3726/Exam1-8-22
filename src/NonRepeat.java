//Q1. Find out the first non-repetative character from the given String.
//Ex: subhendu
//First non- repeated character is -s

import java.util.*;

public class NonRepeat {

    public static void main(String[] args) {



        String str = "subhendu";

        Map<Character, Integer> name = new LinkedHashMap<>();//created linked Hashmap


        for (int i = 0; i < str.length(); i++) {//loop to iterate character


            if (name.containsKey(str.charAt(i))) {//to check key if map contains key go inside

               int count = name.get(str.charAt(i)) + 1;//get value of that (key) and add 1 on value
                name.put(str.charAt(i), count);//override key and put updated value, that is count value

            } else {
                name.put(str.charAt(i), 1);//else put key and value in name
            }


        }
        System.out.println(name);//printing to see the key and value


        for (Map.Entry<Character, Integer> name1 : name.entrySet()) {//printing value
            if (name1.getValue() == 1) {//check value of key. if key value is 1 then go inside
                System.out.println(name1.getKey());//print the key only
                break;//exit the loop

            }

        }
    }
}