/**
 * @Author:Elaine
 * @Description:
 * @Date: Created in 下午2:40 2018/1/29
 * @Version: 1.0
 * 题目： 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 */
public class Rabbit {
    public static int rabbitNumber(int n){
        if(n == 1 || n ==2){
            return 1;
        }else{
            return rabbitNumber(n-1) + rabbitNumber(n-2);
        }
    }

    public static void main(String[] arg){
        int sum = rabbitNumber(6);
        System.out.print(sum);
    }

}
