/*
  * 파일명: hw4_2
  * 작성일: 2018-04-02
  * 작성자: 이현복
  * 내용: (랜덤워크)출벌자좀애서 랜덤으로 출발하여 도착 지점에 도착했는지의 여부 출력 
  */
package hw4_2; // 패키지 이름

public class RandomWalk { // 클래스 RandomWalk

	public static void main(String[] args) { // 메인 함수
		// TODO Auto-generated method stub
	System.out.println("hw4_2: 이현복"); // 출력
	int x = 0, y = 0; // 변수 좌표 x,y 선언
	boolean tile[][] = new boolean[5][5]; // 좌표가 움직인 곳에 대한 흔적을 나타내기 위한 배열 tile 선언
	int steps, count=0; // 움직이는 횟수 steps 변수 , 그 움직인 횟수 count 선언
	int arrivex =(int) (Math.random()*5); // 목표 x 좌표 랜덤으로 저장
	int arrivey =(int) (Math.random()*5); // 목표 y 좌표 랜덤으로 저장
	System.out.println("출발 = (0,0)"); // 출발 지점 출력
	System.out.println("목표 = "+"("+arrivex+","+arrivey+")"); // 도착 지점 출력
	System.out.print("이동 경로:"); // 이동 경로 출력
	tile[0][0]=true; // 시작 좌표는 true
	for (steps = 0; steps < 20; steps++) { // 이동하기 위한 반복문
		int direction =(int) (Math.random()*4); // direction에 0~3까지 반복
		if (direction == 0 && x>=0) // 만약 랜덤으로 0이 나오고 x가 0 이상일 경우
			if ((x-1) < 0) // 만약 x-1이 0보다 작으면
				x=0; // x = 0
			else // 아니면
				x--; // x에 1 빼기
		else if (direction == 1 && x<=4) // 만약 랜덤으로 1이 나오고 x가 4 이하일 경우
			if ((x+1) >= 5) // x+1이 5 이상이면
				x=x; // x=x
			else // 아니면 
				x++; // x에 1 더하기
		else if (direction == 2 && y>=0) // 만약 랜덤으로 2가 나오고 y가 0이상일 경우
			if ((y+1) >= 5) // y+1이 5 이상이면
				y=y; // y=y
			else // 아니면 
				y++; // y에 1 더하기
		else if (y < 4) { // 만약 y가 4 미만이면 
			if ((y-1) < 0) // y-1이 0보다 작으면
				y=0; // y=0
			else // 아니면
				y--; // y에 1 빼기
		}
		System.out.print("("+x+","+y+")"); // 좌표 출력
		tile[x][y] = true; // 랜덤에 의해 이동된 tile의 좌표에 true 저장
		count++; // 이동횟수 1 더하기
		if(x == arrivex && y == arrivey) { // x와 y의 좌표가 도착 좌표와 같으면 
			break; // 반복문 탈출
		}
	}
	System.out.println();
	System.out.println("------------------------");
	for (int j = 0; j < 5; j++) { // y좌표를 위한 반복문
		for (int i =0;i <5; i++) { // x좌표를 위한 반복문
			if (i == 0 && j == 0) { // 출발 지점은
				System.out.print("S"); // S 출력
				continue; // 반복문 시작
			}
			else if (i==arrivex && j == arrivey) { // 도착 지점은
				System.out.print("G"); // G 출력
				continue; // 반복문 시작
			}
			if (tile[i][j] == true) // 만약 좌표가 true 이면
				System.out.print("#"); // # 출력
			else // 아니면
				System.out.print("."); // . 출력
		}
		System.out.println();
	}
	System.out.println("------------------------");
	if(x == arrivex && y == arrivey) { // 좌표가 도착 지점에 오면
		System.out.println("성공"); // 성공
		System.out.println("총 횟수 시도 = "+count); // 총 횟수 시도 출력
	}
	else { // 아니면
		System.out.println("실패"); // 실패
	}
	}
}
