public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0.00f;
    }

    // SET
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // GET
    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void abrirConta() {
        if (!this.status) {// SO VAI ENTRAR NO IF SE A CONTA ESTIVER FECHADA.
            this.status = true;

            if (this.tipo.equals("Conta Corrente")) {
                this.saldo = 50.00f;
            } else if (this.tipo.equals("Conta Poupanca")) {
                this.saldo = 150.00f;
            }
        }
    }

    public void fecharConta() {
        if (this.status) {
            if (this.saldo == 0f) {
                this.status = false;
            }
        }
    }

    public void depositar(float valorDeposito) {
        if (this.status) {
            this.saldo += valorDeposito;
        }
    }

    public void sacar(float valorSaque){
        if (this.status){
            //VERIFICAR SE O SALDO É MAIOR OU IGUAL QUE O VALOR DE SAQUE.
            if (this.saldo >= valorSaque){
                this.saldo -= valorSaque;
            }
        }  
    }

     public void pagarMensal(){
         if (this.tipo.equals("Conta Corrente")){
             this.saldo -= 12.00f;
         }
         else if (this.tipo.equals("Conta Poupanca")){
             this.saldo -= 20.00f;
         }

     }   
}