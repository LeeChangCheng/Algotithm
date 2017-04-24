package base;

public class KMP {

	
	public static int[] getNext(String pattern) {
        int N = pattern.length();
        //next数组里第i位保存的是字符串索引（从0开始）前i-1位的部分匹配值
        //比如字符串ABCDABD，它对应的next数组的next[5]=1,即"ABCDA"的部分匹配值是1
        int next[] = new int[N + 1];
        next[1] = 0;//显然字符串的第1个字符的最大前后缀长度为0

        for (int i = 2; i < N; i++) {//从第2个字符开始计算

            if (pattern.charAt(i - 1) == pattern.charAt(next[i - 1])) {
                next[i] = next[i - 1] + 1;//
            } else if (pattern.charAt(i - 1) == pattern.charAt(0)) {
                next[i] = 1;
            } else {
                next[i] = 0;
            }

        }
        return next;
    }
	
	 /**
     * 在original字符串里查找子字符串find的位置
     * @param original 原始字符串
     * @param find 待匹配字符串
     * @return 查找成功则返回匹配的首字符索引位置，否则返回-1
     */
    public static int indexOf(String original, String find) {
        int next[] = getNext(find);
        int j = 0;
        for (int i = 0; i < original.length(); i++) {
            while (j > 0 && original.charAt(i) != find.charAt(j))
                j = next[j];
            if (original.charAt(i) == find.charAt(j))
                j++;
            if (j == find.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }
}
