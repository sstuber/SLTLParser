package org.abcd.examples.ArrayInit.SLTL;

public class UnarySLTL extends SLTL {
	public UnarySLTL(SLTLData data, UnarySLTLOp op, SLTL right) {
		super(data);
		this.op = op;
		this.right = right;
	}

	public UnarySLTL(String name, UnarySLTLOp op, SLTL right) {
		super(name);
		this.op = op;
		this.right = right;
	}

	public UnarySLTL(UnarySLTLOp op, SLTL right) {
		this.op = op;
		this.right = right;
	}

	UnarySLTLOp op;
	SLTL right;

	@Override
	<T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold, NoopSLTLFold<T> noopSLTLFold) {

		T rightFold = right.Fold(binarySLTLFold, unarySLTLFold, noopSLTLFold);

		return unarySLTLFold.Fold(rightFold, op, data);
	}
}
