import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

//class ReaderAndSorter opens an Input stream on the given file and reads all lines into a priority queue
//with ordering specified by the supplied Comparator function.

public class ReaderAndSorter {
    private final File file;
    private PriorityQueue<String> lines;

    // Create a new reader object for the given file and comparator class.
    public ReaderAndSorter(File file, Comparator<String> comparator){
        this.file = file;
        this.lines = new PriorityQueue<String>(comparator);
    }

    // readAllLines() returns a
    public PriorityQueue<String> readAllLines(){
        String line;
        try {
            java.io.Reader inputStream = new InputStreamReader(new FileInputStream(this.file));
            BufferedReader inputReader = new BufferedReader(inputStream);
            while(((line = inputReader.readLine()) != null)){
                this.lines.add(line);
            }
            inputReader.close();
            inputStream.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("Error while reading file.");
        }

        return this.lines;
    }

}
