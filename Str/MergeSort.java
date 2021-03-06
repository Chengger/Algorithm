package Str;
/**
 * nums1=[1,2,3,0,0,0];nums2=[2,5,6];m=3,n=3;
 * res=[1,2,3,4,5,6]
 * @author Administrator
 *
 */
public class MergeSort {
	public void merge(int[] nums1,int m,int[] nums2,int n) {
		int index1 = m-1,index2 = n-1;
		int indexMerge = m+n-1;
		while (index1 >= 0 || index2 >=  0) {
			if (index1 < 0) {
				nums1[indexMerge--] = nums2[index2--];
			}else if (index2 < 0) {
				nums1[indexMerge--] = nums1[index1--];
			}else if (nums1[index1] > nums2[index2]) {
				nums1[indexMerge--] = nums1[index1--];
			}else {
				nums1[indexMerge--] = nums2[index2--];
			}
		}
	}
}
