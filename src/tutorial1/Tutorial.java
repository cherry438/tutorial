package tutorial1;

public class Tutorial {
    public static void main(String[] args) {
        System.out.println("안녕 세상");
        int n = 0;
        n += addNumber(n, 5);
        System.out.println(n);
    }

    public static int addNumber(int number, int addendum) {
        return number + addendum;
    }
}
