package beats.estaticos.core.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import beats.estaticos.core.dtos.GeneroCreateDTO;
import beats.estaticos.core.dtos.GeneroDTO;
import beats.estaticos.core.models.Genero;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GeneroMapper {
  private final ModelMapper mapper;

  public Genero map(GeneroCreateDTO g) {
    return mapper.map(g, Genero.class);
  }

  public GeneroDTO map(Genero g) {
    return mapper.map(g, GeneroDTO.class);
  }

  public List<GeneroDTO> map(List<Genero> g) {
    return g.stream()
            .map(gen -> {
              GeneroDTO dto = mapper.map(gen, GeneroDTO.class);
              return dto;
            })
            .collect(Collectors.toList());
  }

}
