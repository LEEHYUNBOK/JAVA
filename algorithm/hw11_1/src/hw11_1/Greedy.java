package hw11_1;

public class Greedy {
	// TODO Auto-generated method stub
	String name;	//	ȸ������ name
	int start;		// ȸ�� ���� start 
	int end;		// ȸ�� �� end

	public Greedy(String name, int start, int end) {
		this.name = name; // name ����
		this.start = start; // start ����
		this.end = end; // end ����
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

	public void print() { // ȸ�� ���� ���
		System.out.println(name + " (" + start + ", " + end + ")");
	}

}
