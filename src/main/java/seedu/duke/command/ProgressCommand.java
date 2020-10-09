package seedu.duke.command;

import seedu.duke.Storage;
import seedu.duke.Ui;
import seedu.duke.calendar.CalendarList;

/**
 * Show the progress of deadlines and todos to the user.
 */
public class ProgressCommand extends Command {
    public ProgressCommand(String userInput) {
        super(userInput);
    }

    /**
     * Show the progress of deadlines and todos to the user.
     *
     * @param calendarList the calendar list to list from
     * @param storage      not required
     */
    @Override
    public void execute(CalendarList calendarList, Storage storage) {
        Ui.printProgress(calendarList);
    }
}