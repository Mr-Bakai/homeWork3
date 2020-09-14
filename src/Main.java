public class Main {

    public static void main(String[] args) {
        // write your code here

        double[] digits = {10, -2, 5, -9, 17, -78, -56, 13, 30, 21, -98, -23, 45, -46, -30};
        int total = 0;
        double sum = 0;
        boolean button = false;


        for (double element : digits) {
            if (button) {
                if (element > 0) {
                    total++; // total = total + element
                    sum += element; // sum = sum + element
                }

            }

            if (element < 0) {
                button  = true;
            }

        }

        System.out.println("Среднее арифметическое " + sum / total);

    }
}
