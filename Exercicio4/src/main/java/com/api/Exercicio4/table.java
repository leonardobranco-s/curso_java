package com.api.Exercicio4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "table1")

public class table {
    @Id
    public String id;
    public String teste;

}

