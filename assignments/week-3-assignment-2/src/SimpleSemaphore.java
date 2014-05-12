import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;

/**
 * @class SimpleSemaphore
 *
 * @brief This class provides a simple counting semaphore
 *        implementation using Java a ReentrantLock and a
 *        ConditionObject.  It must implement both "Fair" and
 *        "NonFair" semaphore semantics, just liked Java Semaphores. 
 */
public class SimpleSemaphore {
    /**
     * Constructor initialize the data members.  
     */
    public SimpleSemaphore (int permits,
                            boolean fair)
    { 
        // TODO - you fill in here
    	lock = new ReentrantLock(fair);
    	cond = lock.newCondition();
    	this.permits = permits;
    }

    /**
     * Acquire one permit from the semaphore in a manner that can
     * be interrupted.
     */
    public void acquire() throws InterruptedException {
        // TODO - you fill in here
    	lock.lock();
    	try {
    		while (permits == 0) {
    			cond.await();
    		}
    		permits++;
    	}
    	finally {
    		lock.unlock();
    	}
    }

    /**
     * Acquire one permit from the semaphore in a manner that
     * cannot be interrupted.
     */
    public void acquireUninterruptibly() {
        // TODO - you fill in here
    	lock.lock();
    	try {
    		while (permits == 0) {
    			cond.awaitUninterruptibly();
    		}
    		permits--;
    	}
    	finally {
    		lock.unlock();
    	}
    }

    /**
     * Return one permit to the semaphore.
     */
    void release() {
        // TODO - you fill in here
    	lock.lock();
    	try {
    		while (permits == 0) {
				try {
					cond.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
    		}
    		permits--;
    	}
    	finally {
    		lock.unlock();
    	}
    }

    /**
     * Define a ReentrantLock to protect the critical section.
     */
    // TODO - you fill in here
    private Lock lock;

    /**
     * Define a ConditionObject to wait while the number of
     * permits is 0.
     */
    // TODO - you fill in here
    private Condition cond;

    /**
     * Define a count of the number of available permits.
     */
    // TODO - you fill in here
    private int permits;
}

