package base;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
    	int[] count=new int[10];
        for (int i = 0; i < nums.length; i++) {
			switch (nums[i]) {
			case 0:
				count[0]++;
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;
			default:
				break;
			}
        }
			int length=nums.length;
			for (int j = 0; j < count.length; j++) {
			if(count[j]>1)
				length=length-count[j]+1;
			}
			return length;
		}
    public static void main(String[] args) {
    int[] a={1,1,1,2};
		System.out.println(removeDuplicates(a));
	}
	
}
