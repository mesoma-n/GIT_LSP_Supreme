package org.howard.edu.lsp.midterm.question2;

public interface Range {
	// Returns true if v is ≥ lower bound and ≤ upper bound and false otherwise
	public boolean contains( int value ); 
	// Returns true if the receiver contains at least 
	// one value in common with other, and false otherwise
	public boolean overlaps( Range other );
	// // Returns the number of integers in the range
	public int size(); 
	}

class IntegerRange implements Range{

	    private final int stop;
	    private final int start;

	    public IntegerRange(int stop, int start) {
	        if (stop > start) {
	            throw new IllegalArgumentException("The math isn't right");
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
	            throw new IllegalArgumentException("BooHoo you");
	        }
	    }

	    @Override
	    public int size() {
	        return start - stop + 1;
	    }


	}

