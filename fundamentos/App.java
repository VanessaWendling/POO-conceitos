package fundamentos;

public class App{

    /*TIPOS DE DADOS
     * byte tipoByte = 127;
     * Short tipoShort = 32767;
     * Integer tipoInteger = 2147483647;
     * Long tipoLong = 9223372036854775807L;
     * Float tipoFloat = 2.8F;
     * Double tipoDouble = 4.89;
     * 
     * String tipoString = "Sou um texto";
     * char tipoChar = 'S';
     * Boolean tipoBoolean = false;
    */
    
        public static void main(String[] args) {
            System.out.println("Aprendendo POO com Java");
            
            //intanciando uma classe, criando um objeto
            Pessoa pessoa1 = new Pessoa();
            // pessoa1.nome = "Vanessa";
            pessoa1.setNome("Vanessa");
            // pessoa1.idade = 20;
            pessoa1.setIdade(20);
    
    
            // System.out.println(pessoa1.nome);
            System.out.println(pessoa1.getNome());
            // System.out.println(pessoa1.idade);
            System.out.println(pessoa1.getIdade());
    
            //construtor padrão
            Carro meuCarro = new Carro();
            meuCarro.setAno(2021);
            meuCarro.setModelo("BMW");
            meuCarro.setCor("preto");
    
            System.out.println(meuCarro.getModelo());
            System.out.println(meuCarro.getAno());
            System.out.println(meuCarro.getCor());
    
            Carro novoCarro = new Carro ("Fiat Toro", 2020, "Branca");
    
            System.out.println(novoCarro.getModelo());
            System.out.println(novoCarro.getAno());
            System.out.println(novoCarro.getCor());
        
        }
    }