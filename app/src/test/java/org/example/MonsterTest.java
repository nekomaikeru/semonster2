package org.example;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
  public void appHasAGreeting() {
    Monster monster = new Monster();
    assertEquals(monster.name + ":レア度[" + monster.rare + "]", monster);
  }
}
