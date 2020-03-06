package racing.view;

import racing.domain.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OutputView {
    private static final String POSITION_VIEWER = "-";

    private static String printPositionViewer(Car car) {
        return IntStream.range(0, car.getPosition())
                .mapToObj(x -> POSITION_VIEWER)
                .collect(Collectors.joining());
    }

    private static void printEachPosition(Car car) {
        System.out.println(car.getName() + " : " + printPositionViewer(car));
    }

    public static void printAllPosition(List<Car> cars) {
        cars.forEach(OutputView::printEachPosition);
        System.out.println();
    }

    public static void printWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
