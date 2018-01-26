
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by elaine on 2018/1/18.
 * 题目：输入{'a', 'a', 'b', 'b', 'b','b','b','b','b', 'b', 'b','b','b','b', 'c', 'a', 'a', 'b'}
 * 结果：输出[a, 2, b, 1, 2, c, a, 2, b]
 */
public class accountStr {
    // 第一种方法
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

        System.out.println("第一种方法"+result.size());
        System.out.println("第一种方法"+result.toString());
        return result.toString();

    }

    // 第二种方法
    public static void getChars(char[] chars){
        int count = 0;
        int temp = 0;
        List<String> result = new ArrayList<String>();

        for(int i = 0; i<chars.length;i++){
            for(int j = i; j< chars.length;j++){

                if(i == chars.length -1 && chars[i-1] != chars[i]){
                    result.add(chars[i] + "");
                }else if(i == chars.length -1 && chars[i-1] == chars[i]){
                    result.add(chars[i] + "");
                    result.add((chars.length-1)- temp + "");
                }
                else{
                    if(chars[i] != chars[j]){
                        result.add(chars[i] + "");
                        count = j - i;
                        if (count < 10) {
                            if(count != 1) {
                                result.add(count + "");
                            }
                        } else if(count >= 10){
                            char[] size = String.valueOf(count).toCharArray();
                            for (int n = 0; n < size.length; n++) {
                                result.add(String.valueOf(size[n]));
                            }
                        }

                        temp = j - 1;
                        i = temp;
                        break;
                    }
                }
            }
        }

        System.out.println("第二种方法"+result.size());
        System.out.println("第二种方法"+result.toString());
    }

    public static void main(String[] str) {
        char[] chars = {'a', 'a', 'b', 'b', 'b','b','b','b','b', 'b', 'b','b','b','b', 'c', 'a', 'a', 'b'};
        String s = String.valueOf(chars);
        accountNum(s);
        getChars(chars);
    }
}
