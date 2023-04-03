/**
 * Problem Link : https://leetcode.com/problems/backspace-string-compare/
 */
class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        String sStr = removeBackspaceFromString(s);
        String tStr = removeBackspaceFromString(t);
        // compare both string after removing backspace from two string
        return sStr.equals(tStr);
    }

    /**
     *  get string after removing backspace
     */
    private String removeBackspaceFromString(String str) {
        StringBuilder newString = new StringBuilder();
        for(char c : str.toCharArray()){
            // if the char is not # then add to string builder as it is
            if(c != '#'){
                newString.append(c);
            }
            // otherwise remove previous character
            // check just newString is not empty
            else if(newString.length() != 0) {
                newString.deleteCharAt(newString.length() - 1);
            }
        }
        return newString.toString();
    }
}
