/*
 * 파일명: MyIntegerSort.java
 * 작성일: 2018.12.12
 * 작성자: 이현복
 * 설명: 병합 정렬 알고리즘을 이용하여 정수값을 오름차순 정렬하는 프로그램을 작성하시오.
 */
package hw11_1;

public class MyIntegerSort {

	public static void mergeSort(int[] array){
		int lb = 0;
		int ub = array.length-1;
		mergeSort(lb,ub,array);
	}
	public static void mergeSort(int lb, int ub,int[] array){
		int mid;
		if(lb<ub){
			mid = (lb+ub)/2;
			mergeSort(lb, mid, array);
			mergeSort(mid+1, ub, array);
			merge(lb, mid, ub, array);
		}
	}

	public static void merge(int lb, int mid, int ub, int[] array){
		int[] sub = new int[array.length];
		int l = lb;
		int m = mid+1;
		int k = lb;

		while(l<=mid || m<=ub){
			if(l<=mid && m<=ub){
				if(array[l]<=array[m]){
					sub[k] = array[l++];
				}else{
					sub[k] = array[m++];
				}
			}else if(l<=mid && m>ub){
				sub[k] = array[l++];
			}else{
				sub[k] = array[m++];
			}
			k++;
		}

		for(int i=lb; i<ub+1; i++){
			array[i] = sub[i];
		}                                                     
	}
}

