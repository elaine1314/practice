
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chengc32 on 2018/1/18.
 */
public class accountStr {
    public static Pattern patternNumber = Pattern.compile("(.)\\1*");
    public static String accountNum(String value) {

        Matcher matcher = patternNumber.matcher(value);
        List<String> result = new ArrayList<String>();
        while (matcher.find()) {
            int count = matcher.group().length();
            if (count > 1) {
                result.add(matcher.group().substring(0, 1));
            } else {
                result.add(matcher.group());
            }
            if (count != 1) {
                if (count < 10) {
                    result.add(String.valueOf(count));
                } else {
                    char[] size = String.valueOf(count).toCharArray();
                    for (int i = 0; i < size.length; i++) {
                        result.add(String.valueOf(size[i]));
                    }
                }
            }
        }

        System.out.println(result.size());
        System.out.println(result.toString());
        return result.toString();

    }

    public static void main(String[] str) {
        char[] chars = {'a', 'a', 'b', 'b', 'b','b','b','b','b', 'b', 'b','b','b','b', 'c', 'a', 'a', 'b'};
        String s = String.valueOf(chars);
        accountNum(s);
    }
}
