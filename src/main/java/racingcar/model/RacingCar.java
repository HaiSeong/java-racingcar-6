package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * RacingCar 클래스는 자동차를 의미하는 클래스다.
 *
 * @author haiseong
 */
public class RacingCar {
    private static final int START_DISTANCE = 0;
    private static final int MINIMUM_RANDOM_NUMBER_TO_MOVE = 4;
    private static final int RANDOM_START_INCLUSIVE = 1;
    private static final int RANDOM_END_INCLUSIVE = 9;

    private String name;
    private int distance;

    public RacingCar(String name) {
        this.name = name;
        this.distance = START_DISTANCE;
    }

    /**
     * 라운드를 진행한다.
     */
    public void executeRound() {
        boolean movable = isMovable();
        if (movable) {
            moveForward();
        }
    }

    /**
     * 전진을 할 조건이다.
     *
     * @return 전진해야하면 true 정지해야하면 false
     */
    private boolean isMovable() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_START_INCLUSIVE, RANDOM_END_INCLUSIVE);
        return randomNumber >= MINIMUM_RANDOM_NUMBER_TO_MOVE;
    }

    /**
     * 1칸 전진한다.
     */
    private void moveForward() {
        distance++;
    }

    /**
     * 자동차의 이름을 알려준다.
     *
     * @return 자동차의 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 지금 음직인 거리를 알려준다.
     *
     * @return 지금까지 음직인 거리
     */
    public int getDistance() {
        return distance;
    }
}
