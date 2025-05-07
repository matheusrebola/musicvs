package beats.estaticos.core.mappers;

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

}
