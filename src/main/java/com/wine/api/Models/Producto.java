package com.wine.api.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Producto")
public class Producto extends BaseEntidad{

    @JoinColumn(name = "NombreProducto", nullable = false)
    private String nombre;

    @JoinColumn(name = "Precio", nullable = false)
    private double precio;

    @JoinColumn(name = "FechaBajaProducto", nullable = true)
    private Date fechaBajaProducto;

}
