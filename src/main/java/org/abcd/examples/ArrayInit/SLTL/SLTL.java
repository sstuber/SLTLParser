package org.abcd.examples.ArrayInit.SLTL;

import org.abcd.examples.ArrayInit.*;

public abstract class SLTL {
	abstract <T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold);
}
