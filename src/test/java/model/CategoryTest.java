package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    @DisplayName("Verify AccountRepository constructor && equals")
    public void categoryConstructorEquals() {

        // Arrange
        //Category description for category
        String categoryDescription = "Monthly Bills";

        // Act
        //Create two categories that can be compared
        Category categoryMontlhyBillsJan = new Category("Monthly Bills");
        Category categoryMonthlyBillsFeb = new Category(categoryDescription);

        // Assert
        //Verify if constructor works fine and if object is the same
        assertEquals(categoryMonthlyBillsFeb, categoryMontlhyBillsJan);
    }

    @Test
    @DisplayName("Verify getDescription() of Category | AssertNotEquals")
    public void categoryGetDescriptionAssertNE() {

        // Arrange
        //Create a category with some description and a String wth another
        Category categoryMontlhyBills = new Category("Monthly Bills");
        String categoryDescription = "Weekly Bills";

        // Act
        //create the expected result (get() the result from the created category)
        String expected = categoryMontlhyBills.getDescription();

        // Assert
        //verify the results aren't the same
        assertNotEquals(expected, categoryDescription);
    }

    @Test
    @DisplayName("Verify getDescription() of Category | AssertEquals")
    public void categoryGetDescriptionAssertE() {

        // Arrange
        //Create a category with some description and a String wth another
        Category categoryMontlhyBills = new Category("Monthly Bills");
        String categoryDescription = "Weekly Bills";

        // Act
        //create the expected result (get() the result from the created category)
        String expected = categoryMontlhyBills.getDescription();

        // Assert
        //verify the results are the same
        assertEquals(expected, "Monthly Bills");
    }

    @Test
    @DisplayName("Verify category setDescription | assertEquals")
    public void categorySetDescriptionAssertE() {

        // Arrange
        //Create a category with some description and a String wth another
        Category categoryMontlhyBills = new Category("Monthly Bills");
        String categoryDescription = "Weekly Bills";

        // Act
        //setting another value for the category description using set()
        categoryMontlhyBills.setDescription(categoryDescription);

        // Assert
        //verify setter method
        assertEquals(categoryMontlhyBills.getDescription(), categoryDescription);
    }

}