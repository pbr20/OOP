//////Here we discussed
//->>static & final keyword
//->>accesor & mutators
//->>toString() an inbuild instant method

class game {
  final public String game_name = "Shooting game"; // final -> when u dont want it's value to change anymore anywhere
  static public int team_kill_count = 0; // static -> when u changed its value it change value everywhere means in every
                                         // object too
  public int kill_count = 0;
  public String name = "Username_not_Set";

  // mutators-> to set attributes value

  public void set_name(String name) {
    this.name = name;
  }

  public void set_team_kill_count(int team_kill_count) {
    this.team_kill_count = team_kill_count;
  }

  public void set_kill_count(int kill_count) {
    this.kill_count = kill_count;
  }

  // accessor-> to access attributes value

  public String get_name() {
    return name;
  }

  public int get_team_kill_count() {
    return team_kill_count;
  }

  public int get_kill_count() {
    return kill_count;
  }

  public game() {

  }

  public game(int team_kill_count, int kill_count, String name) {
    set_team_kill_count(team_kill_count);
    set_kill_count(kill_count);
    set_name(name);
  }

  public String toString() { // toString an instant method when u pass the object as reference in
                             // System.in.println() it will look for this method and print whatever this
                             // method returns//
    return "---------------------------------" + "\nPlayer name: " + name + "\nYour kill: " + kill_count
        + "\nTeam kill: " + team_kill_count
        + "\n---------------------------------\n";
  }
}

public class OOP7 {
  public static void main(String args[]) {

    System.out.println("Team kill: " + game.team_kill_count); // static variable can be print by only class name
                                                              // as well

    // So as u can see we can access static variable with just class name or object
    // name and everytime we change value at one it changes everywhere means it only
    // allocated in one single memory

    game player1 = new game(0, 0, "Chiyo");
    game player2 = new game(0, 0, "Akemi");

    player1.kill_count = 5;
    player2.kill_count = 8;
    player1.team_kill_count += player1.kill_count + player2.kill_count;

    System.out.println(player1.game_name);
    System.out.println(player1);
    System.out.print(player2);

    System.out.println("Team kill: " + game.team_kill_count); // static variable can be print by only class name
                                                              // as well

    // player2.game_name = "Cokking game";
    // will throw error since its declared as final
  }
}
