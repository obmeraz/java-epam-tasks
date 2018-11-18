package by.epam.javatraining.zarembo.tasks.maintask01.utill;


import by.epam.javatraining.zarembo.tasks.maintask01.view.Printable;
import org.apache.log4j.Logger;

public class PrinterCreator {
    public static Logger LOG = Logger.getRootLogger();

    public Printable create(PrintType type) {
        switch (type) {
            case LOG:
                return new LogOutput();
            case FILE:
                return new FileOutput();
            case CONSOLE:
                return new ConsoleOutput();
            default:
                LOG.debug("INVALID TYPE");
                break;
        }
        return null;

    }
}
