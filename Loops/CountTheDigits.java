// Count the number of digits in a number

public class CountTheDigits{
    public static void main(String[] args) {
        
        int num = 345678;
        int count = 0;
        while(num>0){
            num = num / 10;
            count++;
            
        }

        System.out.println(count);
    }
}