package com.spring.tktapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MLoginUser implements Serializable {

    @Id
    @NotNull
    private String mailAddress;

    @NotNull
    private String loginUserId;

    @NotNull
    private String loginPassword;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public void MloginUser() {
        setCreatedAt(new Date());
    }
}
