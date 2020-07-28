package mainPackage.model;

import java.util.Objects;

public class Category {

    private String description;

    //Constructors
    public static Category createCategory(String description) {
            return new Category(description);
    }

    private Category(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Can't create Category. Description can't be null.");
        } else {
            this.description = description;
        }
    }

    //Gets
    public String getDescription() {
        return description;
    }

    //Sets
    public void setDescription(String description) {
        this.description = description;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(description, category.description);
    }
}
