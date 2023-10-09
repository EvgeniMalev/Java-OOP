package trip;

public enum Train {
    slow(2), superfast(4), fast(3);

    private final int multiplier;

    Train(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
