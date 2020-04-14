package com.macys.gqpoc.domain.store.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String type;
    private String location;
    private String levels;
    private LocalDate launchDate;
}
