/**
 * Created by Elaine on 2018/1/26.
 * 题目：编程求 1~10000 之间的所有“完全数”，完全数是该数的所有因子之和等于该数的数。例如，6 的因子有 1、2、3，且 6=1+2+3，所以 6 是完全数
 */
public class ComplateNumber {
    public static boolean comNumber(int number){
        int sum = 0;
        for(int i = number -1; i >=1; i--){
            if(number % i == 0){
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * 编程求1~10000之间的所有“完全数”，
         * 完全数是该数的所有因子之和等
         * 于该数的数。例如，6的因子有1、2、3，
         * 且6=1+2+3，所以6是完全数*/
        for(int a=1;a<=1000;a++){
            int num=a;
            if(comNumber(num)){
                System.out.println(num);
            }
        }

    }


}
