package base;

public class Manacher {
	private static String preProcess (String s){
        int n = s.length();
        if (n == 0 ) return "^$" ;
        String result = "^" ;
        for ( int i = 0 ; i < n; i++) {
            result += "#" + s.charAt(i);
        }
        result += "#$" ;
        return result;
    }

// the original implementation in C/C++

    public static String getLongestPalindrome (String s){
        char [] T = preProcess(s).toCharArray();
        int n = T.length;
        int [] P = new int [n];
        int C = 0 , R = 0 ;
        for ( int i = 1 ; i < n- 1 ; i++) {
            int i_mirror = 2 *C - i; // equals to i' = C - (i-C)
            if ( i < R ) {
                P[i] = Math.min(R-i, P[i_mirror]);
            } else {
                P[i] = 0 ;
            }
// Attempt to expand palindrome centered at i
            while ( T[i+ 1 +P[i]] == T[i- 1 -P[i]] )
                P[i]++;
// if palindrome centered at i expand past R

// adjust center based on expanded palindrome
            if ( i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }
        int maxLen = 0 ;
        int centerIndex = 0 ;
        for ( int i = 1 ; i < n- 1 ; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        int beginIndex = (centerIndex- 1 -maxLen)/ 2 ;
        return s.substring(beginIndex, beginIndex+maxLen);
    }
}
