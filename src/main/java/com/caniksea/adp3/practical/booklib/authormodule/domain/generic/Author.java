package com.caniksea.adp3.practical.booklib.authormodule.domain.generic;
import java.util.UUID;
/**
 * Instructions:
 *  > Do NOT modify class instance variable declaration.
 *
 * Tasks:
 *  > Implement class using Builder Pattern ONLY. (2 marks)
 *
 */
public class Author {

    private String id, firstName, lastName; // DO NOT MODIFY THIS LINE.

    public Author(String id,String firstName,String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{

        private String id;
        private String  firstName;
        private String lastName;

        public Builder setId(String id) {
            this.id = id;
            return this;

        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public Builder copy(Author author){
             this.id = author.id;
             this.firstName = author.firstName;
             this.lastName = author.lastName;
             return this;
        }

        public Author build(){
            return new Author("", "", "");
        }

    }


}
