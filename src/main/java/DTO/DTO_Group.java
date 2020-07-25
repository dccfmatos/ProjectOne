package DTO;

import java.time.LocalDate;
import java.util.Objects;

public class DTO_Group {

    private LocalDate dateOfCreation;
    private String denomination;

    public DTO_Group(LocalDate dateOfCreation, String denomination) {
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
        if (!(o instanceof DTO_Group)) return false;
        DTO_Group dto_group = (DTO_Group) o;
        return Objects.equals(dateOfCreation, dto_group.dateOfCreation) &&
                Objects.equals(denomination, dto_group.denomination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfCreation, denomination);
    }
}
