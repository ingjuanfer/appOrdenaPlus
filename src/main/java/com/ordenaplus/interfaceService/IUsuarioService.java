package com.ordenaplus.interfaceService;

import java.util.List;
import java.util.Optional;
import com.ordenaplus.modelo.Usuario;

public interface IUsuarioService {
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario u);
	public void delete(int id);
}
