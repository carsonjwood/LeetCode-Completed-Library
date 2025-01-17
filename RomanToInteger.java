
//  Roman to Integer

public class RomanToInteger {
    public int romanToInt(String s) {
        int ret = 0;
            for (int i = 0; i < s.length(); i++) {  
                char c = s.charAt(i);
        
                switch(c) {
                case 'I':
                    try {
                    char x = s.charAt(i+1);
                    } catch (StringIndexOutOfBoundsException e) {
                    ret = ret + 1;
                    break;
                    }
                    if((s.charAt(i+1)) == 'V'){
                        ret = ret + 4;
                        i++;
                    } else if ((s.charAt(i+1)) == 'X'){
                        ret = ret + 9;
                        i++;
                    } else {
                        ret = ret + 1;
                    }
                break;

                case 'V':
                ret = ret + 5;
                break;

                case 'X':
                    try {
                    char x = s.charAt(i+1);
                    } catch (StringIndexOutOfBoundsException e) {
                     ret = ret + 10;
                     break;
                    }
                    if((s.charAt(i+1)) == 'L'){
                        ret = ret + 40;
                        i++;
                    } else if ((s.charAt(i+1)) == 'C'){
                        ret = ret + 90;
                        i++;
                    } else {
                        ret = ret + 10;
                    }
                break;

                case 'L':
                ret = ret + 50;
                break;

                case 'C':
                    try {
                    char x = s.charAt(i+1);
                    } catch (StringIndexOutOfBoundsException e) {
                    ret = ret + 100;
                    break;
                    }
                    if((s.charAt(i+1)) == 'D'){
                        ret = ret + 400;
                        i++;
                    } else if ((s.charAt(i+1)) == 'M'){
                        ret = ret + 900;
                        i++;
                    } else {
                        ret = ret + 100;
                    }
                break;

                case 'D':
                ret = ret + 500;
                break;

                case 'M':
                ret = ret + 1000;
                break;

                default:
                i++;
                }
            }
            return ret;
    }
}
