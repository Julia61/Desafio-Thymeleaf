package br.com.julia.front_cursos_programacao.cursos.service;


import br.com.julia.front_cursos_programacao.cursos.dto.CreateNewCourseDTO;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class ListAllCoursesService {

    @Value("${host.api.gestao.vagas}")
    private String hostAPICursosProgramacao;

    public List<CreateNewCourseDTO> execute(){
        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<Object> httpEntity = new HttpEntity<>(headers);

        var url = hostAPICursosProgramacao.concat("/cursos");

        ParameterizedTypeReference<List<CreateNewCourseDTO>> responseType = new ParameterizedTypeReference<List<CreateNewCourseDTO>>() {

        };

        var result = rt.exchange(url, HttpMethod.GET, httpEntity,responseType);
        return result.getBody();
    }

    public CreateNewCourseDTO getCourseDetailsById(UUID id) {
        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<Object> httpEntity = new HttpEntity<>(headers);

        // Atualize o endpoint com o ID do curso
        String url = hostAPICursosProgramacao.concat("/cursos/" + id);

        // Tipo de resposta esperada
        ParameterizedTypeReference<CreateNewCourseDTO> responseType = new ParameterizedTypeReference<CreateNewCourseDTO>() {};

        // Envia a requisição GET para o back-end
        var result = rt.exchange(url, HttpMethod.GET, httpEntity, responseType);

        // Retorna o corpo da resposta
        return result.getBody();
    }

    public CreateNewCourseDTO atualizaCurso(UUID id, CreateNewCourseDTO createNewCourseDTO) {
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<CreateNewCourseDTO> httpEntity = new HttpEntity<>(createNewCourseDTO, headers);

        String url = hostAPICursosProgramacao.concat("/cursos/" + id);

        ParameterizedTypeReference<CreateNewCourseDTO> responseType = new ParameterizedTypeReference<CreateNewCourseDTO>() {};

        var result = rt.exchange(url, HttpMethod.PUT, httpEntity, responseType);

        return result.getBody();
    }

    public void deletaCurso(UUID id) {
        RestTemplate rt = new RestTemplate();
        var url = hostAPICursosProgramacao.concat("/deletar/" + id);

        rt.exchange(url, HttpMethod.DELETE, null, Void.class);
    }







}
