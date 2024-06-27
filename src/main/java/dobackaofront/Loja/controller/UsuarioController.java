package dobackaofront.Loja.controller;

import dobackaofront.Loja.entity.Usuario;
import dobackaofront.Loja.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios") // raiz da api
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.salvarUsuario(usuario), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.atualizarUsuario(usuario), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obtemUsuarios() {
        return new ResponseEntity<List<Usuario>>(usuarioService.obtemUsuarios(), HttpStatus.OK);
    }

    @DeleteMapping
    public void excluirUsuario(@RequestBody Usuario usuario) {
        usuarioService.excluirUsuario(usuario);
    }
}
