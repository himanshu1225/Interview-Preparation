package CoreJava.day10basics;

public class PlayerRanking {
    int battingRank;
    int bowlingRank;

    public PlayerRanking(int battingRank, int bowlingRank) {
        this.battingRank = battingRank;
        this.bowlingRank = bowlingRank;
    }

    public void setBattingRank(int battingRank) {
        this.battingRank = battingRank;
    }

    public void setBowlingRank(int bowlingRank) {
        this.bowlingRank = bowlingRank;
    }
    public int getBattingRank() {
        return battingRank;
    }
    public int getBowlingRank() {
        return bowlingRank;
    }
}
