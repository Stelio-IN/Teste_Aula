import java.util.Calendar;
import java.util.Date;

public class Plano {
    private int duracao;
    private String nome;
    private String descricao;
    private Double preco;

    private byte situacao;

    private Date dataInicio;
    private Date dataTermino;

    public void zerarPlanoNoFinalDoMes() {
        Date dataAtual = new Date();
        if (dataTermino != null && dataAtual.after(dataTermino)) {
            // O plano expirou, defina a data de término para o final do próximo mês
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataTermino);
            calendar.add(Calendar.MONTH, 1);
            dataTermino = calendar.getTime();
            // Defina o status como inativo
            situacao = 0;
        }
    }
    public void setDuracaoEmMeses(int duracaoEmMeses) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicio);
        calendar.add(Calendar.MONTH, duracaoEmMeses);
        dataTermino = calendar.getTime();
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public byte getSituacao() {
        return situacao;
    }

    public void setSituacao(byte situacao) {
        this.situacao = situacao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
}
