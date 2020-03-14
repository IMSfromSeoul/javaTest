import java.util.Scanner;

public class ExamTest {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String a;

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrInput = sc.nextInt();
            arr[i] = arrInput;
        }

        int arr2[]= new int[n+1-k];
        for(int i=0;i<n+1-k;i++){
            arr2[i]=arr[i];
        }
        int penalty= arr[n-k]-arr[0];
        System.out.println(penalty);
    }
}