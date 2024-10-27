package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.util.Validator;

public class InputView {
    public static List<String> getCarNames() {
        OutputView.printCarNameInputPrompt();
        List<String> carNames = Arrays.asList(Console.readLine().split(","));
        Validator.validateCarNames(carNames);
        return carNames;
    }
}