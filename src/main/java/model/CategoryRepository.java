package model;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryRepository {


    private ArrayList<Category> categoryRepository;

    public CategoryRepository(ArrayList<Category> categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void addCategoryToCategoryRepository(Category category) {
        if (!categoryRepository.contains(category)) {
            categoryRepository.add(category);
        }
    }

    public ArrayList<Category> getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(ArrayList<Category> categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryRepository)) return false;
        CategoryRepository that = (CategoryRepository) o;
        return Objects.equals(categoryRepository, that.categoryRepository);
    }

}
