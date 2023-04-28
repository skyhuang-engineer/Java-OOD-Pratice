public enum Suit {
    DIAMOND("Diamond", 1),
    CLUB("Club", 2),
    HEARTS("Heart", 3),
    SPADES("Spade", 4);
    private final String suitName;
    private final int suitVal;
    private Suit (String suitName,  int suitVal) {
        this.suitName = suitName;
        this.suitVal = suitVal;
    }
    public String getName() {
        return suitName;
    }
    public int getSuitVal() {
        return suitVal;
    }
}
