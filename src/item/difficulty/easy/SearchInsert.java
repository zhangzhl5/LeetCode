package item.difficulty.easy;

/**
 * 35. 搜索插入位置
 * @author Administrator
 *
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
    	int left = 0;
    	int n = nums.length;
    	int right = n - 1;
    	while(left < right) {
    		int mid = left + (right-left)/2;
    		if(nums[mid] == target ) {
    			return mid;
    		}
    		if(nums[mid] < target) {
    			left = mid;
    		} else 
    			right = mid;
    	}
		return left;

    }
    
    public static void main(String[] args) {
    	SearchInsert searchInsert = new SearchInsert();
    	int d = searchInsert.searchInsert(new int[]{1,3,5,6}, 2);
    	System.out.println(d);
    			
	}
}
