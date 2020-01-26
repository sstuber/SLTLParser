package org.abcd.examples.ArrayInit;

public class UnarySLTL extends SLTL {
	SLTLUnaryOp op;
	SLTL mid;


	@Override
	<T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold) {

		T midFold = mid.Fold(binarySLTLFold, unarySLTLFold);

		return unarySLTLFold.Fold(midFold, op);
	}
}
