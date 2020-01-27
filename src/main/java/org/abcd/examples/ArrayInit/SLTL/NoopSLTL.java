package org.abcd.examples.ArrayInit.SLTL;

public class NoopSLTL extends SLTL {

	@Override
	<T> T Fold(BinarySLTLFold<T> binarySLTLFold, UnarySLTLFold<T> unarySLTLFold, NoopSLTLFold<T> noopSLTLFold) {
		return noopSLTLFold.Fold(data);
	}
}
