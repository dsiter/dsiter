/* GENERATED CODE */package dsiter.parser.ast;
/* GENERATED CODE */
/* GENERATED CODE */import dsiter.accessor.DivideAccessor;
/* GENERATED CODE */import dsiter.row.ColumnDescriptor;
/* GENERATED CODE */import dsiter.row.ColumnType;
/* GENERATED CODE */import dsiter.row.IRowAccessor;
/* GENERATED CODE */
/* GENERATED CODE */public class DivideOperator implements AstNode {
/* GENERATED CODE */
/* GENERATED CODE */	private AstNode lhsNode;
/* GENERATED CODE */	private AstNode rhsNode;
/* GENERATED CODE */
/* GENERATED CODE */	public DivideOperator(AstNode lhsNode, AstNode rhsNode) {
/* GENERATED CODE */		this.lhsNode = lhsNode;
/* GENERATED CODE */		this.rhsNode = rhsNode;
/* GENERATED CODE */	}
/* GENERATED CODE */
/* GENERATED CODE */	
/* GENERATED CODE */
/* GENERATED CODE */	@Override
/* GENERATED CODE */	public IRowAccessor link(ColumnDescriptor[] cds) throws LinkException {
/* GENERATED CODE */		IRowAccessor lhs = lhsNode.link(cds);
/* GENERATED CODE */		IRowAccessor rhs = rhsNode.link(cds);
/* GENERATED CODE */
/* GENERATED CODE */		ColumnType lhsType = lhs.getType();
/* GENERATED CODE */		ColumnType rhsType = rhs.getType();
/* GENERATED CODE */
/* GENERATED CODE */		
/* GENERATED CODE */		if (lhsType == ColumnType.INT && lhsType == ColumnType.INT) {
/* GENERATED CODE */			return new DivideAccessor.INT_INT(
/* GENERATED CODE */				(IRowAccessor.INT)lhs,
/* GENERATED CODE */				(IRowAccessor.INT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.INT && lhsType == ColumnType.LONG) {
/* GENERATED CODE */			return new DivideAccessor.INT_LONG(
/* GENERATED CODE */				(IRowAccessor.INT)lhs,
/* GENERATED CODE */				(IRowAccessor.LONG)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.INT && lhsType == ColumnType.FLOAT) {
/* GENERATED CODE */			return new DivideAccessor.INT_FLOAT(
/* GENERATED CODE */				(IRowAccessor.INT)lhs,
/* GENERATED CODE */				(IRowAccessor.FLOAT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.INT && lhsType == ColumnType.DOUBLE) {
/* GENERATED CODE */			return new DivideAccessor.INT_DOUBLE(
/* GENERATED CODE */				(IRowAccessor.INT)lhs,
/* GENERATED CODE */				(IRowAccessor.DOUBLE)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.LONG && lhsType == ColumnType.INT) {
/* GENERATED CODE */			return new DivideAccessor.LONG_INT(
/* GENERATED CODE */				(IRowAccessor.LONG)lhs,
/* GENERATED CODE */				(IRowAccessor.INT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.LONG && lhsType == ColumnType.LONG) {
/* GENERATED CODE */			return new DivideAccessor.LONG_LONG(
/* GENERATED CODE */				(IRowAccessor.LONG)lhs,
/* GENERATED CODE */				(IRowAccessor.LONG)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.LONG && lhsType == ColumnType.FLOAT) {
/* GENERATED CODE */			return new DivideAccessor.LONG_FLOAT(
/* GENERATED CODE */				(IRowAccessor.LONG)lhs,
/* GENERATED CODE */				(IRowAccessor.FLOAT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.LONG && lhsType == ColumnType.DOUBLE) {
/* GENERATED CODE */			return new DivideAccessor.LONG_DOUBLE(
/* GENERATED CODE */				(IRowAccessor.LONG)lhs,
/* GENERATED CODE */				(IRowAccessor.DOUBLE)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.FLOAT && lhsType == ColumnType.INT) {
/* GENERATED CODE */			return new DivideAccessor.FLOAT_INT(
/* GENERATED CODE */				(IRowAccessor.FLOAT)lhs,
/* GENERATED CODE */				(IRowAccessor.INT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.FLOAT && lhsType == ColumnType.LONG) {
/* GENERATED CODE */			return new DivideAccessor.FLOAT_LONG(
/* GENERATED CODE */				(IRowAccessor.FLOAT)lhs,
/* GENERATED CODE */				(IRowAccessor.LONG)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.FLOAT && lhsType == ColumnType.FLOAT) {
/* GENERATED CODE */			return new DivideAccessor.FLOAT_FLOAT(
/* GENERATED CODE */				(IRowAccessor.FLOAT)lhs,
/* GENERATED CODE */				(IRowAccessor.FLOAT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.FLOAT && lhsType == ColumnType.DOUBLE) {
/* GENERATED CODE */			return new DivideAccessor.FLOAT_DOUBLE(
/* GENERATED CODE */				(IRowAccessor.FLOAT)lhs,
/* GENERATED CODE */				(IRowAccessor.DOUBLE)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.DOUBLE && lhsType == ColumnType.INT) {
/* GENERATED CODE */			return new DivideAccessor.DOUBLE_INT(
/* GENERATED CODE */				(IRowAccessor.DOUBLE)lhs,
/* GENERATED CODE */				(IRowAccessor.INT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.DOUBLE && lhsType == ColumnType.LONG) {
/* GENERATED CODE */			return new DivideAccessor.DOUBLE_LONG(
/* GENERATED CODE */				(IRowAccessor.DOUBLE)lhs,
/* GENERATED CODE */				(IRowAccessor.LONG)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.DOUBLE && lhsType == ColumnType.FLOAT) {
/* GENERATED CODE */			return new DivideAccessor.DOUBLE_FLOAT(
/* GENERATED CODE */				(IRowAccessor.DOUBLE)lhs,
/* GENERATED CODE */				(IRowAccessor.FLOAT)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else if (lhsType == ColumnType.DOUBLE && lhsType == ColumnType.DOUBLE) {
/* GENERATED CODE */			return new DivideAccessor.DOUBLE_DOUBLE(
/* GENERATED CODE */				(IRowAccessor.DOUBLE)lhs,
/* GENERATED CODE */				(IRowAccessor.DOUBLE)rhs
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */		
/* GENERATED CODE */		else {
/* GENERATED CODE */			throw new LinkException("Unsupported operand types for DivideOperator: (" +
/* GENERATED CODE */				lhsType + ", " + rhsType + ")"
/* GENERATED CODE */			);
/* GENERATED CODE */		}
/* GENERATED CODE */	}
/* GENERATED CODE */}
