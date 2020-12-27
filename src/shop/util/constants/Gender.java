package shop.util.constants;

public enum Gender {

    F("female"), M("male");

    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
