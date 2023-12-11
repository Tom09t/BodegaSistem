package com.wine.api.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Venta")
public class Venta extends BaseEntidad{

    @JoinColumn(name = "FechaVenta", nullable = false)
    private Date fechaVenta;
    @JoinColumn(name = "TotalVenta", nullable = false)
    private double totalVenta;
}
