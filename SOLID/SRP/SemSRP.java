package SRP;

public class SemSRP {
    //PRINCIPIO DA RESPONSABILIDADE UNCIA (SRP)
 
    public class Usuario {
        private String nome;
        private String email;
        private String senha;
        private boolean autenticado;
    
        public void autenticar(String email, String senha) {
            // código para autenticar o usuário
        }
    
        public void exibirPerfil() {
            // código para exibir o perfil do usuário
        }
    
        public void salvar() {
            // código para salvar os dados do usuário no banco de dados
        }
    }
    
}
