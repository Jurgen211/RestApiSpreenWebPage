package rest.api.RestApi.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.api.RestApi.Models.Rol;
import rest.api.RestApi.Repository.RolRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {
    private RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }


    //CRUD
        //Create Rol
    public void CreateRol(Rol rol) {
        rolRepository.save(rol);
    }
        //List Rol
    public List<Rol> GetAllRols() {
        return rolRepository.findAll();
    }
        //Find Rol
    Optional<Rol> GetRolById(Long id) {
        return rolRepository.findById(id);
    }
        //FInd Rol By Description
    Optional<Rol> GetRolByRolDescription(String description) {
        return  rolRepository.findByDescription(description);
    }

}
