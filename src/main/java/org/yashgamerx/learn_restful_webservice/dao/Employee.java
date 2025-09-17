package org.yashgamerx.learn_restful_webservice.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity //JPA entity
@Getter @Setter @ToString @EqualsAndHashCode //Lombok Getter and Setter
public class Employee {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String role;

    public Employee() {
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }


}
