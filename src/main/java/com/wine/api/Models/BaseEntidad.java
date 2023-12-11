package com.wine.api.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
