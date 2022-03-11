/*
 * ���ϸ�: MyIntegerSort.java
 * �ۼ���: 2018.12.12
 * �ۼ���: ������
 * ����: ���� ���� �˰����� �̿��Ͽ� �������� �������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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

