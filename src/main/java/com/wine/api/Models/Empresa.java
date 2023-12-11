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
@Table(name = "Empresa")
public class Empresa extends BaseEntidad{
    @JoinColumn(name="Empresa", nullable = false)
    private String nombreEmpresa;
}
