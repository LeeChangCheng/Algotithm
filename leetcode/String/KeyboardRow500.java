package leetcode.String;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 判断哪些字符串在键盘的同一行
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
   Output: ["Alaska", "Dad"]
 * @author Administrator
 *
 */
public class KeyboardRow500 {
	public String[] findWords(String[] words) {
        String[] strs={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
        	for(char c:strs[i].toCharArray()){
        		map.put(c, i);
        	}	
        }
        List<String> res=new LinkedList<>();
        for(String w:words){
        	if(w.equals("")) 
        		continue;
        	int index=map.get(w.toUpperCase().charAt(0));
        	for(char c:w.toUpperCase().toCharArray()){
        		if(map.get(c)!=index){
        			index=-1;
        			break;
        		}
        	}
        	if(index!=-1)
        		res.add(w);
        }
        return res.toArray(new String[0]);
    }
}
