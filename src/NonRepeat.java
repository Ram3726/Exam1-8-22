//Q1. Find out the first non-repetative character from the given String.
//Ex: subhendu
//First non- repeated character is -s

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeat {

    public static void main(String[] args) {

        String str = "subhendu";

        // Map<Character,Integer > name = new HashMap<>();


        List<Character> name = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {

            if (name.contains(str.charAt(i))) {
                continue;
            } else {
                name.add(str.charAt(i));
            }


        }
        System.out.println(name);


        /*    // name.put(str.charAt(i),1);


        }
        for(Map.Entry<Character, Integer> check : name.entrySet()){

            System.out.println(check.getKey());

        }





*/




    }
}