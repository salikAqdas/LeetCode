package Strings;

public class LC_168_convertToTitle {
    public String getCharacter(int i){
        return (char)(65+((i-1)%26))+"";
    }
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 26){
            int x = (columnNumber/26);
            int y = columnNumber%26;
            String curr = getCharacter(y);
            sb.append(curr);
            columnNumber = columnNumber / 26;
        }
        sb.append(getCharacter(columnNumber));

        return sb.reverse().toString();

    }
    public static void main(String[] args) {
        LC_168_convertToTitle obj = new LC_168_convertToTitle();
        System.out.println(obj.convertToTitle(52));
    }

    
}