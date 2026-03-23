package CoreJava.day10basics;

public final class Player {
    private final String name;
    private final int age;
    private final String team;
    private final PlayerRanking playerRanking; // mutable field


    public Player(String name, int age, String team, PlayerRanking playerRanking) {
        this.name = name;
        this.age = age;
        this.team = team;
        PlayerRanking playerRankingCopy = new PlayerRanking(playerRanking.getBattingRank(), playerRanking.getBowlingRank());    

        // This stores copy of the object in the field instead of the original object. So that we can maintain the immutability of the class.
        this.playerRanking = playerRankingCopy;
    }


    // No Setter methods in class.

    // Fields to be initialized through constructor only.

    // Fields are private, so they cannot be accessed directly from outside the class.

    // Fields must be Final. Because we can have methods where we can change the value of the field. So we need some kind of restriction on the field. So we can make the field final. So that it cannot be changed after initialization.
    // Compiler will take care of the rest of things.

    public void printInfo() {
        System.out.println("Player Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
        System.out.println("Batting Rank: " + playerRanking.getBattingRank());
        System.out.println("Bowling Rank: " + playerRanking.getBowlingRank());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public PlayerRanking getPlayerRanking() {
        // Do not return the original object, return a copy of the object. So that we can maintain the immutability of the class.
        PlayerRanking playerRanking = new PlayerRanking(this.playerRanking.getBattingRank(), this.playerRanking.getBowlingRank());
        return playerRanking;
    }

    // public void switchTeam(String newTeam, boolean isPlayerWantsToSwitch) {
    //    if(isPlayerWantsToSwitch) {
    //        this.team = newTeam;
    //        System.out.println(name + " has switched to " + newTeam);
    //    } else {
    //        System.out.println(name + " does not want to switch teams.");
    //    }
    // }
}
