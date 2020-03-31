package item.specialtopic.sort;

/**
 * 快速排序（Quicksort）是对冒泡排序的一种改进。 
 * 快速排序由C. A. R. Hoare在1960年提出。
 * 它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
 * 
 * @author Administrator
 *
 */
public class QuickSort {
	
	public static int[] quickSort(int arr[],int start,int end) {        
	    int pivot = arr[start];        
	    int i = start;        
	    int j = end;        
	    while (i < j) {            
	        while ((i < j)&&(arr[j] > pivot)) {                
	            j--;            
	        }            
	        while ((i < j)&&(arr[i] < pivot)) {                
	            i++;            
	        }            
	        if ((arr[i] == arr[j])&&( i < j)) {                
	            i++;            
	        } else {                
	            int temp = arr[i];                
	            arr[i] = arr[j];                
	            arr[j] = temp;            
	        }        
	    }        
	    if (i-1 > start) arr = quickSort(arr,start,i-1);        
	    if (j+1 < end) arr = quickSort(arr,j+1,end);        
	    return (arr);    
	}    
	 
	public static void main(String[] args) {        
	    int arr[] = new int[]{3,3,3,7,9,122344,4656,34,34,4656,5,6,7,8,9,343,57765,23,12321};        
	    int len = arr.length-1;        
	    arr = quickSort(arr,0,len);        
	    for (int i:arr) {            
	        System.out.println(i+"\t");        
	    }    
	}
	 
}
