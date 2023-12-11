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
@Table(name = "TipoProveedor")
public class TipoProveedor extends BaseEntidad{

    @JoinColumn(name = "NombreProveedor", nullable = false)
    private String nombreProveedor;

}
