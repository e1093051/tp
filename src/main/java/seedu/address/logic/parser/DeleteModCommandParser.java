package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.DeleteModCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Module;

/**
 * Parses input arguments and creates a new {@code DeleteModCommand} object.
 */
public class DeleteModCommandParser implements Parser<DeleteModCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the {@code DeleteModCommand}
     * and returns a {@code DeleteModCommand} object for execution.
     *
     * @param args User input string (e.g. "CS2103T").
     * @return A new {@code DeleteModCommand} that contains the specified module.
     * @throws ParseException If the input does not conform to the expected format.
     */
    @Override
    public DeleteModCommand parse(String args) throws ParseException {
        try {
            Module module = ParserUtil.parseModule(args);
            return new DeleteModCommand(module);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DeleteModCommand.MESSAGE_USAGE), pe);
        }
    }
}
