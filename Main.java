import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Files.write(Paths.get("fifo"), "the text".getBytes(), StandardOpenOption.APPEND);
		}
		catch (java.io.IOException e)
		{ }
	}
}
