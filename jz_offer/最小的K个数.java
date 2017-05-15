package jz_offer;

import java.util.ArrayList;
import java.util.Arrays;

public class 最小的K个数 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		if(k>input.length)
            return null;
        Arrays.sort(input);
        ArrayList al=new ArrayList();
        for(int i=1;i<=k;i++){
        	al.add(input[i-1]);
        }
        return al;
    }
}
