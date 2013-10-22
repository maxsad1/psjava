package org.psjava.example;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.ds.deque.DoubleLinkedListFactory;
import org.psjava.ds.queue.Queue;
import org.psjava.ds.queue.QueueFactory;
import org.psjava.ds.queue.QueueFactoryUsingDeque;
import org.psjava.goods.GoodQueueFactory;

public class QueueExample {

	@Test
	public void example() {

		QueueFactory queueFactory = QueueFactoryUsingDeque.getInstance(new DoubleLinkedListFactory());

		Queue<String> queue = queueFactory.create();

		queue.enque("A");
		queue.enque("B");

		// Here are operations.

		String deque1 = queue.deque();
		String deque2 = queue.deque();

		boolean empty = queue.isEmpty();

		// There are several implementations.

		QueueFactoryUsingDeque.getInstance(new DoubleLinkedListFactory());
		GoodQueueFactory.getInstance(); // We choose a good one.

		Assert.assertEquals("A", deque1);
		Assert.assertEquals("B", deque2);
		Assert.assertTrue(empty);
	}
}
