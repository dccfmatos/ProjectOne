package model;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryRepository {


    private ArrayList<Category> categoryRepository;

    //Constructors
    public static CategoryRepository createCategoryRepository(ArrayList<Category> categoryRepository){
        return new CategoryRepository(categoryRepository);
    }

    private CategoryRepository(ArrayList<Category> categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //Methods
    public void addCategoryToCategoryRepository(Category category) {
        if (!categoryRepository.contains(category)) {
            categoryRepository.add(category);
        }
    }

    //Gets
    public ArrayList<Category> getCategoryRepository() {
        return categoryRepository;
    }

    //Sets
    public void setCategoryRepository(ArrayList<Category> categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryRepository)) return false;
        CategoryRepository that = (CategoryRepository) o;
        return Objects.equals(categoryRepository, that.categoryRepository);
    }
}
