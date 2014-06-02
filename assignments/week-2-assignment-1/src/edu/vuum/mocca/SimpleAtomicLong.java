package edu.vuum.mocca;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

/**
 * @class SimpleAtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.AtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class SimpleAtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
    // TODO - replace the null with the appropriate initialization:
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();
    private final Lock READ = mRWLock.readLock();
    private final Lock WRITE = mRWLock.writeLock();
=======

    // TODO -- you fill in here by replacing the null with an
    // initialization of ReentrantReadWriteLock.
    private final ReentrantReadWriteLock mRWLock = null;
>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java

    /**
     * Creates a new SimpleAtomicLong with the given initial value.
     */
    public SimpleAtomicLong(long initialValue)
    {
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        // TODO - you fill in here
        mValue = initialValue;
=======
        // TODO -- you fill in here
>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Gets the current value.
     * 
     * @returns The current value
     */
    public long get()
    {
        long value;
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        // TODO - you fill in here, using a readLock()
        READ.lock();
        try {
        	value = mValue;        	
        }
        finally {
        	READ.unlock();
        }
=======

        // TODO -- you fill in here

>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the updated value
     */
    public long decrementAndGet()
    {
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        long value;
        // TODO - you fill in here, using a writeLock()
        WRITE.lock();
        try {
        	value = --mValue;
        }
        finally {
        	WRITE.unlock();
        }
=======
        long value = 0;

        // TODO -- you fill in here

>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the previous value
     */
    public long getAndIncrement()
    {
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        long value;
        // TODO - you fill in here, using a writeLock()
        WRITE.lock();
        try {
        	value = mValue++;
        }
        finally {
        	WRITE.unlock();
        }
=======
        long value = 0;

        // TODO -- you fill in here

>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @returns the previous value
     */
    public long getAndDecrement()
    {
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        long value;
        // TODO - you fill in here, using a writeLock()
        WRITE.lock();
        try {
        	value = mValue--;
        }
        finally {
        	WRITE.unlock();
        }
        return value;    	
=======
        long value = 0;

        // TODO -- you fill in here

        return value;
>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @returns the updated value
     */
    public long incrementAndGet()
    {
<<<<<<< HEAD:assignments/week-2-assignment-1/src/SimpleAtomicLong.java
        long value;
        // TODO - you fill in here, using a writeLock()
        WRITE.lock();
        try {
        	value = ++mValue;
        }
        finally {
        	WRITE.unlock();
        }
=======
        long value = 0;

        // TODO -- you fill in here

>>>>>>> 301602455516e01674a6ce4f3feb583d3f26516a:assignments/week-2-assignment-1/src/edu/vuum/mocca/SimpleAtomicLong.java
        return value;
    }
}

