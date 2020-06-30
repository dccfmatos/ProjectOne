package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CategoryRepositoryTest {

    @Test
    @DisplayName("Verify CategoryRepository constructor && equals")
    public void accountRepConstructorEquals() {

        // Arrange
        //Create an arraylist object so that object CategoryRepository can be created
        ArrayList list1 = new ArrayList();
        // Act
        //create 2 CategoryRepositories that can be compared
        CategoryRepository categoryRepository1 = CategoryRepository.createCategoryRepository(list1);
        CategoryRepository categoryRepository2 = CategoryRepository.createCategoryRepository(list1);
        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(categoryRepository1, categoryRepository2);
    }

    @Test
    @DisplayName("Verify getCategoryRepository() of CategoryRepository | assertEquals")
    public void categoryRepGetCatRep() {

        // Arrange
        //Create an arraylist object so that object CategoryRepository can be created
        ArrayList list1 = new ArrayList();
        // Act
        //create 2 CategoryRepositories that can be compared
        CategoryRepository categoryRepository1 = CategoryRepository.createCategoryRepository(list1);
        CategoryRepository categoryRepository2 = CategoryRepository.createCategoryRepository(list1);
        // Assert
        //verify getter method
        assertEquals(categoryRepository1.getCategoryRepository(), categoryRepository2.getCategoryRepository());
    }

    @Test
    @DisplayName("Verify getCategoryRepository() of CategoryRepository | assertNotEquals")
    public void categoryRepGetCatRepNE() {

        // Arrange
        //Create two arraylists objects
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        //list1 should have values so that it is different that list2
        list1.add("one");
        list1.add("two");

        // Act
        //create a CategoryRepository amd the arraylist expected so that ca be
        //compared in Assert
        CategoryRepository categoryRepository1 = CategoryRepository.createCategoryRepository(list1);
        ArrayList expected = new ArrayList(categoryRepository1.getCategoryRepository());
        // Assert
        //verify getter method
        assertNotEquals(expected, list2);
    }

    @Test
    @DisplayName("Verify setCategoryRepository() | assertEquals")
    public void categoryRepSetCatRep() {

        // Arrange
        //Create two arraylists objects
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        //list1 should have values so that it is different that list2
        list1.add("one");
        list1.add("two");

        // Act
        //create a CategoryRepository and change the list using method set()
        CategoryRepository categoryRepository1 = CategoryRepository.createCategoryRepository(list2);
        categoryRepository1.setCategoryRepository(list1);

        // Assert
        //verify getter method
        assertEquals(categoryRepository1.getCategoryRepository(), list1);
    }


    @Test
    @DisplayName("VVerify addCategoryToCategoryRepository | add 1")
    public void categoryAddToRepository() {

        // Arrange
        //Create 2 categories to be added to categoryRepository
        Category categoryMontlhyBills = Category.createCategory("Monthly Bills");
        Category categoryWeeklyBills = Category.createCategory("Weekly Bills");

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        // Act
        CategoryRepository categoryRepository1 = CategoryRepository.createCategoryRepository(list1);

        //add the categories created before, using the method addCategoryToCategoryRepository()
        categoryRepository1.addCategoryToCategoryRepository(categoryMontlhyBills);
        categoryRepository1.addCategoryToCategoryRepository(categoryWeeklyBills);

        //add the categories created before, using method .add()
        list2.add(categoryMontlhyBills);
        list2.add(categoryWeeklyBills);

        // Assert
        //check if the result is the same
        assertEquals(categoryRepository1.getCategoryRepository(), list2);
    }

}