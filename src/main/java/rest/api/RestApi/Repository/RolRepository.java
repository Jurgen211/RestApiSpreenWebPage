package rest.api.RestApi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import rest.api.RestApi.Models.Rol;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {


    Optional<Rol> findByDescription(String description);


}
