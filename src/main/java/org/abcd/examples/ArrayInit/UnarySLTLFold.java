package org.abcd.examples.ArrayInit;

import org.abcd.examples.ArrayInit.SLTL.SLTLUnaryOp;

public interface UnarySLTLFold<T> {
	T Fold(T arg1, SLTLUnaryOp op);
}
