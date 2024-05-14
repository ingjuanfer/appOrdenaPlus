package com.ordenaplus.interfacces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ordenaplus.modelo.Usuario;

@Repository
public interface IUsuario  extends CrudRepository<Usuario, Integer> {

}
