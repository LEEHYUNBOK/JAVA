package hw5_1;

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hw5_1 : 이현복");
		
		String[] word = new String[20]; 						// word 배열 정의
		
		System.out.print("20개의 단어 입력: ");
		for (int i = 0; i < 20; i++) {
			word[i] = sc.next(); 								// word에 단어 차례로 입력
		}
		
		
		System.out.println("1번째 작은 단어 = "+select(word,0,word.length-1,1));
		System.out.println("6번째 작은 단어 = "+select(word,0,word.length-1,6));
		System.out.println("17번째 작은 단어 = "+select(word,0,word.length-1,17));
		System.out.println("20번째 작은 단어 = "+select(word,0,word.length-1,20));
	}
	public static String select(String[] a,int p,int r,int i) {
		if(p==r)												// a배열의 크기가 1일 경우 a[p]를 리턴
			return a[p];
		int q = partition(a,p,r);								// partition메소드에서 나오는 기준값을 q에 저장
		int k = q-p+1;											// k는 a배열에서 k번째 작은 원소임
		if(i<k)													// 만약 k가 i보다 크면
			return select(a,p,q-1,i);							// p~q-1까지로 해서 다시 찾는다
		else if(i==k)											// 만약 같으면 q번째 리턴
			return a[q];
		else													// k가 i보다 작으면
			return select(a,q+1,r,i-k);							// q+1~r까지로 해서 i-k번째 작은 원소 찾기
	}
	public static int partition(String[] a, int min, int max) {
		String compare = a[max]; 								// 배열 끝부분에 있는 문자열을 기준점이 되는 compare에 저장
		int pivot = min - 1;									// min부터 max을 정열하기 위해 p-1를 pivot에 저장, min부터 올라오면서 다음 기준점이 되는 변수
		String change; 											// 교환을 위한 change 정의
		for (int j = min; j < max; j++) { 						// 처음인 min부터 max 까지 반복
			if (a[j].compareToIgnoreCase(compare) <= 0) { 		// j번째 문자열이 compare보다 작으면
				change = a[++pivot]; 							// ++pivot번째 문자열과 compare보다 작은 j번째 문자열을 교환
				a[pivot] = a[j]; 								// 다음 기준점이 되기위해 하나씩 올려줘야함
				a[j] = change;
			}
		}
		change = a[pivot + 1];									// compare번쨰 문자열과 현 기준점 문자열을 교환
		a[pivot + 1] = a[max];
		a[max] = change;

		return pivot + 1; 										// 다음 기준점이 되는 compares+1을 리턴
	}
}
