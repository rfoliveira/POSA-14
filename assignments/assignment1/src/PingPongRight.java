// Import the necessary Java synchronization and scheduling classes.

import java.util.concurrent.CountDownLatch;

/**
 * @class PingPongRight
 *
 * @brief This class implements a Java program that creates two
 *        instances of the PlayPingPongThread and start these thread
 *        instances to correctly alternate printing "Ping" and "Pong",
 *        respectively, on the console display.
 */
public class PingPongRight {
    /**
     * Number of iterations to run the test program.
     */
    public static int mMaxIterations = 10;
    
    /**
     * Latch that will be decremented each time a thread exits.
     */
    public static CountDownLatch latch = new CountDownLatch(mMaxIterations);

    /**
     * @class PlayPingPongThread
     *
     * @brief This class implements the ping/pong processing algorithm
     *         using the SimpleSemaphore to alternate printing "ping"
     *         and "pong" to the console display.
     */
    public static class PlayPingPongThread extends Thread
    {
        /**
         * Constructor initializes the data member.
         */
        public PlayPingPongThread(String stringToPrint)
        {
			// TODO - You fill in here.
        	this.stringToPrint = stringToPrint;
        	ping = new SimpleSemaphore(1, true);
        	pong = new SimpleSemaphore(1, true);
        }

        /**
         * Main event loop that runs in a separate thread of control
         * and performs the ping/pong algorithm using the
         * SimpleSemaphores.
         */
        public void run () 
        {
            // TODO - You fill in here.
        	System.out.println(stringToPrint);
        	try {
        		ping.acquire();
				pong.acquire();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }

        /**
         * String to print (either "ping!" or "pong"!) for each
         * iteration.
         */
        // TODO - You fill in here.
        private String stringToPrint;

        /**
         * The two SimpleSemaphores use to alternate pings and pongs.
         */
        // TODO - You fill in here.
        private final SimpleSemaphore ping;
        private final SimpleSemaphore pong;
    }

    /**
     * The main() entry point method into PingPongRight program. 
     */
    public static void main(String[] args) {
        try {         
            // Create the ping and pong SimpleSemaphores that control
            // alternation between threads.

            // TODO - You fill in here.

            System.out.println("Ready...Set...Go!");

            // Create the ping and pong threads, passing in the string
            // to print and the appropriate SimpleSemaphores.
            PlayPingPongThread ping =
                new PlayPingPongThread("ping");
            PlayPingPongThread pong =
                new PlayPingPongThread("pong");
            
            // Initiate the ping and pong threads, which will call the
            // run() hook method.
            ping.start();
            pong.start();

            // Use barrier synchronization to wait for both threads to
            // finish.

            // TODO - replace replace the following line with a
            // CountDownLatch barrier synchronizer call that waits for
            // both threads to finish.
            //throw new java.lang.InterruptedException();
            latch.await();
        } 
        catch (java.lang.InterruptedException e)
            {}

        System.out.println("Done!");
    }
}
