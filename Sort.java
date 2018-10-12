import java.io.File;
import java.util.PriorityQueue;

// Class Sort implements a command line tool for sorting lines in a text file in alphabetical,
// case insensitive order. The filename is passed as a command line argument.
//
// Strategy - Validate user provided file, create a ReaderAndSorter object to read lines into a priority
// queue for O(nLog(n)) sorting. Print contents of queue to Stdout.

// Reader Factory pattern allows the developer to expand the command line arguments for the user to specify
// a variety of sorting criteria, example descending order while only modifying reader factory.

// Author: George Dill, george.a.dill@gmail.com

public class Sort {

    public static void main(String[] args) {
	    // Parse the command line args
        // Check that the command line is expected length
        if(args.length != 1) {
            System.out.println("Usage: java Sort <filename>");
            return;
        }
        final String filename = args[0];
        final File file = new File(filename);

        // Check that the file can be found and opened
        if(!file.exists()) {
            System.out.println(String.format("File \"%s\" not found", filename));
            return;
        }
        if(!file.canRead()) {
            System.out.println(String.format("File \"%s\" no readable", filename));
            return;
        }

        ReaderFactory readerFactory = new ReaderFactory();
        ReaderAndSorter readerAndSorter = readerFactory.getReader(file, args);

        // Print the sorted lines to standard out
        PriorityQueue<String> output = readerAndSorter.readAllLines();

        // Print the contents of the priority queue to screen
        // Priority queue does not guarantee ordering when using toArray() method, so
        // poll the queue line by line until it is empty.
        while(!output.isEmpty()){
            System.out.println(output.poll());
        }

        return;
    }
}
