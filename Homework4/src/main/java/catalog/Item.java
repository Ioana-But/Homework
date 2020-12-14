package catalog;

import java.io.BufferedReader;

/**
 * Abstract class Item is extended to create Book Items and Sport Items
 */
public abstract class Item {

    private int itemCode;
    private String section;

    /**
     * This method creates a new Item for the Catalog.
     */
    public abstract void createItem();

    /**
     * This method reads an item from the Catalog.
     */
    public abstract void readItem();

    /**
     * Ths method updates an item from the Catalog.
     */
    public abstract void updateItem();

    /**
     * This method deletes an item from the Catalog.
     */
    public abstract void deleteItem();

    public void sellItem() {

            }
    //BufferedReader bufferedReader = new BufferedReader(reader);
}

