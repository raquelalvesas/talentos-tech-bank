package dia22.dao;

import dia22.models.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDao {


    // Gerando um insert para o Dao p/ gerar uma conexão
    private Connection conn;
    private PreparedStatement selectVerificaProdutoExistente;

    public ProdutoDao(Connection conn) {
        this.conn = conn;
    }


    // Metodo para inserir o produto
    // Para criar um prod precisa realizar um insert
    public void inserirProduto(Produto produto) throws SQLException {
        String query = "insert into tb_produto values(default, ?, ?, ?, ?, ?, ?);";


        // RETURN_GENERATED_KEYS retorna o id do produto criado
        // O try deixa a função mais segura e msm se der algum erro a conexão será fechada
        try (PreparedStatement insertProduto = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            int i = 0;
            // Vai pegar a descrição do produto e preencher no ponto de interrogação - insertProduto.setString....
            // e no final ele irá rodar o script
            insertProduto.setString(++i, produto.getDescricao());
            insertProduto.setBigDecimal(++i, produto.getValorDeCusto());
            insertProduto.setBigDecimal(++i, produto.getPesoUnitario());
            insertProduto.setString(++i, produto.getUnidadeMedidaPeso());
            insertProduto.setString(++i, produto.getCodigoDeBarras());
            insertProduto.setBigDecimal(++i, produto.getValorVenda());

            insertProduto.executeUpdate();

            ResultSet rsIdProduto = insertProduto.getGeneratedKeys();
            // Vai pegar o próximo valor que ele encontrou
            rsIdProduto.next();
            Long id = rsIdProduto.getLong("id");

            produto.setId(id);

            rsIdProduto.close();
        }

    }

    // Metodo para verificar se o produto já está cadastrado
    public Boolean verificarSeProdutoExiste(String codigoDeBarras) throws SQLException {
        String query = "select count(*) > 0 as produto_ja_cadastrado from tb_produto tp where codigo_de_barras = ?";

        try (PreparedStatement selectVerificarProdutoExistente = conn.prepareStatement(query)) {
            selectVerificarProdutoExistente.setString(1, codigoDeBarras);

            ResultSet rs = selectVerificaProdutoExistente.executeQuery();
            rs.next();
            return rs.getBoolean("produto_ja_cadastrado");
        }

    }

    public List<Produto> buscarProdutos(String filtro) {
        return null;
    }
}


