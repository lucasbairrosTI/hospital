import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        //Tipo nome = new Tipo ();
        Medico paulo = new Medico();    
        Medico joana = new Medico();

        paulo.CRM = "1234";
        paulo.nome = "Paulo Almeida Prado";
        paulo.dataDeNascimento = LocalDate.of(1967,
        Month.APRIL,26);
        paulo.telefoneDeContato = "(051)9999-9999";

        joana.CRM = "5678";
        joana.nome = "Joana Silva da Silva";
        joana.telefoneDeContato = "(051) 8888-8888";

        System.out.println(paulo.nome);
        System.out.println(joana.nome);

        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();

        endereco1.rua = " Travessa nao te interessa";
        endereco1.numero ="12-A";
        endereco1.bairro = "Centro";
        endereco1.estado ="Sao Leopoldo";
        endereco1.cidade ="RS";
        endereco1.cep = "21456-900";

        endereco2.rua = "Rua A";
        endereco2.numero ="245";
        
       //System.out.println(endereco1.bairro.toUpperCase());
       //System.out.println(endereco2.bairro.toUpperCase());

       paulo.endereco = endereco1;
       joana.endereco = endereco2;

       String enderecoDoPaulo = String.format("O médico %s mora na rua %s, no bairro %s - %s",paulo.nome,paulo.endereco.rua, paulo.endereco.numero,paulo.endereco.bairro, paulo.endereco.cidade );

       String enderecoDaJoana = String.format("A médica %s mora na %s,no bairro %s - %s",joana.nome,joana.endereco.rua,joana.endereco.numero,joana.endereco.bairro,joana.endereco.cidade);

       System.out.println(enderecoDoPaulo);
       System.out.println(enderecoDaJoana);


      
    }
}
