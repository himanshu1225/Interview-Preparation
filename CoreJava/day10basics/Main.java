package CoreJava.day10basics;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Rohit Sharma", 38, "MI", new PlayerRanking(1, 100));
        player1.printInfo();
        // player1.switchTeam("SRH", true);  
        // player1.printInfo();

        PlayerRanking playerRanking = player1.getPlayerRanking();
        playerRanking.setBowlingRank(101);
        player1.printInfo();

        // using this variable we can change the value of the field, this is mutable field so we should ony return the copy of the object instead of the original object. So that we can maintain the immutability of the class.

        // For age and name this will not be a problem because they are primitive data types and String is immutable. But for playerRanking it is a mutable object.

        // Need to handle one more case.

        PlayerRanking playerRanking2 = new PlayerRanking(2, 145);
        Player player2 = new Player("Virat Kohli", 35, "RCB", playerRanking2);
        player2.printInfo();

        // if i change the value of playerRanking2 then it will change.

        playerRanking2.setBattingRank(3);
        player2.printInfo();

        // So during setting the value of ranking in constructor we should create copy and then set the value of the field. So that we can maintain the immutability of the class.


    }
}
