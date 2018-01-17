/**
 * Created by elaine on 2018/1/17.
 */
public class MaxValue {
    public static String maxValue(String[] value){
        for(int i = 0;i < value.length;i++){
            for(int j = 0; j < value.length;j++){
                if(compare(value[i],value[j])){
                    String temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }

        String num = "";
        for(String va : value){
            num += va;
        }

        return num;
    }

    public static boolean compare(String str1,String str2){
        int length = str1.length() + str2.length();
        String str3 = str1 + str2;
        String str4 = str2 + str1;
        for(int i = 0; i < length;i++){
            if(Integer.parseInt(str3.substring(i,i+1)) > Integer.parseInt(str4.substring(i,i+1))){
                return true;
            }
            if(Integer.parseInt(str3.substring(i,i+1)) < Integer.parseInt(str4.substring(i,i+1))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] value = new int[]{8, 90, 56, 9, 4, 123, 91};
        String[] str = new String[value.length];
        for(int i = 0; i< value.length;i++){

            str[i] = value[i] +"";
        }

        System.out.println(maxValue(str));

    }
}
