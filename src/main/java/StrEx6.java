import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StrEx6 {
    public String rutgon(String n) {
        n = n + " ";
        String newStr = "";
        int count = 1;
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) == n.charAt(i - 1)) {
                count++;
            } else {
                newStr += n.charAt(i - 1);
                if (count != 1) {
                    newStr += count;
                }
                count = 1;
            }
        }
        return newStr;
    }
}
