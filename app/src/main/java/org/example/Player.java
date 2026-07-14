package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Player {
  String name;
  ArrayList<Monster> deck = new ArrayList<>();

  Player(String name) {
    this.name = name;
  }

  public void drawMonsters(LinkedList<Integer> list) {
    Iterator<Integer> itr = list.iterator();
    while (itr.hasNext()) {
      this.deck.add(new Monster(Monster.summonMonster(itr.next()), itr.next()));
    }
  }

  public void mulligan(LinkedList<Integer> list, int... positions) {
    Iterator<Integer> itr = list.iterator();
    for (int pos : positions) {
      Monster m = new Monster(Monster.summonMonster(itr.next()), itr.next());
      this.deck.set(pos, m);
    }
  }

  @Override
  public String toString() {
    String tmp = "Deck:" + this.name + "\n";
    for (Monster m : this.deck) {
      tmp += m.toString() + "\n";
    }
    return tmp;
  }

}
