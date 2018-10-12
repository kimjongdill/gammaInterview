import java.io.File;

//Class ReaderFactory initializes a ReaderAndSorter class.
//The factory class provides ability for the user to select a sorting criteria from the command line.
//At present only the requested ascending alphabetical order ignoring case is implemented

public class ReaderFactory {
    public ReaderFactory(){
        return;
    }

    public ReaderAndSorter getReader(File file, String args[]){
        ComparatorAscendingOrderCaseInsensitive sortFunction = new ComparatorAscendingOrderCaseInsensitive();
        ReaderAndSorter readerAndSorter = new ReaderAndSorter(file, sortFunction);
        return readerAndSorter;
    }
}
