package catalog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookItemCSVParser {

    public List<BookItem> readFromFile(Reader reader) throws IOException {

        List<BookItem> bookItems = new ArrayList<>();

        // coding magic...
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        while (line != null) {

            // check operations on String
            String[] tokens = line.split(",");

            if (tokens.length != 4) {
//                throw new ValidationException(".....");
                // write the file ENTRIES which are invalid in a separate FILE
                // save the invalid ENTRIES in a List, Array
            }

            // FILES NEED TO BE CONSISTENT FOR A REASON
            BookItem bookItem = new BookItem((tokens[0]),
                    tokens[1],
                    Integer.parseInt(tokens[2]));

            bookItems.add(bookItem);

            line = bufferedReader.readLine();

        }

        return bookItems;
    }
}





