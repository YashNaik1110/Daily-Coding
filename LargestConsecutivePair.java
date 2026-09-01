public class LargestConsecutivePair {

    public static void main(String[] args) {

        int[] numbers = {4, 7, 2, 9, 5, 1};

        int maxSum = numbers[0] + numbers[1];
        int firstNumber = numbers[0];
        int secondNumber = numbers[1];

        for (int i = 1; i < numbers.length - 1; i++) {

            int currentSum = numbers[i] + numbers[i + 1];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                firstNumber = numbers[i];
                secondNumber = numbers[i + 1];
            }
        }

        System.out.println("Largest consecutive pair: "
                + firstNumber + " + " + secondNumber);

        System.out.println("Largest sum: " + maxSum);
    }
}