package br.com.alura.escola.aluno;

//import java.util.regex.Pattern;

// VALUE OBJECT
public class CPF {

	private String numero;
	
	public CPF(String numero) {
		if (numero == null ||
				!numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF invalido!");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
	
	// VALIDAÇAO MAIS COMPLETA
    /*private static final int[] pesoCPF = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

    // Pattern do CPF com e sem formatação
    private final String pattern = "\\d{11}|\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

    private final String repetidos = "(\\d)\\1{10}";

    private final String numero;

    public CPF(String cpf) {
        if (!validar(cpf)) {
            throw new IllegalArgumentException();
        }
        this.numero = cpf;
    }

    public String getCpfFormatado() {
        if (numero.length() == 11) {
            return numero.substring(0, 4) + "." + numero.substring(4, 7) + "." + numero.substring(7, 10) + "-"
                    + numero.substring(10, 12);
        } else {
            return numero;
        }
    }

    public String getCpfNumeros() {
        if (numero.length() == 14) {
            return numero.trim().replaceAll("\\D", "");
        } else {
            return numero;
        }
    }

    private boolean validar(String cpf) {
        // Verifica se o número está fora do padrão de cpf ou de cpf formatado.
        if (!Pattern.compile(pattern).matcher(cpf).matches()) {
            return false;
        }

        // Remove caracteres não númericos para CPF formatado
        if (cpf.length() == 14) {
            cpf = cpf.trim().replaceAll("\\D", "");
        }

        // Verifica se todos os números estão repetidos
        if (Pattern.compile(repetidos).matcher(cpf).matches()) {
            return false;
        }

        Integer digito1 = calcularDigito(cpf.substring(0, 9));
        Integer digito2 = calcularDigito(cpf.substring(0, 9) + digito1);

        return cpf.equals(cpf.substring(0, 9) + digito1.toString() + digito2.toString());
    }

    private int calcularDigito(String str) {
        int soma = 0;

        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * pesoCPF[pesoCPF.length - str.length() + indice];
        }

        soma = 11 - soma % 11;

        return soma > 9 ? 0 : soma;
    }*/
    
}
