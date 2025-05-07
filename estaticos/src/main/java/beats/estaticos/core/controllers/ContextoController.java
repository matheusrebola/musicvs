package beats.estaticos.core.controllers;

import java.util.List;

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
  public ResponseEntity<ContextoDTO> atualizar(@RequestBody ContextoCreateDTO dto, @PathVariable String id){
    if (service.encontrarPeloId(id) == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Contexto c = mapper.map(dto);
    Contexto s = service.atualizar(c, id);
    ContextoDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ContextoDTO> buscarPorId(@PathVariable String id){
    Contexto c = service.encontrarPeloId(id);
    if (c == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    ContextoDTO r = mapper.map(c);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<List<ContextoDTO>> encontrarTodos(){
    List<Contexto> c = service.encontrarTodos();
    if (c == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    List<ContextoDTO> r = mapper.map(c);
    return new ResponseEntity<>(r, HttpStatus.OK);
  }
}
