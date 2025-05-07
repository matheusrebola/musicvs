package beats.estaticos.core.services;

import org.springframework.stereotype.Service;

import beats.estaticos.core.models.Genero;
import beats.estaticos.core.repositories.GeneroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeneroService {
  private final GeneroRepository repository;

  public Genero salvar(Genero g) {
    return repository.save(g);
  }

  public Genero encontrarPeloId(String id) {
    return repository.findById(id).orElse(null);
  }

  public Genero atualizar(Genero g, String id) {
    deletarPeloId(id);
    g.setId(id);
    return salvar(g);
  }

  private void deletarPeloId(String id) {
    repository.deleteById(id);
  }

}
