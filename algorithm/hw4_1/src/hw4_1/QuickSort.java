package hw4_1;

import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hw4_1 : 이현복");
		System.out.println();

		int num = 0; 											// 단어 수 입력받을 num 정의
		while (true) { 											// 양의 정수를 받기 위한 반복문
			System.out.print("단어 수 입력:");
			num = sc.nextInt();									// 사용자로부터 키보드로 양의 정수 n을 입력
			if (num <= 0) { 									// num이 양의 정수가 아닐 경우
				System.out.println("다시 입력하시오");
				continue;
			} else 												// num이 양의 정수일 경우
				break;
		}
		String[] word = new String[num]; 						// word 배열 정의
		System.out.print(num + "개의 단어 입력: ");
		for (int i = 0; i < num; i++) {
			word[i] = sc.next(); 								// word에 단어 차례로 입력
		}

		quickSort(word, 0, num - 1);
		System.out.print("퀵 정렬 결과 = ");
		for (int i = 0; i < num; i++) {
			System.out.print(word[i] + " "); 					// word 정렬된거 출력하기
		}
	}

	public static void quickSort(String[] a, int min, int max) {// 재귀 quickSort메소드 정의
		if (min < max) {
			int pivot = partition(a, min, max); 				// partition메소드 실행해서 나온 값 q에 저장
			quickSort(a, min, pivot - 1); 						// quickSort메소드 q를 기준으로 앞쪽(p~q-1) 배열 재귀 실행
			quickSort(a, pivot + 1, max); 						// quickSort메소드 q를 기준으로 뒷쪽(q+1~r) 배열 재귀 실행
		}
	}

	public static int partition(String[] a, int min, int max) {
		String compare = a[max]; 								// 배열 끝부분에 있는 문자열을 기준점이 되는 compare에 저장
		int pivot = min - 1;									// min부터 max을 정열하기 위해 p-1를 pivot에 저장, min부터 올라오면서 다음 기준점이 되는 변수
		String change; 											// 교환을 위한 change 정의
		for (int j = min; j < max; j++) { 						// 처음인 min부터 max 까지 반복
			if (a[j].compareToIgnoreCase(compare) <= -1) { 		// j번째 문자열이 compare보다 작으면
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
