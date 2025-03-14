import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacoes {
    public static boolean validarCPF(String cpf){
        String formatCPF = cpf.replaceAll("[^0-9]+", "");

        // VERIFICANDO SE TEM 11 DÍGITOS
        if (formatCPF.length() != 11){
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
                return false;
            }
        }

        return true;
    }

    public static boolean validarEmail(String email) {
        String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}


