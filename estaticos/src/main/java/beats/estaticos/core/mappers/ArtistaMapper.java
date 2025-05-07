package beats.estaticos.core.mappers;

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

  public Artista map(ArtistaCreateDTO dto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'map'");
  }

  public ArtistaDTO map(Artista s) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'map'");
  }

}
