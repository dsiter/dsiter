package dsiter.accessor;

import dsiter.row.ColumnType;
import dsiter.row.IRowAccessor;

/**
 * Unary accessor that computes the logical NOT of {@code src}
 *
 * <p>
 *     You probably won't ever want to use this class directly;
 *     it's much simpler to use {@link dsiter.parser.OperatorParser}
 *     directly. However, I certainly won't tell you you can't!
 * </p>
 */
public class NotOperator extends TypedUnaryOperator {

	public NotOperator(IRowAccessor src) {
		super(src);
    }

	@Override
	protected ColumnType getReturnType(ColumnType srcType) {
		return ColumnType.BOOLEAN;
	}

	@Override
	protected boolean testTypeCompatibility(ColumnType srcType) {
		return srcType == ColumnType.BOOLEAN;
	}

	@Override
	public boolean handle_bool_bool(boolean src) { return !src; }
}