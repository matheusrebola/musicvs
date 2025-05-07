package beats.estaticos.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beats.estaticos.core.dtos.ArtistaCreateDTO;
import beats.estaticos.core.dtos.ArtistaDTO;
import beats.estaticos.core.mappers.ArtistaMapper;
import beats.estaticos.core.services.ArtistaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/artistas")
@RequiredArgsConstructor
public class ArtistaController {
  private final ArtistaMapper mapper;
  private final ArtistaService service;
  
  @PostMapping
  public void criar(@RequestBody ArtistaCreateDTO dto){
    
  }

  @PutMapping("/{id}")
  public void atualizar(@RequestBody ArtistaDTO dto, @PathVariable String id){

  }

  @GetMapping("/{id}")
  public void buscarPorId(@PathVariable String id){

  }

  @GetMapping
  public void encontrarTodos(){
    
  }
}
