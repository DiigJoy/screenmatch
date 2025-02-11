package cl.com.jorge.screenmatch.dto;

import cl.com.jorge.screenmatch.model.Categoria;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record SerieDTO(    Long id,
                           String titulo,
                           Integer totalTemporadas,
                           Double avaliacao,
                           Categoria genero,
                           String atores,
                           String poster,
                           String sinopse) {

}
