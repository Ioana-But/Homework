package catalog;

import java.io.*;
import java.util.List;

public class MainCatalog {

    public static void main(String... args) {

        //Testing Lombok power :)
        //"Plan B", "Self-development", 312
        BookItem b1 = new BookItem();
        b1.setName("Plan B");
        b1.setGenre("Self-development");
        b1.setNumberOfPages(312);

        /**
         * The sellItem() method is deprecated.
         */
        b1.sellItem();



        //reading from a csv file of books
        String path = "src/csv place/Books.csv";
        BufferedReader br;
        String line;

        {
            try {
                br = new BufferedReader(new FileReader(path));

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

            } catch(FileNotFoundException e){
                System.out.println("File was not found");
            } catch(IOException e){
                e.printStackTrace();
            } finally {
            }
            try {
                Reader reader = new FileReader(path);

                BookItemCSVParser bookItemCSVParser = new BookItemCSVParser();

                List<BookItem> bookItemList = bookItemCSVParser.readFromFile(reader);

                System.out.println();

                System.out.println("The size of the books list is: " + bookItemList.size());

                System.out.println();

                System.out.println("The original list: " + bookItemList);

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.obj"));
                objectOutputStream.writeObject(bookItemList);
                objectOutputStream.flush();
                objectOutputStream.close();

                System.out.println();

                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.obj"));
                Object objectValue = objectInputStream.readObject();
                BookItem bookItemDeserialized = (BookItem) objectValue;
                System.out.println("The deserialized list: " + bookItemDeserialized);
                objectInputStream.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }
        }

    }

