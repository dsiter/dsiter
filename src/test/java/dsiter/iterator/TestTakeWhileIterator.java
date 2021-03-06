package dsiter.iterator;

import dsiter.IterUtils;
import dsiter.parser.OperatorParser;
import dsiter.row.IRowAccessor;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTakeWhileIterator {

	@Test
	public void test1() throws Exception {

		IDatasetIterator src = ArrayIterator.fromInts(
			1,2,3,4,1,2,3,4,1,2,3,4
		);

		IRowAccessor.BOOLEAN predicate = OperatorParser
			.parseOperator("value!=4")
			.link(src.getColumnDescriptors())
			.asBoolAccessor();

		TakeWhileIterator twi = new TakeWhileIterator(src, predicate);

		IterUtils.assertValues(twi, "value", new Integer[] {
			1,2,3
		});
	}

	@Test
	public void testClosesSrcIter() throws Exception {

		IteratorCounter counter = new IteratorCounter();
		IDatasetIterator src = new RangeIterator(10).pipe(counter.getPipe());

		IRowAccessor.BOOLEAN predicate = OperatorParser
			.parseOperator("value!=4")
			.link(src.getColumnDescriptors())
			.asBoolAccessor();

		try (
			TakeWhileIterator it = new TakeWhileIterator(src, predicate)
		) {
			IterUtils.assertValues(it, "value", new Integer[] {
				0,1,2,3
			});
		}

		assertEquals(1, counter.getCloseCount());
	}
}
