import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // A hash map to store the last seen index of each character.
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0; // The left pointer of the sliding window.

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the current character is already in the map and its last seen index
            // is within the current window (left <= index), move the left pointer
            // to the right of the previous occurrence.
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the current character.
            charIndexMap.put(currentChar, right);

            // Calculate the length of the current window and update the maximum length.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}