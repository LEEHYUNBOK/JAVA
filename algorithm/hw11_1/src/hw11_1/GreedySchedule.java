package hw11_1;

import java.util.*;

public class GreedySchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw11_1 : 이현복");
		Scanner sc = new Scanner(System.in);
		int start; // 시작시간 입력받기 위한 변수
		int end; // 끝나는 시간 입력받기 위한 변수
		String name; // 회의명 입력 받기 위한 변수
		int meeting; // 신청 회의 수 입력 변수
		System.out.print("신청 회의 수 입력:");
		meeting = sc.nextInt(); // 신청 회의 수 입력 변수
		System.out.println(meeting + "개의 회의명과 회의실 사용 시간(시작시와 종료시)을 whitespace로 구분하여 입력:");
		Greedy[] array = new Greedy[meeting]; // 회의정보 객체 배열 변수 array 선언
		for (int i = 0; i < meeting; i++) { // meeting수만큼 반복
			name = sc.next();
			start = sc.nextInt();
			end = sc.nextInt();
			array[i] = new Greedy(name, start, end);
		}
		countingSort(array); // array배열의 end 값 기준으로 오름차순

		int greedyNum = 0; // 그리드된 값을 저장하기 위한 변수
		int last = 0; // 그리드될 값들 중 가장 마지막 변수
		Greedy[] greedy = new Greedy[array.length]; // 그리드된 값을 저장하기 위한 객체 배열 변수
		if (array[0].start >= 6 && array[0].start <= 23 && array[0].end >= 6 && array[0].end <= 23 // 0번째배열의 start가 6이상
																									// 23이하이고 end가 6이상
																									// 23이하이고 end가
																									// start보다 크면
				&& array[0].end > array[0].start) {
			greedy[greedyNum] = array[0]; // greedy에 0번째 삽입
			greedyNum++; // greedyNum 1증가
		}
		for (int i = 1; i < array.length; i++) { // 입력 받은 수만큼 반복
			if (array[i].start >= 6 && array[i].start <= 23 && array[i].end >= 6 && array[i].end <= 23
					&& array[i].end > array[i].start) { // i번째배열의 start가 6이상 23이하이고 end가 6이상 23이하이고 end가 start보다 크면
				if (array[last].end <= array[i].start) { // 만약 last번째의 end값이 i번째의 start값보다 작거나 같으면
					greedy[greedyNum] = array[i]; // greedyNum번째 그리드에 i번째 array추가
					last = i; // last에 i로 저장
					greedyNum++; // greedyNum 1증가
				}
			}
		}
		Greedy[] copy = new Greedy[greedyNum]; // 회의정보 객체 가지는 copy배열 선언
		for (int i = 0; i < copy.length; i++) { // greedy배열 copy에 복사
			copy[i] = greedy[i];
		}

		System.out.println("선정된 회의 수 = " + copy.length);
		for (int i = 0; i < copy.length; i++) { // copy배열 길이만큼 출력
			copy[i].print();
		}
	}

	public static void countingSort(Greedy[] array) { // 기수 정렬
		int k = 0;
		Greedy[] sort = new Greedy[array.length]; // 정렬값 저장하는 배열
		for (int i = 0; i < array.length - 1; i++) { // array배열의 end값중 가장 큰값
			if (array[i].end < array[i + 1].end)
				k = array[i + 1].end;
		}
		int[] c = new int[k + 1]; // k크기만큼 c배열 선언
		for (int i = 1; i < c.length; i++) { // c배열 모든 번째에 0 삽입
			c[i] = 0;
		}
		for (int i = 0; i < array.length; i++) { // i번째 array의 end값에 해당하는 주소에 c값 1 증가
			c[array[i].end]++;
		}
		for (int i = 2; i < c.length; i++) { // 0번째부터 차례대로 더하기
			c[i] = c[i] + c[i - 1];
		}
		for (int i = array.length - 1; i >= 0; i--) { // array배열 크기만큼 1씩 감소하면서 반복
			sort[c[array[i].end] - 1] = array[i]; // array의 end값에 해당하는 번째의 값에 해당하는 번째에 i번째 array저장
			c[array[i].end]--; // c번째 하나 감소
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = sort[i]; // array배열에 다시 옮기기
		}
	}
}
