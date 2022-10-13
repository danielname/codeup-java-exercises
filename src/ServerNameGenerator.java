import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {"kind", "fat", "young", "healthy", "organic", "amicable", "intelligent", "glossy", "bad", "mediocre"};
    static String[] nouns = {"person", "duck", "imp", "alert", "watch", "friend", "chair", "park", "president", "soldier"};
    public static String randomPick(String[] array){
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(array.length) + 1;
        return array[randomIndex];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name:%n%s-%s", randomPick(ServerNameGenerator.nouns), randomPick(ServerNameGenerator.adjectives));
    }
}
