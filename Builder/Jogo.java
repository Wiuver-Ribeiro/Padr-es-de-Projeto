public class Jogo {
    private final String nome;
    private final String plataforma;
    private final String genero;
    private final double preco;
    
    private Jogo(Builder builder) {
        this.nome = builder.nome;
        this.plataforma = builder.plataforma;
        this.genero = builder.genero;
        this.preco = builder.preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPlataforma() {
        return plataforma;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String toString() {
        return nome + " - " + plataforma + " - " + genero + " - " + preco;
    }
    
    public static class Builder {
        private String nome;
        private String plataforma;
        private String genero;
        private double preco;
        
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }
        
        public Builder setPlataforma(String plataforma) {
            this.plataforma = plataforma;
            return this;
        }
        
        public Builder setGenero(String genero) {
            this.genero = genero;
            return this;
        }
        
        public Builder setPreco(double preco) {
            this.preco = preco;
            return this;
        }
        
        public Jogo build() {
            return new Jogo(this);
        }
    }
}
