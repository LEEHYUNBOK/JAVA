/*
 * 파일명: MyBinarySearchTree.java
 * 작성일: 2018.11.13
 * 작성자: 이현복
 * 설명: int형 키값 저장하는 이진탐색트리를 연결자료구조로 구현한 클래스
 */
package hw9_1;

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) 트리의 노드를 표현하는 private 클래스 Node - 필드(int형 key, leftChild, rightChild), 생성자(key값을 매개변수로 받아 초기화)
	private class Node{
		int key;
		Node leftChild;
		Node rightChild;
		Node(int key){
			this.key = key;
			leftChild = null;
			rightChild = null;
		}
	}
	// (2) private 인스턴스 변수 트리의 루트 노드를 가킬 변수(root)를 선언하고 null로 초기화
	private Node root = null;

	// 트리에 키값 key를 삽입하는 메소드
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p를 루트로 하는 트리에 키값 key를 삽입하고, 삽입 후 루트를 리턴하는 메소드(재귀 알고리즘)
	private Node insertKey(Node p, int key) {
		if(p == null) {  
			Node newNode = new Node(key);
			return newNode; 
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;  // 루트 불변
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;  // 루트 불변       
		}
		else {  // key = p.key 인 경우 삽입 실패
			System.out.println("삽입 실패. 중복된 키값이 존재합니다: " + key);
			return p;   // 루트 불변
		}
	}  

	// 트리를 중위순회하며 출력하는 메소드
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p를 루트로 하는 트리를 중위 순회하며 키값을 출력하는 메소드(재귀 알고리즘)
	private void inorder(Node p) {
		if(p != null) {
			inorder(p.leftChild);
			System.out.print(p.key+" ");
			inorder(p.rightChild);
		}
	}

	// (4) 트리의 최대 키값을 리턴하는 메소드(반복 알고리즘) - 공백 트리인 경우 NoSuchElementException 예외 발생
	public int max() {
		if(root == null) {
			throw new NoSuchElementException();
		}
		else {
			Node t = root;
			while(t.rightChild != null) {
				t = t.rightChild;
			}
			return t.key;
		}
	}

	// 트리가 키값 key를 포함하는지 여부를 리턴하는 메소드
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p를 루트로 하는 트리에 키값 key가 존재하는지 여부를 리턴하는 메소드(재귀 알고리즘)
	private boolean search(Node p, int key) {
		if(p == null) 
			return false;
		if(p.key == key)
			return true;
		if(p.key > key)
			return search(p.leftChild,key);
		else
			return search(p.rightChild,key);
	}

	// (6) 트리에 키값 key를 삽입 하는 메소드(반복 알고리즘) - 삽입 성공여부(true/false)를 리턴
	public boolean add(int key) {
		Node p = root;
		Node t = new Node(key);
		while(p != null) {
			if(p.key == key)
				return false;
			if(p.key > key) {
				if(p.leftChild == null)
					break;
				p = p.leftChild;
			}
			if(p.key < key) {
				if(p.rightChild == null)
					break;
				p = p.rightChild;
			}
		}
		if(p.key > key)
			p.leftChild = t;
		else
			p.rightChild = t;
		return true;

	}
}

