package Strings;
public class LC_8_StringToIntegerAtoi {
    public static int myAtoi(String s) {
        boolean positive = true;
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int i =0;
        for(char x: s.toCharArray()){
            if(i == 0 && x=='-' ) {
                positive = false;
                continue;
            }
            if(!Character.isDigit(x)) break;
            sb.append(x);
            i++;
        }
        if(sb.length() == 0) return 0;
        int ret = Integer.parseInt(sb.toString());
        if(!positive) ret = ret*(-1);

        return ret;
    }
    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));
    }
}
