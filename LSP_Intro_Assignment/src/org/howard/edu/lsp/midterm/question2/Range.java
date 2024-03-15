package org.howard.edu.lsp.midterm.question2;

/**
 * An interface representing a range of integers.
 *
 */
public interface Range {

    /**
     * Checks if a given value is within the range.
     * @param value The value to check.
     * @return True if the value is within the range, false otherwise.
     */
    public boolean contains(int value);

    /**
     * Checks if this range overlaps with another range.
     * @param other The other range to check for overlap.
     * @return if the receiver contains at least one value in common with other, and false otherwise public boolean overlaps( Range other ).
     * @throws IllegalArgumentException if the other range is not of the same type.
     */
    
    public boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     * @return The size of the range.
     */
    public int size();
}

/**
 * An implementation of the Range interface
 *
 */
class IntegerRange implements Range {

    /**
     * The lower bound of the range (inclusive).
     */
    private final Integer stop;

    /**
     * The upper bound of the range (inclusive).
     */
    private final Integer start;

    /**
     * Creates a new integer range with the specified start and stop values.
     *
     * @param stop The lower bound of the range.
     * @param start The upper bound of the range.
     * @throws IllegalArgumentException if the start value is greater than the stop value.
     */
    public IntegerRange(int stop, int start) {
        if (stop > start) {
            throw new IllegalArgumentException("The start value must be less than or equal to the stop value");
        }
        this.stop = stop;
        this.start = start;
	    }

	    @Override
	    public boolean contains(int value) {
	        return value >= stop && value <= start;
	    }

	    @Override
	    public boolean overlaps(Range other) {
	        if (other instanceof IntegerRange) {
	            IntegerRange otherRange = (IntegerRange) other;
	            return this.contains(otherRange.stop) || otherRange.contains(this.stop);
	        } else {
	            throw new IllegalArgumentException("This cant work!");
	        }
	    }

	    @Override
	    public int size() {
	        return start - stop + 1;
	    }
	    
	    @Override
	    public boolean equals(Object other) {
	    	if (!(other instanceof IntegerRange)) {
	    		return false;
	    	}
	    	IntegerRange other1 = (IntegerRange) other;
	    	if (this.stop.equals(other1.stop) && this.start.equals(other1.start)) {
	    		return true;
	    	}
	    	return false;
	    }
	    


	}

