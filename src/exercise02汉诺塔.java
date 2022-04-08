public class exercise02汉诺塔 {
    public static void move(int n, char begin, char assist, char end) {
        if (n == 1) {
            System.out.println("Move disk" + n + "from" + begin + "to" + end);
        } else {
            move(n - 1, begin, end, assist);
            System.out.println("Move disk" + n + "from" + begin + "to" + end);
            move(n - 1, assist, begin, end);
        }
    }

    public static void main(String[] args) {
        move(3, 'A', 'B', 'C');
    }
}
