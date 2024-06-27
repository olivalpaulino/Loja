package dobackaofront.Loja.service;

import dobackaofront.Loja.entity.Usuario;
import dobackaofront.Loja.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository; // chamou o repositorio para trabalhar com a camada do banco de dados

    // salva no banco de dados atraves do repositorio
    public Usuario salvarUsuario(Usuario usuario) {
        return this.iUsuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return this.iUsuarioRepository.save(usuario);
    }

    public void excluirUsuario(Usuario usuario) {
        this.iUsuarioRepository.deleteById(usuario.getId());
    }

    public List<Usuario> obtemUsuarios() {
        return this.iUsuarioRepository.findAll();
    }
}
