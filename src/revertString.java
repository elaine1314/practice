/**
 * Created by Elaine on 2018/1/25.
 * 题目：输入"This is Tom"或者abcdefg
 * 结果：输出"Tom is This"或者gfedcba
 */
public class revertString {
    public String revertStr(String str){
        StringBuffer sb = new StringBuffer();
        if(str.contains(" ")){
            String[] revert = str.split(" ");
            for(int i = revert.length-1; i >= 0;i--){
                sb.append(revert[i]+ " ");
            }
        }else{
//            char[] t = str.toCharArray();
//            for(int j = t.length-1; j >= 0; j--){
//                sb.append(t[j]);
//            }
            StringBuffer sf = new StringBuffer(str).reverse();
            sb = sf;
        }

        return sb.toString();
    }

    public static void main(String[] a){
        revertString rs = new revertString();
        String testStr = "abcdefg";
        String result = rs.revertStr(testStr);
        System.out.println(result);
    }


}
