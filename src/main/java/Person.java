public class Person {
    
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String chill() {
        return "It's me, " + this.firstName + " " + this.lastName + ". Just chillin with my homies";
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String newName) {
        this.firstName = newName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String newName) {
        if (newName.trim().length() != 0)
            this.lastName = newName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}













