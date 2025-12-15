package org.sebas.cloudp.user;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import org.sebas.cloudp.common.BaseEntity;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private enum Role {
        USER, ADMIN
    }
}
