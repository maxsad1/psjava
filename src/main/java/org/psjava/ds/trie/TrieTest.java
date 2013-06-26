package org.psjava.ds.trie;


import org.junit.Assert;
import org.junit.Test;
import org.psjava.ds.array.Array;
import org.psjava.ds.array.MutableArrayUsingCharArray;
import org.psjava.goods.GoodTrieNodeFactory;



public class TrieTest {

	@Test
	public void testSize() {
		Trie<Character> trie = new Trie<Character>(GoodTrieNodeFactory.<Character>getInstance());
		trie.add(toArray("AAB"));
		trie.add(toArray("AAC"));
		Assert.assertEquals(1, trie.getRoot().getChildCount());
		Assert.assertEquals(1, trie.getRoot().getChild('A').getChildCount());
		Assert.assertEquals(2, trie.getRoot().getChild('A').getChild('A').getChildCount());
	}

	private Array<Character> toArray(String s) {
		return MutableArrayUsingCharArray.create(s.toCharArray());
	}

}
