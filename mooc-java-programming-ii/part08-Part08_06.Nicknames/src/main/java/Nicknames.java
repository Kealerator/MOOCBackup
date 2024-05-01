
import java.util.HashMap;

public class Nicknames {

    /*
     * 
     * matthew's nickname is matt
     * michael's nickname is mix
     * arthur's nickname is artie
     * 
     */

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));
    }

}
