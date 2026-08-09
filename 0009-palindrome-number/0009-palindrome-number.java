class Solution {
    public boolean isPalindrome(int x) {
        // Handle edge cases: negative numbers and numbers ending in zero
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Compare the original number and the reversed half
        // x == reversedHalf handles even digit count
        // x == reversedHalf / 10 handles odd digit count
        return x == reversedHalf || x == reversedHalf / 10;
    }
}

        
    
