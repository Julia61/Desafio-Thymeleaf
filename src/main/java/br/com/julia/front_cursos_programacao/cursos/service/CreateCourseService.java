package br.com.julia.front_cursos_programacao.cursos.service;

import br.com.julia.front_cursos_programacao.cursos.dto.CreateNewCourseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CreateCourseService {

    @Value("${host.api.gestao.vagas}")
    private String hostAPICursosProgramacao;

    public void execute(CreateNewCourseDTO createNewCourseDTO){

        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<CreateNewCourseDTO> request = new HttpEntity<>(createNewCourseDTO, headers);

        var url = hostAPICursosProgramacao.concat("/cursos/novoCursos");

        var result = rt.postForObject(url, request, String.class);
        System.out.println(result);



    }

}
