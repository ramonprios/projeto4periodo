package dados;

import java.util.List;

import javax.persistence.TypedQuery;

import basicas.ItemCardapio;

public class ItemDAO extends DAO.DAOGenerico<ItemCardapio> implements IItemDAO{

	@Override
	public List<ItemCardapio> pesquisarItemsPorTitulo(String nome,TipoPesquisaString tipoPesquisa) {
		TypedQuery<ItemCardapio> tq = this.entityManager.createNamedQuery("Item.findByNome", ItemCardapio.class);
		if (tipoPesquisa == TipoPesquisaString.COMECA_COM){
			tq.setParameter("valor", nome + "%");	
		} else if (tipoPesquisa == TipoPesquisaString.CONTEM){
			tq.setParameter("valor", "%" + nome + "%");	
		}
		return tq.getResultList();
	}

}
