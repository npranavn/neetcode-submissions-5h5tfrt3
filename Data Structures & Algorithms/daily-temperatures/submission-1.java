class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        // stores indices

        for (int i = n - 1; i >= 0; i--) {

            // Remove all temperatures
            // that are <= current temperature
            while (!stack.isEmpty() &&
                   temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            // Top of stack is next warmer day
            if (!stack.isEmpty()) {
                result[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return result;
    }
}