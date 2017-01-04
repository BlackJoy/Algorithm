package T12;

public class Solution {
	
	public String intToRoman(int num) {
		
        String [][] c = {
        	{"","I","II","III","IV","V","VI","VII","VIII","IX"},
            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
            {"","M","MM","MMM"}
        };
        
        String roman = "" ;
        roman+=(c[3][num / 1000 % 10]);
        roman+=(c[2][num / 100 % 10]);
        roman+=(c[1][num / 10 % 10]);
        roman+=(c[0][num % 10]);
         
        return roman;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
