/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
// import ANTLR's runtime libraries
package org.abcd.examples.ArrayInit;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Arrays;

public class ArrayInit {
	public static void main(String[] args) throws Exception {

		SLTLParserHandler handler = new SLTLParserHandler();

		String[] inputArray = {
			"G <test_test> ~true",
			"F <test_test> type"
		};

		Arrays.stream(inputArray)
			.forEach(handler::ParseAndPrint);
/*
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream("G <test_test> ~true");

		// create a lexer that feeds off of input CharStream
		ArrayInitLexer lexer = new ArrayInitLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		ArrayInitParser parser = new ArrayInitParser(tokens);

		ParseTree tree = parser.sltl(); // begin parsing at init rule
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree*/
	}
}
