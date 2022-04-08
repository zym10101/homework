import java.util.Scanner;
public class exercise03全排列 {
    public static void permute(int[] arr,int k,int m) {
        if (k == m) {
            for (int i=0;i<=m;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        } else {
            for (int i = k; i <= m; i++) {
                swap(arr, k, i);
                permute(arr, k + 1, m);
                swap(arr, k, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ints = new int[num];
        for (int i = 0; i < num; i++) {
            ints[i]= sc.nextInt();
        }
        permute(ints,0,ints.length-1);
    }
}
