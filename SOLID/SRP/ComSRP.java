package SRP;

public class ComSRP {
   // PRINCIPIO DA RESPONSABILIDADE UNCIA (SRP)
   
    public class Usuario {
        private String nome;
        private String email;
        private String senha;
    
        // getters e setters
    
    }
    
    public class Autenticador {
        public boolean autenticar(String email, String senha) {
            // código para autenticar o usuário
            if(email != null && senha!= null) {
                return true;
            } return false;
        }
    }
    
    public class RepositorioDeUsuarios {
        public void salvar(Usuario usuario) {
            // código para salvar os dados do usuário no banco de dados
        }
    
        public Usuario buscarPorEmail(String email) {
            // código para buscar um usuário pelo email
            return null;
        }
    }
    
    public class PerfilDoUsuario {
        public void exibir(Usuario usuario) {
            // código para exibir o perfil do usuário
        }
    }
    
}
