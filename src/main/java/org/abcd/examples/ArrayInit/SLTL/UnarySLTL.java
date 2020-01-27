package org.abcd.examples.ArrayInit.SLTL;

import org.abcd.examples.ArrayInit.BinarySLTLFold;
import org.abcd.examples.ArrayInit.UnarySLTLFold;

public class UnarySLTL extends SLTL {
	SLTLUnaryOp op;
	SLTL mid;


	@Override
	<T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold) {

		T midFold = mid.Fold(binarySLTLFold, unarySLTLFold);

		return unarySLTLFold.Fold(midFold, op);
	}
}
