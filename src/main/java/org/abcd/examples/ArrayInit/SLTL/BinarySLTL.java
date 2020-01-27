package org.abcd.examples.ArrayInit.SLTL;

import org.abcd.examples.ArrayInit.BinarySLTLFold;
import org.abcd.examples.ArrayInit.UnarySLTLFold;

public class BinarySLTL extends SLTL{
	SLTLBinaryOp op;
	SLTL left;
	SLTL right;


	@Override
	<T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold) {

		T leftFold = left.Fold(binarySLTLFold, unarySLTLFold);
		T rightFold = right.Fold(binarySLTLFold,unarySLTLFold);

		return binarySLTLFold.Fold(leftFold,rightFold, op);
	}
}
