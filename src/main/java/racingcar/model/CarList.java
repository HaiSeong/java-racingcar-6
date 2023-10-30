package racingcar.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CarMap 클래스는 ArrayList를 이용해 RacingCar 객체를 저장한다.
 *
 * @author haiseong
 */
public class CarList {
    private final List<RacingCar> carList;

    public CarList() {
        carList = new ArrayList<>();
    }

    /**
     * 이름을 받아 RacingCar를 저장한다.
     *
     * @param name 자동차에 붙일 이름
     */
    public void add(String name) {
        carList.add(new RacingCar(name));
    }

    /**
     * 각 자동차들이 라운드를 진행하게한다.
     */
    public void executeRound() {
        for (RacingCar racingCar : carList) {
            racingCar.executeRound();
        }
    }

    /**
     * 우승한 자동차들의 리스트를 뽑아낸다.
     *
     * @return 우승한 자동차들의 이름 리스트
     */
    public List<String> getWinners() {
        int maxDistance = getMaxDistance();

        List<String> winners = new ArrayList<>();
        for (RacingCar car : carList) {
            if (car.getDistance() == maxDistance) {
                winners.add(car.getName());
            }
        }

        return winners;
    }

    private int getMaxDistance() {
        int maxDistance = 0;

        for (RacingCar car : carList) {
            int distance = car.getDistance();
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        return maxDistance;
    }

    /**
     * 자동차들의 정보를 iterator로 반환한다.
     *
     * @return 자동차들의 iterator
     */
    public Iterator<RacingCar> getIterator() {
        return carList.iterator();
    }
}
