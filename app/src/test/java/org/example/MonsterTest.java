package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void toStringTest() {
    String name = "スライム";
    int rare = 0;
    Monster monster = new Monster(name, rare);
    assertEquals("スライム" + ":レア度[" + "0" + "]", monster.toString());
  }

  @Test
  public void constructorTest() {
    String name = "スライム";
    int rare = 0;
    Monster monster = new Monster(name, rare);
    assertEquals(monster.name, name);
    assertEquals(monster.rare, rare);
  }

  @Test
  public void summonMonsterTest() {
    assertEquals("スライム", Monster.summonMonster(0));
  }

  @Test
  public void evolveTestUnderRare3() {
    String name = "スライム";
    int rare = 0;
    Monster monster = new Monster(name, rare);
    monster.evolve();
    assertEquals("スライム", monster.name);
  }

  @Test
  public void evolveTestOverRare3() {
    String name = "スライム";
    int rare = 3;
    Monster monster = new Monster(name, rare);
    monster.evolve();
    assertEquals("キングスライム", monster.name);
  }

  @Test
  public void reincarnationTestEqual4() {
    String name = "スライム";
    int rare = 4;
    Monster monster = new Monster(name, rare);
    monster.reincarnation(1);
    assertEquals("サハギン", monster.name);
  }

  @Test
  public void reincarnationTestNotEqual4() {
    String name = "スライム";
    int rare = 0;
    Monster monster = new Monster(name, rare);
    monster.reincarnation(1);
    assertEquals("スライム", monster.name);
  }

  @Test
  public void reincarnationTestNotEqualRare() {
    String name = "スライム";
    int rare = 4;
    Monster monster = new Monster(name, rare);
    monster.reincarnation(1);
    assertEquals(4, monster.rare);
  }
}
