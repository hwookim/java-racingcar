package racing.view;

import java.util.List;
import java.util.stream.Collectors;

import racing.domain.Car;

public class OutputView {
	private static final String WINNER_NAME_DELIMITER = ",";

	public static void printRoundPosition(List<Car> cars) {
		cars.forEach(car -> System.out.println(car.toString()));
		System.out.println();
	}

	public static void printWinner(List<Car> winners) {
		String winnersName = winners.stream().map(Car::getName).collect(Collectors.joining(WINNER_NAME_DELIMITER));
		System.out.print(winnersName + " 최종 우승했습니다.");
	}
}
