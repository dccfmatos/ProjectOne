package mainPackage.DTO;

import java.util.Objects;

public class DTO_GroupDenomination {

    private String denomination;

    public DTO_GroupDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_GroupDenomination)) return false;
        DTO_GroupDenomination that = (DTO_GroupDenomination) o;
        return Objects.equals(denomination, that.denomination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denomination);
    }
}
