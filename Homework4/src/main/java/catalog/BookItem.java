package catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public @Data
class BookItem extends Item implements Serializable {

    private String name;
    private String genre;
    private int numberOfPages;

    BookItem() {
    }

    public void createItem() {
    }

    public void readItem() {
    }

    public void updateItem() {
    }

    public void deleteItem() {
    }

    /**
     * Selling the item will not be applicable for books.
     */
    @Deprecated
    public void sellItem() {

    }
}
