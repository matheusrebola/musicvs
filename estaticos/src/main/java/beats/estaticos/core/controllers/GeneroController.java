package beats.estaticos.core.controllers;

import org.springframework.aot.generate.GeneratedMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beats.estaticos.core.dtos.GeneroCreateDTO;
import beats.estaticos.core.dtos.GeneroDTO;
import beats.estaticos.core.mappers.GeneroMapper;
import beats.estaticos.core.models.Genero;
import beats.estaticos.core.services.GeneroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/generos-musicais")
@RequiredArgsConstructor
public class GeneroController {
  private final GeneroMapper mapper;
  private final GeneroService service;

  @PostMapping
  public ResponseEntity<GeneroDTO> criar(@RequestBody GeneroCreateDTO dto){
    Genero g = mapper.map(dto);
    Genero s = service.salvar(g);
    GeneroDTO r = mapper.map(s);
    return new ResponseEntity<>(r, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public void atualizar(@RequestBody GeneroCreateDTO dto, @PathVariable String id){

  }

  @GetMapping("/{id}")
  public void buscarPorId(@PathVariable String id){

  }

  @GetMapping
  public void encontrarTodos(){
    
  }
}
