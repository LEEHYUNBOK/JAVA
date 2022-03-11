package hw15_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다.

class Card {
	private int number; // 카드 번호

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

	// 카드를 생성하여 덱에 넣음
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// 카드를 섞음
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 맨 앞 카드를 제거하여 리턴
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
		System.out.println("hw15_1: 홍길동");
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

		System.out.println("p1과 p2의 최대 카드");
		if(p1.maxCard() > p2.maxCard()) {
			System.out.println("p1 승리!");
		}
		else {
			System.out.println("p2 승리!");
		}

		p1.showCards();
		p2.showCards();
	}
}
