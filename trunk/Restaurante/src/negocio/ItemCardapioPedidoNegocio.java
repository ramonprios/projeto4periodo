package negocio;

import dados.IItemCardapioPedidoDao;
import dados.ItemCardapioPedidoDAO;
import basicas.ItemCardapioPedido;

public class ItemCardapioPedidoNegocio {
	
	IItemCardapioPedidoDao dao = new ItemCardapioPedidoDAO();
	
	public void inserir(ItemCardapioPedido itemCardPedido) throws Exception{
		if (itemCardPedido.getItem() == null) {
			throw new Exception("O item nao pode ser nulo!");
		}else if(itemCardPedido.getPedido() == null){
			throw new Exception("O pedido nao pode ser nulo!");
		}
		
		dao.inserir(itemCardPedido);
	}
}
