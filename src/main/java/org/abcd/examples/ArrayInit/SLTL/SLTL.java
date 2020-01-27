package org.abcd.examples.ArrayInit.SLTL;

public abstract class SLTL {
	SLTLData data;

	public SLTL(SLTLData data) {
		this.data = data;
	}

	public SLTL(String name) {
		this.data = new SLTLData() {{
			name = name;
		}};
	}

	public SLTL() {
		this.data = new SLTLData();
	}

	abstract <T> T Fold(
		BinarySLTLFold<T> binarySLTLFold,
		UnarySLTLFold<T> unarySLTLFold,
		NoopSLTLFold<T> noopSLTLFold
	);
}
