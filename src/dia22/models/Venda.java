package dia22.models;

import dia22.dao.ItemVendaDao;
import dia22.dao.VendaDao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {


    private static Venda dao;

    public Venda(Long id) {
        this.id = id;
    }


    public Venda() {

    }

    private Long id;

    private BigDecimal valor = BigDecimal.valueOf(0);

    private LocalDateTime dataHora = LocalDateTime.now();

    private List<ItemVenda> itens = new ArrayList<>();

    public static Venda inicializarVenda(VendaDao vendaDao) {
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void static Venda inicializarVenda() throws SQLException {
        return inicializarVenda(VendaDao dao);
    }


    public void adicionarItemNaVenda(ItemVendaDao itemVendaDao, ItemVenda itemVenda) throws SQLException {
        itemVendaDao.adicionaItemNaVenda(itemVenda, this);
        this.itens.add(itemVenda);
        this.valor = this.valor.add(itemVenda.getValorTotal());
    }


    public void concluirVenda(VendaDao dao) throws SQLException {
        // dao.finalizarVenda(this);
        dao.finalizarVendaSemSQL(this);
    }
}