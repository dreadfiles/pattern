package org.pattern.factory.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Team {

    private int id;
    private String name;
    private String country;
    private int performance;

}
