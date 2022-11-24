public class Task {
    public void taskOne() {
        long num = 600851475143L;
        int i = 1;
        while (num != 1) {
            i++;
            if ((num % i) == 0) {
                num = num / i;
                System.out.println(i);
            }
        }

    }}