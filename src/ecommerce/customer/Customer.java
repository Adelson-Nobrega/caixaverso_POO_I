package ecommerce.customer;

import java.time.LocalDate;

public class Customer {

    private Long id;
    private String name;
    private String document;
    private LocalDate birthdate;

    public Customer(Long id, String name, String document, LocalDate dateBirth) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.birthdate = dateBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
