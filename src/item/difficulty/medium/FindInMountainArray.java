package item.difficulty.medium;

/**
 * 1095. 山脉数组中查找目标值
 * 
 * @author Administrator
 *
 */
public class FindInMountainArray {

	/**
	 * 第 1 步：先找到山顶元素 mountaintop 所在的索引。 
	 * 第 2 步：在前有序且升序数组中找 target所在的索引，如果找到了，就返回，如果没有找到，就执行第 3 步；
	 * 第 3 步：如果步骤 2 找不到，就在后有序且降序数组中找 target 所在的索引。
	 * @param target
	 * @param mountainArr
	 * @return
	 */
	public int findInMountainArray(int target, MountainArrayImpl mountainArr) {
		int n = mountainArr.length();
		// 步骤 1：先找到山顶元素所在的索引
		int mountaintop = findMountaintop(mountainArr, 0, n - 1);
	      // 步骤 2：在前有序且升序数组中找 target 所在的索引
        int res = findFromSortedArr(mountainArr, 0, mountaintop, target);
        
        if (res != -1) {
            return res;
        }
        // 步骤 3：如果步骤 2 找不到，就在后有序且降序数组中找 target 所在的索引
        return findFromInversedArr(mountainArr, mountaintop + 1, n - 1, target);
	}

	/**
	 * 方法描述:找到最高的元素
	 * @param mountainArr
	 * @param i
	 * @param j
	 * @return
	 */
	private int findMountaintop(MountainArrayImpl mountainArr, int left, int right) {
		// 返回山顶元素
		while (left < right) {
			int mid = left + (right - left) / 2;
			// 取左中位数，因为进入循环，数组一定至少有 2 个元素
			// 因此，左中位数一定有右边元素，数组下标不会发生越界
			if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
				// 如果当前的数比右边的数小，它一定不是山顶
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		// 根据题意，山顶元素一定存在，因此退出 while 循环的时候，不用再单独作判断
		return left;
	}
	
	private int findFromSortedArr(MountainArray mountainArr, int l, int r, int target) {
        // 在前有序且升序数组中找 target 所在的索引
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mountainArr.get(mid) < target) {
                l = mid + 1;
            } else {
                r = mid;
            }

        }
        // 因为不确定区间收缩成 1个数以后，这个数是不是要找的数，因此单独做一次判断
        if (mountainArr.get(l) == target) {
            return l;
        }
        return -1;
    }

    private int findFromInversedArr(MountainArray mountainArr, int l, int r, int target) {
        // 在后有序且降序数组中找 target 所在的索引
        while (l < r) {
            int mid = l + (r - l) / 2;
            // 与 findFromSortedArr 方法不同的地方仅仅在于由原来的小于号改成大于好
            if (mountainArr.get(mid) > target) {
                l = mid + 1;
            } else {
                r = mid;
            }

        }
        // 因为不确定区间收缩成 1个数以后，这个数是不是要找的数，因此单独做一次判断
        if (mountainArr.get(l) == target) {
            return l;
        }
        return -1;
    }

}
