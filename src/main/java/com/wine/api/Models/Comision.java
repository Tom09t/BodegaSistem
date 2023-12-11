package com.wine.api.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Comision")
public class Comision extends BaseEntidad{

    @JoinColumn(name = "PorcentajeComision", nullable = false)
    private double porcentajeComision;

}
