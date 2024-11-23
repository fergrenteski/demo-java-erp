package com.grenteski.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoEmpresa {
    MEI("Micro Empreendedor Individual"),
    EIRELI("Empresa Individual de Responsabilidade Legal"),
    LTDA("Sociedade Limitada"),
    SA("Sociedade Anônima");

    private final String decricao;
}
