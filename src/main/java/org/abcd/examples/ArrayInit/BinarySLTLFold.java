package org.abcd.examples.ArrayInit;

import org.abcd.examples.ArrayInit.SLTL.SLTLBinaryOp;

public interface BinarySLTLFold<T> {
	T Fold(T arg1, T arg2, SLTLBinaryOp op);
}

