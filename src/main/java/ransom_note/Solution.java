package ransom_note;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/ransom-note/">Problem</a>
 */
class Solution {

    private Map<Character, Integer> calculate(String word) {
        final var map = new HashMap<Character, Integer>();

        for (final var ch : word.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }

        return map;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        // 'magazine' doesn't  have enough characters
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        final var ransomNoteCharacters = calculate(ransomNote);
        final var magazineCharacters = calculate(magazine);

        for (final var entry : ransomNoteCharacters.entrySet()) {
            final var magazineCharacterCount = magazineCharacters.get(entry.getKey());

            if (magazineCharacterCount == null || magazineCharacterCount < entry.getValue()) {
                return false;
            }
        }

        return true;
    }

}
