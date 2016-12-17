package blatis.row;

///////////////////////////////////////////
//	DO NOT EDIT!!!
//
//	This is generated code. Edit the template instead.
///////////////////////////////////////////

public class Row {

	public int[] ints;
	public long[] longs;
	public float[] floats;
	public double[] doubles;
	public String[] strings;
	public boolean[] bools;

	public Row() { }


	public Row(int... vals) { this.ints = vals.clone(); }
	public Row(long... vals) { this.longs = vals.clone(); }
	public Row(float... vals) { this.floats = vals.clone(); }
	public Row(double... vals) { this.doubles = vals.clone(); }
	public Row(String... vals) { this.strings = vals.clone(); }
	public Row(boolean... vals) { this.bools = vals.clone(); }

	public Row(RowShape shape) {

		if(shape.getNumInts() > 0) {
			ints = new int[shape.getNumInts()];
		}
		if(shape.getNumLongs() > 0) {
			longs = new long[shape.getNumLongs()];
		}
		if(shape.getNumFloats() > 0) {
			floats = new float[shape.getNumFloats()];
		}
		if(shape.getNumDoubles() > 0) {
			doubles = new double[shape.getNumDoubles()];
		}
		if(shape.getNumStrings() > 0) {
			strings = new String[shape.getNumStrings()];
		}
		if(shape.getNumBools() > 0) {
			bools = new boolean[shape.getNumBools()];
		}
	}

}