package school.mjc.stage0.conditions.task3;


public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel");
        } else if (character >= 'A' && character <='Z' || character >= 'a' && character <='z'){
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
