package models;

import play.data.validation.Constraints;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AbstractUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(length = 255,nullable = true)
    @Constraints.MaxLength(30)
    @Constraints.MinLength(6)
    public String password;

    @Column(length = 30, nullable = false, unique = true)
    @Constraints.MaxLength(30)
    @Constraints.MinLength(3)
    @Constraints.Required
    public String username;

}
