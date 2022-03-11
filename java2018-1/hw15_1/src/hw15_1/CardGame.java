package hw15_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//�ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�.

class Card {
	private int number; // ī�� ��ȣ

	public Card(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}

class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// ī�带 �����Ͽ� ���� ����
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// ī�带 ����
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// ���� �� �� ī�带 �����Ͽ� ����
	public Card deal() {
		return deck.remove(0);
	}
}


class Player {
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}
	public int maxCard() {
		int max = list.get(0).getNumber();
		int num = 0;
		for(int i = 0; list.size() > i; i++) {
			if  ( list.get(i).getNumber() > max ) {
				max = list.get(i).getNumber();
				num = i;
			}
		}
		list.remove(num);
		System.out.println(max);
		return max;
		
	}
}


public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1: ȫ�浿");
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();

		p1.getCard(deck.deal());
		p2.getCard(deck.deal());

		p1.getCard(deck.deal());
		p2.getCard(deck.deal());

		p1.getCard(deck.deal());
		p2.getCard(deck.deal());

		p1.getCard(deck.deal());
		p2.getCard(deck.deal());

		p1.getCard(deck.deal());
		p2.getCard(deck.deal());

		p1.showCards();
		p2.showCards();

		System.out.println("p1�� p2�� �ִ� ī��");
		if(p1.maxCard() > p2.maxCard()) {
			System.out.println("p1 �¸�!");
		}
		else {
			System.out.println("p2 �¸�!");
		}

		p1.showCards();
		p2.showCards();
	}
}
