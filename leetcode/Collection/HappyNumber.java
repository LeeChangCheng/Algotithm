package leetcode.Collection;

public class HappyNumber {
	public boolean isHappy(int n) {
        if (n < 1) {
            return false;
        }

        // ���ڱ����м���ֵĽ��
        HashSet<Integer> set = new HashSet<>(32);

        int tmp;
        int newN;

        // n��Ϊ1������n��ֵ�����ظ����֣��������ѭ��
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            newN = 0;
            while (n > 0) {
                tmp = n % 10;
                n /= 10;
                newN += tmp * tmp;
            }

            n = newN;
        }

        return n == 1;
    }
}
