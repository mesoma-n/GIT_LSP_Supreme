package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerRange range1 = new IntegerRange(1, 100);
        IntegerRange range2 = new IntegerRange(5, 6);
        IntegerRange range3 = new IntegerRange(5, 6);

        System.out.println("range2 contains 7: " + range2.contains(7));
        System.out.println("range1 overlaps range2: " + range1.overlaps(range2));
        System.out.println("range2 size: " + range2.size());
        System.out.println("range1 equals range2: " + range1.equals(range2));
        System.out.println("range2 equals range3: " + range2.equals(range3));

	}

}
