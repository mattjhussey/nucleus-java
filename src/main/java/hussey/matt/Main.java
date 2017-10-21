package hussey.matt;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public final class Main {
  // Define a static logger variable so that it references the
  // Logger instance named "MyApp".
  static Logger logger = Logger.getLogger(Main.class);

  /**
   * Entry point for the application.
   */
  public static void main(String[] args) {
    // Set up a simple configuration that logs on the console.
    BasicConfigurator.configure();

    logger.info("Entering application.");

    System.out.println("Hello World!");

    logger.info("Exiting application.");
  }
}
