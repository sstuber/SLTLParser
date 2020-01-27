package org.abcd.examples.ArrayInit.SLTL;

public interface UnarySLTLFold<T> {
	T Fold(T arg1, UnarySLTLOp op, SLTLData data);
}
