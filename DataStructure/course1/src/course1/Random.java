package course1;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("course1: 이현복");
		int[] arr = new int[10];
		int min = 0;
		int num = 0;
		int change = 0;
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*101)+0;
			System.out.print(arr[i]+" ");
		}
		min = arr[0];
		System.out.print("\n");
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				num=i;
			}
		}
		System.out.println("최소값 = "+ min);
		System.out.println("최소값 인덱스 = "+ num); 
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==min && num!=i) {
				min = arr[0];
			}
		}
		change = arr[0];
		arr[0] = min;
		arr[num] = change;
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
