import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jogador {
    private String nome;
    private String cpf;
    private String email;
    private String foto;

    public Jogador (String nome, String cpf, String email, String foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCpf (){
        return cpf;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public String getEmail (){
        return email;
    }

    public  void setEmail (String email){
        this.email = email;
    }

    public String getFoto (){
        return foto;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }

    public String toString() {
        return "Nome: " + nome + "Cpf: " + cpf + "email: " + email + "foto: " + foto;
    }

    public boolean validarCPF(String cpf){
        String formatCPF = cpf.replaceAll("[^0-9]+", "");

        //VERIFICANDO SE TEM 11 DÍGITOS
        if (formatCPF.length() != 11){
            System.out.printf("CPF inválido");
            return false;
        }
        //VERIFICANDO SE TODOS OS DÍGITOS SÃO IGUAIS
        int j, iguais;
        iguais = 0;
        for (j=1; j<11; ++j){
            if (formatCPF.charAt(j) != formatCPF.charAt(j-1)){
                break;
            } else {
                ++ iguais;
            }
        }
        if (iguais == 10){
            System.out.printf("CPF inválido");
            return false;
        }
        //VERIFICAR OS DÍGITOS VERIFICADORES
        int somatorio = 0;
        int i;
        for (i=0; i<9; ++i){
            somatorio = somatorio + (Character.getNumericValue(formatCPF.charAt(i))*(i+1));
        }
        int resto = somatorio%11;
        if (resto == 10) {
            resto = 0;
        }
        if (resto != Character.getNumericValue(formatCPF.charAt(9))){
            System.out.printf("CPF inválido");
            return false;
        } else {
            somatorio = 0;
            for (i=0; i<10; ++i){
                somatorio = somatorio + (Character.getNumericValue(formatCPF.charAt(i))*i);
            }
            resto = somatorio%11;
            if (resto == 10){
                resto = 0;
            }
            if (resto != Character.getNumericValue(formatCPF.charAt(10))){
                System.out.printf("CPF inválido");
                return false;
            }
        }

        return true;
    }

    public boolean validarEmail(String email) {
        String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
