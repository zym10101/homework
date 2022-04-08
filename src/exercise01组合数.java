public class exercise01组合数 {
    public static int[] assist = new int[5];

    public static void search(int[] arr, int n, int r, int k) {
        if (n < r)
            return;
        if (r == 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(assist[i] + " ");
            }
            System.out.println();
        } else {
            assist[k] = n;
            search(arr, n - 1, r - 1, k + 1);
            search(arr, n - 1, r, k);
        }
    }

    public static void main(String[] args) {
        //int[] a = {1, 2, 3, 4, 5};
        //search(a, 5, 3, 0);
        System.out.println(Math.log(256)/Math.log(2));
    }
}
