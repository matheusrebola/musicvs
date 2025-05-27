package beats.estaticos.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/artistas")
@RequiredArgsConstructor
public class ArtistaController {
  @PostMapping
  public void criar(@RequestBody AlbumCreateDTO dto){

  }

  @PutMapping("/{id}")
  public void atualizar(@RequestBody AlbumDTO dto, @PathVariable String id){

  }

  @GetMapping("/{id}")
  public void buscarPorId(@PathVariable String id){

  }

  @GetMapping
  public void encontrarTodos(){
    
  }
}
