package com.udr.models;

import javax.persistence.*;
import java.sql.Date;

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

    @Column(name = "sureName", length = 50, nullable = true)
    private String sureName;

    @Column(name = "firstName", length = 50, nullable = true)
    private String firstName;

    @Column(name = "first_date")
    private Date join_date;


}
