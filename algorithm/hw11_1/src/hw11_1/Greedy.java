package hw11_1;

public class Greedy {
	// TODO Auto-generated method stub
	String name;	//	회의정보 name
	int start;		// 회의 시작 start 
	int end;		// 회의 끝 end

	public Greedy(String name, int start, int end) {
		this.name = name; // name 저장
		this.start = start; // start 저장
		this.end = end; // end 저장
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void print() { // 회의 정보 출력
		System.out.println(name + " (" + start + ", " + end + ")");
	}

}
