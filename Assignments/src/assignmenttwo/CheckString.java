package assignmenttwo;

import java.util.Locale;

public class CheckString {
    public boolean[] constructBooleanArray(String inputString) {
        boolean[] charArray = new boolean[26];
        inputString = inputString.toLowerCase(Locale.ROOT);
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                charArray[ch - 'a'] = true;
            }
        }
        return charArray;
    }

    public boolean checkString(String inputString){
        boolean[] charArray = constructBooleanArray(inputString);
        for(boolean isTrue : charArray){
            if(!isTrue){
                return false;
            }
        }
        return true;
    }

}

