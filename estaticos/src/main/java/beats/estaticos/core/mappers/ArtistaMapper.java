package beats.estaticos.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import beats.estaticos.core.dtos.ArtistaCreateDTO;
import beats.estaticos.core.dtos.ArtistaDTO;
import beats.estaticos.core.models.Artista;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ArtistaMapper {
  private final ModelMapper mapper;

  public Artista map(ArtistaCreateDTO a) {
    return mapper.map(a, Artista.class);
  }

  public ArtistaDTO map(Artista a) {
    return mapper.map(a, ArtistaDTO.class);
  }

  public Artista map(ArtistaDTO a) {
    return mapper.map(a, Artista.class);
  }

  public List<ArtistaDTO> map(List<Artista> a) {
    return a.stream()
            .map(art -> {
              ArtistaDTO dto = mapper.map(art, ArtistaDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

}
