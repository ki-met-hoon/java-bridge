package bridge.view;

import java.util.Random;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public static int readBridgeSize() {
        int bridgeSize;

        OutputView.printStart();

        bridgeSize = Integer.parseInt(readLine());

        checkNumber(bridgeSize);

        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String userMove;

        OutputView.printUserMove();

        userMove = readLine();

        checkText(userMove);

        return userMove;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    public static void checkNumber(int userNumber){
        if(3> userNumber || userNumber > 20){
            throw new IllegalArgumentException("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
    }

    public void checkText(String userMove){
        if(!(userMove.equals("U") || userMove.equals("D"))){
            throw new IllegalArgumentException("[ERROR] 입력 값은 U와 D여야 합니다.");
        }
    }
}
