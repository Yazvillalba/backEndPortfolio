/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioVillalbaYazmin.YazminVillalba.Security.Service;

import com.PortfolioVillalbaYazmin.YazminVillalba.Security.Entity.Rol;
import com.PortfolioVillalbaYazmin.YazminVillalba.Security.Enums.RolNombre;
import com.PortfolioVillalbaYazmin.YazminVillalba.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yaz
 */
@Service
@Transactional
public class RolService {
    
    @Autowired 
    iRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        iRolRepository.save(rol);
    }
}
