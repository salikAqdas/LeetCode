package Strings;

public class LC_2299_StrongPasswordCheckerII {
    public boolean isLowerCase(char c) {
        return "abcdefghijklmnopqrstuvwxyz".indexOf(c) >= 0;
    }

    public boolean isUpperCase(char c) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c) >= 0;
    }

    public boolean symbolMatch(char c) {
        return "!@#$%^&*()-+".indexOf(c) >= 0;
    }

    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8)
            return false;
        int i = 0;
        boolean foundLowercase = false;
        boolean foundUppercase = false;
        boolean foundSymbol = false;
        boolean foundDigit = false;
        char c = password.charAt(i);
        if (Character.isLetter(c)) {
            foundLowercase = isLowerCase(c);
            foundUppercase = isUpperCase(c);
        } else if (Character.isDigit(c)) {
            foundDigit = true;
        } else {
            foundSymbol = symbolMatch(c);
            if (!foundSymbol)
                return false;
        }
        i++;
        while (i < password.length()) {
            c = password.charAt(i);
            char x = password.charAt(i - 1);
            if (c == x)
                return false;
            if (Character.isLetter(c)) {
                if(!foundLowercase) foundLowercase = isLowerCase(c);
                
                if(!foundUppercase) foundUppercase = isUpperCase(c);
            } else if (Character.isDigit(c)) {
                foundDigit = true;
            } else {
                if(!foundSymbol) foundSymbol = symbolMatch(c);
                if (!foundSymbol)
                    return false;
            }
            i++;
        }
        return foundLowercase && foundUppercase && foundSymbol && foundDigit;
    }
    public static void main(String[] args) {
        LC_2299_StrongPasswordCheckerII obj = new LC_2299_StrongPasswordCheckerII();
        String password = "IloveLe3tcode!";
        System.out.println(obj.strongPasswordCheckerII(password));
    }
}
