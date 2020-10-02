package tutorial1;

public class Tutorial {
    public static void main(String[] args) {
        System.out.println("안녕 세상");
        int n = 0;
        // 아래 코드는 두개의 숫자를 더하는 기능입니다.
        /*
            이것도
            저것도
            요것도
         */
        n += addNumber(n, 5);
        System.out.println(n);
    }

    public static int addNumber(int number, int addendum) {
        return number + addendum;
    }
}
