package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Player {
  String name;
  int HP;
  ArrayList<Monster> deck = new ArrayList<>();

  Player(String name, int HP) {
    this.name = name;
    this.HP = HP;
  }

  public void drawMonsters(LinkedList<Integer> list) {
    Iterator<Integer> itr = list.iterator();
    while (itr.hasNext()) {
      this.deck.add(new Monster(Monster.summonMonster(itr.next()), itr.next()));
    }
  }

  @Override
  public String toString() {
    String tmp = "Deck:" + this.name + " HP:" + this.HP + "\n";
    for (Monster m : this.deck) {
      tmp += m.toString() + "\n";
    }
    return tmp;
  }

}
