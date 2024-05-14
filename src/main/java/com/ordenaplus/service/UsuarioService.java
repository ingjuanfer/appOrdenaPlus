package com.ordenaplus.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ordenaplus.interfacces.IUsuario;
import com.ordenaplus.interfaceService.IUsuarioService;
import com.ordenaplus.modelo.Usuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuario data;

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>)data.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
