package br.com.julia.front_cursos_programacao.cursos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateNewCourseDTO {

    private UUID id;

    private String nome;

    private String categoria;

    private String professor;

    private String ativo;
}
