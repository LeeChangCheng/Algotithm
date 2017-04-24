package base;

public class KMP {

	
	public static int[] getNext(String pattern) {
        int N = pattern.length();
        //next�������iλ��������ַ�����������0��ʼ��ǰi-1λ�Ĳ���ƥ��ֵ
        //�����ַ���ABCDABD������Ӧ��next�����next[5]=1,��"ABCDA"�Ĳ���ƥ��ֵ��1
        int next[] = new int[N + 1];
        next[1] = 0;//��Ȼ�ַ����ĵ�1���ַ������ǰ��׺����Ϊ0

        for (int i = 2; i < N; i++) {//�ӵ�2���ַ���ʼ����

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
     * ��original�ַ�����������ַ���find��λ��
     * @param original ԭʼ�ַ���
     * @param find ��ƥ���ַ���
     * @return ���ҳɹ��򷵻�ƥ������ַ�����λ�ã����򷵻�-1
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
