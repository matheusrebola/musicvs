package beats.estaticos.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beats.estaticos.core.dtos.ContextoCreateDTO;
import beats.estaticos.core.dtos.ContextoDTO;
import beats.estaticos.core.mappers.ContextoMapper;
import beats.estaticos.core.models.Contexto;
import beats.estaticos.core.services.ContextoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/contexto-historico")
@RequiredArgsConstructor
public class ContextoController {
  private final ContextoMapper mapper;
  private final ContextoService service;

  @PostMapping
  public ResponseEntity<ContextoDTO> criar(@RequestBody ContextoCreateDTO dto){
    Contexto c = mapper.map(dto);
    Contexto s = service.salvar(c);
    ContextoDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public void atualizar(@RequestBody ContextoDTO dto, @PathVariable String id){

  }

  @GetMapping("/{id}")
  public void buscarPorId(@PathVariable String id){

  }

  @GetMapping
  public void encontrarTodos(){
    
  }
}
