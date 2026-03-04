class Solution {
    public String convert(String s, int numRows) {
        
        // Edge case
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create rows
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = true;

        // Place characters in zigzag
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            currentRow += goingDown ? 1 : -1;
        }

        // Combine rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
