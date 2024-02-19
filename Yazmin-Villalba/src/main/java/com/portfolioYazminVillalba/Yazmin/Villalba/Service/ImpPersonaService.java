/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioYazminVillalba.Yazmin.Villalba.Service;

import com.portfolioYazminVillalba.Yazmin.Villalba.Entity.Persona;
import com.portfolioYazminVillalba.Yazmin.Villalba.Interface.IPersonaService;
import com.portfolioYazminVillalba.Yazmin.Villalba.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

//traer una lista de personas
    @Override
    public List<Persona> getPersona(){
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    //guardar un objeto de tipo persona
    @Override
    public void savePersona(Persona persona){
        ipersonaRepository.save(persona);
    }


    //eliminar un objeto por id
   @Override
   public void deletePersona(Long id){
        ipersonaRepository.deleteById(id);
   }

    //buscar persona por id
    @Override
    public Persona findPersona(Long id){
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
}
