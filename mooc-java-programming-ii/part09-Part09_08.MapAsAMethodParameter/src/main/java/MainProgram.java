import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> testMap = new HashMap<>();

        testMap.put("terve", "healthy");
        testMap.put("sairas", "ill");
        returnSize(testMap);
        System.out.println(returnSize(testMap));
    }

    private static int returnSize(Map<String, String> map) {
        return map.size();
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter
    // and returns the size of the map object
}
