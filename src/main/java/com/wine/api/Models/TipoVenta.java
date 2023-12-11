package com.wine.api.Models;

import com.wine.api.Enum.TipoVentaNombre;
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
@Table(name = "TipoVenta")
public class TipoVenta extends BaseEntidad{

    @JoinColumn(name = "NombreTipoVenta")
    private TipoVentaNombre tipoVentaNombre;

}
