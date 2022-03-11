package mid;

//단순 연결리스트로 선형 리스트를 구현한 클래스
public class MyList {

	// 리스트 노드 구조를 표현하는 클래스
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}
	// 리스트의 맨 앞 원소를 가리키는 인스턴스 변수
	private Node head = null;

	// (4) item을 리스트의 맨 앞에 삽입하는 메소드
	public void addFirst(int item) {
		Node temp = new Node(item);
		temp.link = head;
		head = temp;
	}

	// (5) 리스트의 원소 합을 리턴하는 메소드(이 메소드 내에 출력문 없음)
	public int getSum() {
		Node num = head;
		int sum = 0;
		while(num != null) {
			sum+= num.data;
			num = num.link;
		}
		return sum;
	}
}
