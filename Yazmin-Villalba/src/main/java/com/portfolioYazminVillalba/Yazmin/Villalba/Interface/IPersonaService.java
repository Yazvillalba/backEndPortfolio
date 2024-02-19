
package com.portfolioYazminVillalba.Yazmin.Villalba.Interface;

import com.portfolioYazminVillalba.Yazmin.Villalba.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas
public List<Persona> getPersona();

//guardar un objeto de tipo persona
public void savePersona(Persona persona);
 //eliminar un objeto por id
public void deletePersona(Long id);

//buscar persona por id
public Persona findPersona(Long id);
}
