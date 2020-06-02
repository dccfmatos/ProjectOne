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
        CategoryRepository categoryRepository1 = new CategoryRepository(list1);
        CategoryRepository categoryRepository2 = new CategoryRepository(list1);
        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(categoryRepository1, categoryRepository2);
    }

}