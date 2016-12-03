package blatis.predicate;

import blatis.row.ColumnDescriptor;
import blatis.row.IRowAccessor;
import blatis.row.Row;

/**
 * Created by bkputnam on 12/3/16.
 */
public abstract class NumericBinaryPredicate extends AbstractBinaryPredicate {

    protected IPredicate innerPredicate;

    public NumericBinaryPredicate(IRowAccessor lhs, IRowAccessor rhs) {
        super(lhs, rhs);

        if( lhs.getType() != rhs.getType() ) {
            throw new IllegalArgumentException(
                "lhs and rhs must have same type (found " +
                lhs.getType() + ", " + rhs.getType() +
                ", respectively)"
            );
        }

        ColumnDescriptor.Type type = lhs.getType();
        innerPredicate =
            type == ColumnDescriptor.Type.INT ? new IntPredicate(lhs, rhs) :
            type == ColumnDescriptor.Type.LONG ? new LongPredicate(lhs, rhs) :
            type == ColumnDescriptor.Type.FLOAT ? new FloatPredicate(lhs, rhs) :
            type == ColumnDescriptor.Type.DOUBLE ? new DoublePredicate(lhs, rhs) :
            null;
        if( innerPredicate == null ) {
            throw new IllegalArgumentException("Unsupported column type: " + type);
        }
    }

    @Override
    public boolean testRow(Row row) {
        return innerPredicate.testRow(row);
    }

    protected abstract boolean compareInts(int lhs, int rhs);
    protected abstract boolean compareLongs(long lhs, long rhs);
    protected abstract boolean compareFloats(float lhs, float rhs);
    protected abstract boolean compareDoubles(double lhs, double rhs);

    private class IntPredicate extends AbstractBinaryPredicate {
        public IntPredicate(IRowAccessor lhs, IRowAccessor rhs) { super(lhs, rhs); }

        @Override
        public boolean testRow(Row row) {
            return compareInts((int)lhs.getValueFromRow(row), (int)rhs.getValueFromRow(row));
        }
    }

    private class LongPredicate extends AbstractBinaryPredicate {
        public LongPredicate(IRowAccessor lhs, IRowAccessor rhs) { super(lhs, rhs); }

        @Override
        public boolean testRow(Row row) {
            return compareLongs((long)lhs.getValueFromRow(row), (long)rhs.getValueFromRow(row));
        }
    }

    private class FloatPredicate extends AbstractBinaryPredicate {
        public FloatPredicate(IRowAccessor lhs, IRowAccessor rhs) { super(lhs, rhs); }

        @Override
        public boolean testRow(Row row) {
            return compareFloats((float)lhs.getValueFromRow(row), (float)rhs.getValueFromRow(row));
        }
    }

    private class DoublePredicate extends AbstractBinaryPredicate {
        public DoublePredicate(IRowAccessor lhs, IRowAccessor rhs) { super(lhs, rhs); }

        @Override
        public boolean testRow(Row row) {
            return compareDoubles((double)lhs.getValueFromRow(row), (double)rhs.getValueFromRow(row));
        }
    }
}