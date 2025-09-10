package med.voll.api.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {
    @PostMapping
    public ResponseEntity efetuarLogin(@RequestMapping @Valid DadosAutenticacao dados){
        return null;
    }
}
