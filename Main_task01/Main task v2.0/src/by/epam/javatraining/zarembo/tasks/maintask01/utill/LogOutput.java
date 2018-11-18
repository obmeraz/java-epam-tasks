package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.view.Printable;
import org.apache.log4j.Logger;

public class LogOutput implements Printable {
    public static Logger LOG = Logger.getRootLogger();

    @Override
    public void print(String str) {
        LOG.info(str);
    }
}
