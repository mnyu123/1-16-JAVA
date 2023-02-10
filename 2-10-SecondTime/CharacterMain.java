package Test2;

import java.util.ArrayList;

public class CharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list = new ArrayList<Character>();

		list.add(new Warrior());
		list.add(new Gladiator());
		list.add(new Wizard());

		for (int i = 0; i < list.size(); i++) { // list는 size가 length
			list.get(i).attack(null);
		}
	}

}
