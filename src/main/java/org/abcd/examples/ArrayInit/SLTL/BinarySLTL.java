package org.abcd.examples.ArrayInit.SLTL;

public class BinarySLTL extends SLTL {
	BinarySLTLOp op;
	SLTL left;
	SLTL right;

	public BinarySLTL(SLTLData data, BinarySLTLOp op, SLTL left, SLTL right) {
		super(data);
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public BinarySLTL(String name, BinarySLTLOp op, SLTL left, SLTL right) {
		super(name);
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public BinarySLTL(BinarySLTLOp op, SLTL left, SLTL right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}


	@Override
	<T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold, NoopSLTLFold<T> noopSLTLFold) {

		T leftFold = left.Fold(binarySLTLFold, unarySLTLFold, noopSLTLFold);
		T rightFold = right.Fold(binarySLTLFold, unarySLTLFold, noopSLTLFold);

		return binarySLTLFold.Fold(leftFold, rightFold, op);
	}
}
