package DTO;


import java.time.LocalDate;
import java.util.Objects;

public class DTO_US02CreateGroup {

    LocalDate dateOfCreation;
    String denomination;

    public DTO_US02CreateGroup(LocalDate dateOfCreation, String denomination) {
        this.dateOfCreation = dateOfCreation;
        this.denomination = denomination;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_US02CreateGroup)) return false;
        DTO_US02CreateGroup that = (DTO_US02CreateGroup) o;
        return Objects.equals(dateOfCreation, that.dateOfCreation) &&
                Objects.equals(denomination, that.denomination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfCreation, denomination);
    }
}
