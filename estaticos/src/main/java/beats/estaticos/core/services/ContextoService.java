package beats.estaticos.core.services;

import java.util.List;

import org.springframework.stereotype.Service;

import beats.estaticos.core.models.Contexto;
import beats.estaticos.core.repositories.ContextoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContextoService {
  private final ContextoRepository repository;

  public Contexto salvar(Contexto c) {
    return repository.save(c);
  }

  public Contexto atualizar(Contexto c, String id) {
    deletarPeloId(id);
    c.setId(id);
    return salvar(c);
  }

  public Contexto encontrarPeloId(String id) {
    return repository.findById(id).orElse(null);
  }

  public void deletarPeloId(String id){
    repository.deleteById(id);
  }

  public List<Contexto> encontrarTodos() {
    return repository.findAll();
  }

}
