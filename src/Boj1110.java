import java.util.Scanner;

public class Boj1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        solove(input);
    }
    public static void solove(int input){
        int cycle = 0;
        int num = input;
        while (true) {
            int temp = num % 10;
            num = (temp * 10) + (num / 10 + num % 10) % 10;
            cycle++;
            if(num == input ){
                System.out.println(cycle);
                break;
            }
        }
    }
}
