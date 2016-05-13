package com.udr.models;

import javax.persistence.*;

/**
 * Created by udr013 on 11-5-2016.
 */

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "userName",length = 50, nullable = true )
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;



}
