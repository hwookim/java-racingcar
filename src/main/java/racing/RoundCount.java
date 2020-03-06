package racing;

public class RoundCount {
    int roundCount;

    public RoundCount(String round) {
        int roundCount = validateRoundCount(round);
        validateRoundCountScope(roundCount);
        this.roundCount = roundCount;
    }

    private int validateRoundCount(String round) {
        try {
            return Integer.parseInt(round);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자로 입력해야 합니다.");
        }
    }

    private void validateRoundCountScope(int round) {
        if (round <= 0) {
            throw new IllegalArgumentException("시도 횟수는 양수여야 합니다.");
        }
    }
}
