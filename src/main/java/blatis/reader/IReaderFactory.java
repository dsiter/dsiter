package blatis.reader;

import java.io.Reader;

public interface IReaderFactory {
	public Reader getReader() throws Exception;
}
