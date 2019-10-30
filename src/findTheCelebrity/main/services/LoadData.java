package findTheCelebrity.main.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoadData {
	
	/**
	 * This method recovers data from external file to build a list
	 * <pre>Matrix must be composed of binary integers <0,1></pre>
	 * <pre>Matrix must be square </pre>
	 * <pre>Matrix will only have one celebrity. It means, all columns in zero</pre>
	 * <post></post>
	 * @return
	 */
	public List<String> getLines() {

		// List 'lines' contains every line from eternal file 
		List<String> lines = new ArrayList<String>();
		
		// Ask to user for file location
		System.out.println("Please, enter the path where your txt file is located: ");
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();

		// Read file into Stream
		try (Stream<String> stream = Files.lines(Paths.get(path))) {
			lines = stream.collect(Collectors.toList());
			System.out.println(lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}

	
}
