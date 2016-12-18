package dsiter;

import dsiter.iterator.AbstractDatasetIterator;
import dsiter.pipe.*;

public class StdPipes {
	public static IPipe filter(String filter) {
		return new FilterPipe(filter);
	}

	public static IPipe first() {
		return new FirstPipe();
	}

	public static IPipe last() {
		return new LastPipe();
	}

	public static IPipe rename(String from, String to) {
		return new RenamePipe(from, to);
	}

	public static IPipe skip(int howMany) {
		return new SkipPipe(howMany);
	}

	public static IPipe stride(int stride) {
		return new StridePipe(stride);
	}

	public static IPipe zip(AbstractDatasetIterator... iters) {
		return new ZipPipe(iters);
	}
}