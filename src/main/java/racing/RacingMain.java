package racing;

import racing.domain.Cars;
import racing.domain.RoundCount;
import racing.utils.CarGenerator;
import racing.utils.RandomNumberGenerator;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.inputCarNames();
        Cars cars = CarGenerator.generate(carNames);

        RoundCount roundCount = new RoundCount(InputView.inputRoundCount());

        for (int i = 0; i < roundCount.getRoundCount(); i++) {
            cars.playRound(new RandomNumberGenerator());
            OutputView.printAllPosition(cars.getCars());
        }

        OutputView.printWinner(cars.findWinner());
    }
}
