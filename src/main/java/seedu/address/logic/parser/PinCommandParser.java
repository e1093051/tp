package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_EMPTY_INDEX;
import static seedu.address.logic.Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.PinCommand;
import seedu.address.logic.parser.exceptions.EmptyIndexException;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new PinCommand object
 */
public class PinCommandParser implements Parser<PinCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the PinCommand
     * and returns a PinCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public PinCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new PinCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        } catch (EmptyIndexException e) {
            throw new ParseException(MESSAGE_EMPTY_INDEX);
        }
    }
}
