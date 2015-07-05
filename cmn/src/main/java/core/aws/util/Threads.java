package core.aws.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Random;

/**
 * @author neo
 */
public final class Threads {
    private static final Logger LOGGER = LoggerFactory.getLogger(Threads.class);
    private static final Random RANDOM = new Random();

    public static void sleepRoughly(Duration duration) throws InterruptedException {
        long milliseconds = duration.toMillis();
        double times = 1 + RANDOM.nextDouble() / 10 * 4 - 0.2; // +/-20% random
        long sleepTime = (long) (milliseconds * times);
        LOGGER.info("sleep {} ms", sleepTime);
        Thread.sleep(sleepTime);
    }
}
