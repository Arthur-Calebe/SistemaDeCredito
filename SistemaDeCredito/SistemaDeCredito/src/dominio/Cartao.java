package dominio;

public class Cartao {
    private String nomeTitular;
    private double limite;
    private double totalGasto;

    public void setLimite(double limite) {
        if (limite <= 0) {
            return;
        }
        this.limite = limite;
    }

    public boolean realizarCompra(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (totalGasto + valor > limite) {
            return false;
        }

        totalGasto += valor;
        return true;
    }

    public double getLimiteDisponivel() {
        return limite - totalGasto;
    }

    public void imprimeVia() {
        System.out.println("Titular da conta: " + this.nomeTitular);
        System.out.println("Limite disponível: " + this.getLimiteDisponivel());
        System.out.println("Total gasto: " + this.totalGasto);
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


}
