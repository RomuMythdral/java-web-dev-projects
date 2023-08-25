package src;
import java.util.Hashmap;
import java.util.Map;




public class CharacterCounter {

    public static void main(String[] args) {
        String hardcodedString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = hardcodedString.toCharArray();

        Hashmap <Character, Integer> characterMap = new HashMap<>();

        for(char c : charactersInString) {
            if (characterMap.containsKey(c)) {
                characterMap.put(c, characterMap.get(c) + 1);
            } else {
                characterMap.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> c: characterMap.entrySet()){
            System.out.println(c.getKey() +": " + c.getValue());

        }
       // System.out.println(CharacterMap);
    }
}
