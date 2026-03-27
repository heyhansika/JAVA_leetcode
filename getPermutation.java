class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        // Step 1: Prepare numbers and factorial
        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);

        k = k - 1; // convert to 0-based index
        StringBuilder result = new StringBuilder();

        // Step 2: Build permutation
        while (true) {
            int index = k / fact;
            result.append(numbers.get(index));
            numbers.remove(index);

            if (numbers.size() == 0) break;

            k = k % fact;
            fact = fact / numbers.size();
        }

        return result.toString();
    }
}
