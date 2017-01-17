package dsiter.accessor;

import dsiter.IterUtils;
import dsiter.iterator.IDatasetIterator;
import dsiter.iterator.RangeIterator;
import dsiter.row.ConstantAccessor;
import dsiter.row.Row;
import org.junit.Test;

import static dsiter.StdPipes.filter;
import static org.junit.Assert.assertEquals;

/**
 * Created by bkputnam on 12/15/16.
 */
public class TestGreaterThanOperator {

	@Test
	public void test_int_eq_int() {
		GreaterThanAccessor gte = new GreaterThanAccessor(
			ConstantAccessor.getIntInstance(1),
			ConstantAccessor.getIntInstance(1)
		);

		assertEquals(false, gte.getValueFromRow(new Row()));
	}

	@Test
	public void test_int_gt_int() {
		GreaterThanAccessor gte = new GreaterThanAccessor(
			ConstantAccessor.getIntInstance(2),
			ConstantAccessor.getIntInstance(1)
		);

		assertEquals(true, gte.getValueFromRow(new Row()));
	}

	@Test
	public void test_int_lt_int() {
		GreaterThanAccessor gte = new GreaterThanAccessor(
			ConstantAccessor.getIntInstance(0),
			ConstantAccessor.getIntInstance(1)
		);

		assertEquals(false, gte.getValueFromRow(new Row()));
	}

	@Test
	public void test_long_eq_long() {
		GreaterThanAccessor gte = new GreaterThanAccessor(
			ConstantAccessor.getLongInstance(1L),
			ConstantAccessor.getLongInstance(1L)
		);

		assertEquals(false, gte.getValueFromRow(new Row()));
	}

	@Test
	public void test_float_eq_float() {
		GreaterThanAccessor gte = new GreaterThanAccessor(
			ConstantAccessor.getFloatInstance(1F),
			ConstantAccessor.getFloatInstance(1F)
		);

		assertEquals(false, gte.getValueFromRow(new Row()));
	}

	@Test
	public void test_double_eq_double() {
		GreaterThanAccessor gte = new GreaterThanAccessor(
			ConstantAccessor.getDoubleInstance(1D),
			ConstantAccessor.getDoubleInstance(1D)
		);

		assertEquals(false, gte.getValueFromRow(new Row()));
	}

	@Test
	public void testParser() throws Exception {
		IDatasetIterator iter = new RangeIterator(20)
			.pipe(filter("value>15"));
		IterUtils.assertValues(iter, "value", new Integer[] { 16, 17, 18, 19 });
	}

	@Test
	public void test_jsdate_eq_int() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:00Z"),
				ConstantAccessor.getIntInstance(0)
		);
		assertEquals(false, op.getValueFromRow(new Row()));
	}
	@Test
	public void test_jsdate_gt_int() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:01Z"),
				ConstantAccessor.getIntInstance(0)
		);
		assertEquals(true, op.getValueFromRow(new Row()));
	}
	@Test
	public void test_jsdate_lt_int() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:00Z"),
				ConstantAccessor.getIntInstance(1)
		);
		assertEquals(false, op.getValueFromRow(new Row()));
	}

	@Test
	public void test_jsdate_eq_long() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:00Z"),
				ConstantAccessor.getLongInstance(0L)
		);
		assertEquals(false, op.getValueFromRow(new Row()));
	}
	@Test
	public void test_jsdate_gt_long() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:01Z"),
				ConstantAccessor.getLongInstance(0L)
		);
		assertEquals(true, op.getValueFromRow(new Row()));
	}
	@Test
	public void test_jsdate_lt_long() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:00Z"),
				ConstantAccessor.getLongInstance(1L)
		);
		assertEquals(false, op.getValueFromRow(new Row()));
	}

	@Test
	public void test_int_eq_jsdate() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getIntInstance(0),
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:00Z")
		);
		assertEquals(false, op.getValueFromRow(new Row()));
	}
	@Test
	public void test_int_gt_jsdate() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getIntInstance(1),
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:00Z")
		);
		assertEquals(true, op.getValueFromRow(new Row()));
	}
	@Test
	public void test_int_lt_jsdate() {
		GreaterThanAccessor op = new GreaterThanAccessor(
				ConstantAccessor.getIntInstance(0),
				ConstantAccessor.getJsDateInstance("1970-01-01T00:00:01Z")
		);
		assertEquals(false, op.getValueFromRow(new Row()));
	}
}