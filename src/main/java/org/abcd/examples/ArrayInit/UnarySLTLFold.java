package org.abcd.examples.ArrayInit;

public interface UnarySLTLFold<T> {
	T Fold(T arg1, SLTLUnaryOp op);
}
