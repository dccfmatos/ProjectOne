package model;

import java.util.Objects;

public class Category {

    private String description;

    public static Category createCategory(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Can't create Category. Description can't be null.");
        } else {
            return new Category(description);
        }
    }

    private Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(description, category.description);
    }
}
