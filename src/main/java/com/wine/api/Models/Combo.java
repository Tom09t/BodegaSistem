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
@Table(name = "Combo")
public class Combo extends BaseEntidad{

    @JoinColumn(name = "NombreCombo", nullable = false)
    private String nombreCombo;
    @JoinColumn(name = "Descuento", nullable = false)
    private double descuento;

}
