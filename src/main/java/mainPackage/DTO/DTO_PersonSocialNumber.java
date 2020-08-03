package mainPackage.DTO;


import java.util.Objects;

public class DTO_PersonSocialNumber {

    String personSocialNumber;

    //constructor
    public DTO_PersonSocialNumber(String personSocialNumber) {
        this.personSocialNumber = personSocialNumber;
    }

    public String getPersonSocialNumber() {
        return personSocialNumber;
    }

    public void setPersonSocialNumber(String personSocialNumber) {
        this.personSocialNumber = personSocialNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_PersonSocialNumber)) return false;
        DTO_PersonSocialNumber that = (DTO_PersonSocialNumber) o;
        return Objects.equals(personSocialNumber, that.personSocialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personSocialNumber);
    }
}
