package org.abcd.examples.ArrayInit.SLTL;

public interface BinarySLTLFold<T> {
	T Fold(T arg1, T arg2, BinarySLTLOp op);
}

