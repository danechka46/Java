import java.util.Scanner;

public class MaxAr {
    public int finderMax(int n){
        Scanner sc = new Scanner(System.in);
        int count,max = 0;
        String[] ar = new String[n];
        for(int i = 0; i< n; i++){
            System.out.println("Введите "+(i+1)+" элемент");
            ar[i] = sc.next();
            count = ar[i].length();
            if(count > max)
                max = count;
        }
        return max;
    }
}
