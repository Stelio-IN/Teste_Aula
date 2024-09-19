import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Plano plano = new Plano();
        plano.setNome("Plano Mensal");
        plano.setDescricao("Plano de um mês");
        plano.setPreco(50.0);
        plano.setDuracao(2);
        plano.setDataInicio(new Date()); // Defina a data de início
        plano.setDuracaoEmMeses(plano.getDuracao());
        System.out.println();
        System.out.println(plano.getDataInicio());
        System.out.println(plano.getDataTermino());
        System.out.println(plano.getDuracao());

    }
}

//    private void listarClientes() {
//        GenericDAO dao = new GenericDAO();
//        Class<Cliente> classe = Cliente.class;
//
//        List<Cliente> lista = (List<Cliente>) dao.listar(classe);
//
//        // Filtra a lista para incluir apenas clientes do sexo masculino
//        List<Cliente> listaMasculinos = lista.stream()
//                .filter(cliente -> "Masculino".equals(cliente.getGenero()))
//                .collect(Collectors.toList());
//
//        // Filtra a lista para incluir apenas clientes femininos
//        List<Cliente> listaFemininos = lista.stream()
//                .filter(cliente -> "Feminino".equals(cliente.getGenero()))
//                .collect(Collectors.toList());
//
//        Platform.runLater(() -> {
//            colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
//            colunaCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
//            colunaImagem.setCellValueFactory(new PropertyValueFactory<>("imagem"));
//
//            observableListMasc = FXCollections.observableArrayList(listaMasculinos);
//            tabelaClienteMasc.setItems(observableListMasc);
//        });
//    }