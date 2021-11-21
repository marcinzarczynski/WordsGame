public enum PointWord {
    EASY(3),MID(6),HARD(9);

    private final int value;

    PointWord(int id) {
        this.value = id;
    }

    public int getValue() {
        return value;
    }

}
