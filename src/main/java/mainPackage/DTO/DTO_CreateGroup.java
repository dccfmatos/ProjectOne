package mainPackage.DTO;


import java.time.LocalDate;
import java.util.Objects;

public class DTO_CreateGroup {

    LocalDate dateOfCreation;
    String denomination;

    //DTO constructor for US02
    public DTO_CreateGroup(LocalDate dateOfCreation, String denomination) {
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
        if (!(o instanceof DTO_CreateGroup)) return false;
        DTO_CreateGroup that = (DTO_CreateGroup) o;
        return Objects.equals(dateOfCreation, that.dateOfCreation) &&
                Objects.equals(denomination, that.denomination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfCreation, denomination);
    }
}
