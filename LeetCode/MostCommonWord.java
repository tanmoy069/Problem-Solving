/**
 * https://leetcode.com/problems/most-common-word/
 */
class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Boolean> bannedMap = new HashMap<>();
        // banned strings are added to map to find quickly
        for(String ban : banned) {
            String str = ban.toLowerCase();
            bannedMap.put(str, true);
        }
        // removing special characters and spliting sentence into word
        String[] words = paragraph.replace(".", " ").replace(",", " ").replace("!", " ").replace("?", " ").replace("'", " ").replace(";", " ").split(" ");
        Map<String, Integer> mapCount = new HashMap<>();
        int max = 0;
        String maxStr = "";
        for(String word : words) {            
            if(word.equals("") || word.equals(" ")) continue;
            // not case sensitive that's why converting all word into lowercase
            String currWord = word.toLowerCase();
            // checking the word available in banned map or not.
            // if found in banned map then skip from calculation
            if(bannedMap.get(currWord) == null) {
                // added all the word in a map with count
                // if new key with that word then start count with one
                // if already exists the word in map key then used count++
                // also check count value with max value.
                // if count value bigger than max value then replace max value with count value and replace max string with current word;
                if(mapCount.get(currWord) == null) {
                    int value = 1;
                    mapCount.put(currWord, value);       
                    if(value > max) {
                        max = value;
                        maxStr = currWord;
                    }
                } else {
                    int value = mapCount.get(currWord) + 1;
                    mapCount.put(currWord, value);
                    if(value > max) {
                        max = value;
                        maxStr = currWord;
                    }
                }
            }
        }
        return maxStr;        
    }
}
