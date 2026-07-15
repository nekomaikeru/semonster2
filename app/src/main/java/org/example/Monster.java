package org.example;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
  }

  static String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolve() {
    if (this.rare >= 3) {
      this.name = "キング" + this.name;
    }

  }

  void reincarnation(int number) {
    if (this.rare == 4) {
      this.name = summonMonster(number);
    }
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
