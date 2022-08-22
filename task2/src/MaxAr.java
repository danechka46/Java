import java.util.Scanner;

public class MaxAr {
    public String finderMax(int n){
        Scanner sc = new Scanner(System.in);
        int count,max = 0;
        String word = "";
        String[] ar = new String[n];
        for(int i = 0; i< n; i++){
            System.out.println("Введите "+(i+1)+" элемент");
            ar[i] = sc.next();
            count = ar[i].length();
            if(count > max) {
                max = count;
                word = ar[i];
            }
        }
        return word;
    }
}
