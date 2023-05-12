package task054_Tasks.UI;

import task054_Tasks.Config;
import task054_Tasks.Core.MVP.Presenters.FilePresenter;
import task054_Tasks.Core.service.Tasks;

public class App {
    public static void ClickButton() {
        FilePresenter filePresenter = new FilePresenter(Config.txtPath, Config.xmlPath);
        RunActions runActions = new RunActions(filePresenter);
        Tasks tasks = filePresenter.LoadFromFile();

        if (tasks.checkEmpty()) {
            runActions.RunAddItemAction(tasks, true);
        } else {
            runActions.RunAction(tasks);
        }
    }
}
