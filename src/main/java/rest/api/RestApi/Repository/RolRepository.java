package rest.api.RestApi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import rest.api.RestApi.Models.Rol;

import java.util.List;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {


    List<Rol> findByDescription(String description);


}
