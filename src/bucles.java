public class bucles {
    public static void main(String[] args) {
        int num = 0;

        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        num = 0;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);

        num = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

    }
}