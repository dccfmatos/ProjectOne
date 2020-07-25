package DTO;


import java.util.Objects;

public class DTO_US01CheckIfSiblings {

    String personSocialNumber;
    String personToAnalyzeSocialNumber;

    //constructor for DTO_US01
    public DTO_US01CheckIfSiblings(String personSocialNumber, String personToAnalyzeSocialNumber) {
        this.personSocialNumber = personSocialNumber;
        this.personToAnalyzeSocialNumber = personToAnalyzeSocialNumber;

    }

    public String getPersonSocialNumber() {
        return personSocialNumber;
    }

    public String getPersonToAnalyzeSocialNumber() {
        return personToAnalyzeSocialNumber;
    }

    public void setPersonSocialNumber(String personSocialNumber) {
        this.personSocialNumber = personSocialNumber;
    }

    public void setPersonToAnalyzeSocialNumber(String personToAnalyzeSocialNumber) {
        this.personToAnalyzeSocialNumber = personToAnalyzeSocialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTO_US01CheckIfSiblings)) return false;
        DTO_US01CheckIfSiblings that = (DTO_US01CheckIfSiblings) o;
        return Objects.equals(personSocialNumber, that.personSocialNumber) &&
                Objects.equals(personToAnalyzeSocialNumber, that.personToAnalyzeSocialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personSocialNumber, personToAnalyzeSocialNumber);
    }
}
