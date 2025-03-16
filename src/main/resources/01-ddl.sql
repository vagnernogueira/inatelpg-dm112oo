
/**
 *  
 * Aplicação: e-cormerce
 * Subsistema: Pedido e Pagamento
 * 
 * Atenção à associação/agregação/composição
 * Atenção aos princípios SOLID
 * 
**/

CREATE TABLE Cliente (
	id_Cliente BIGINT PRIMARY KEY,
	nm_Cliente VARCHAR(255) NOT NULL,
	cpf_Cnpj VARCHAR(18) NOT NULL,
	ativo VARCHAR(1) NOT NULL
);
--

CREATE TABLE EnderecoCliente (
	id_Endereco_Cliente BIGINT PRIMARY KEY,
	id_Cliente BIGINT NOT NULL,
	cep VARCHAR(8) NOT NULL,
	uf VARCHAR(2) NOT NULL,
	nm_Municipio VARCHAR(255) NOT NULL,
	nm_Bairro VARCHAR(255) NOT NULL,
	nm_Logradouro VARCHAR(255) NOT NULL,
	num_Residencia VARCHAR(36) NOT NULL,
	FOREIGN KEY (id_Cliente) REFERENCES Cliente(id_Cliente)
);

COMMENT ON COLUMN EnderecoCliente.id_Cliente IS 'FK Cliente';
--

CREATE TABLE Produto (
	id_Produto BIGINT PRIMARY KEY,
	nm_Produto VARCHAR(255) NOT NULL,
	preco DECIMAL(12, 2) NOT NULL,
	qtde_Produto_Estoque INT NOT NULL,
	ativo VARCHAR(1) NOT NULL
);
--

CREATE TABLE Categoria (
	id_Categoria BIGINT PRIMARY KEY,
	nm_Categoria VARCHAR(255) NOT NULL
);
--

CREATE TABLE ProdutoCategoria (
	id_Produto_Categoria BIGINT PRIMARY KEY,
	id_Produto BIGINT NOT NULL,
	id_Categoria BIGINT NOT NULL,
	FOREIGN KEY (id_Produto) REFERENCES Produto(id_Produto),
	FOREIGN KEY (id_Categoria) REFERENCES Categoria(id_Categoria)
);

COMMENT ON COLUMN ProdutoCategoria.id_Produto IS 'FK Produto';

COMMENT ON COLUMN ProdutoCategoria.id_Categoria IS 'FK Categoria';
--

CREATE TABLE Pedido (
	id_Pedido BIGINT PRIMARY KEY,
	id_Cliente BIGINT NOT NULL,
	total DECIMAL(12, 2) NOT NULL,
	FOREIGN KEY (id_Cliente) REFERENCES Cliente(id_Cliente)
);

COMMENT ON COLUMN Pedido.id_Cliente IS 'FK Cliente';
--

CREATE TABLE MovimentoPedido (
	id_Movimento_Pedido BIGINT PRIMARY KEY,
	id_Pedido BIGINT NOT NULL,
	tipo_Movimento VARCHAR(1) NOT NULL, 
	dt_Movimento TIMESTAMP NOT NULL,
	FOREIGN KEY (id_Pedido) REFERENCES Pedido(id_Pedido)
);

COMMENT ON COLUMN MovimentoPedido.id_Pedido IS 'FK Pedido';

COMMENT ON COLUMN MovimentoPedido.tipo_Movimento IS 'A - abrir pedido, F - finalizar pedido, P - registrar pagamento, E - registrar entrega';
--

CREATE TABLE PedidoItem (
	id_PedidoItem BIGINT PRIMARY KEY,
	id_Pedido BIGINT NOT NULL,
	id_Produto BIGINT NOT NULL,
	preco_Item DECIMAL(12, 2) NOT NULL,
	qtde_Item INT NOT NULL,
	preco DECIMAL(12, 2) NOT NULL,
	FOREIGN KEY (id_Pedido) REFERENCES Pedido(id_Pedido),
	FOREIGN KEY (id_Produto) REFERENCES Produto(id_Produto)
);

COMMENT ON COLUMN PedidoItem.id_Pedido IS 'FK Pedido';

COMMENT ON COLUMN PedidoItem.id_Produto IS 'FK Produto';
--

CREATE TABLE Fatura (
	id_Fatura BIGINT PRIMARY KEY,
	id_Pedido BIGINT NOT NULL,
	nm_Devedor VARCHAR(255) NOT NULL,
	cpf_Cnpj_Devedor VARCHAR(18) NOT NULL,
	cep_Devedor VARCHAR(8) NOT NULL,
	uf_Devedor VARCHAR(2) NOT NULL,
	nm_Municipio_Devedor VARCHAR(255) NOT NULL,
	nm_Bairro_Devedor VARCHAR(255) NOT NULL,
	nm_Logradouro_Devedor VARCHAR(255) NOT NULL,
	num_Residencia_Devedor VARCHAR(36) NOT NULL,
	nosso_Numero VARCHAR(255) NOT NULL,
	dt_Emissao_Fatura TIMESTAMP NOT NULL,
	dt_Vencimento_Fatura TIMESTAMP NOT NULL,
	valor_Fatura DECIMAL(12, 2) NOT NULL,
	situacao VARCHAR(1) NOT NULL,
	FOREIGN KEY (id_Pedido) REFERENCES Pedido(id_Pedido)
);

COMMENT ON COLUMN Fatura.id_Pedido IS 'FK Pedido';

COMMENT ON COLUMN Fatura.situacao IS 'A - a pagar, P - paga';
--

CREATE TABLE MetodoPagamento (
	id_Metodo_Pagamento BIGINT PRIMARY KEY,
	id_Fatura BIGINT NOT NULL,
	tipo_Metodo_Pagamento VARCHAR(1) NOT NULL,
	valor_Devido_Por_Metodo_Pagamento DECIMAL(12, 2) NOT NULL,
	FOREIGN KEY (id_Fatura) REFERENCES Fatura(id_Fatura)
);

COMMENT ON COLUMN MetodoPagamento.id_Fatura IS 'FK Fatura';

COMMENT ON COLUMN MetodoPagamento.tipo_Metodo_Pagamento IS 'P - pix, C - cartão de crédito';
--

CREATE TABLE MetodoPagamentoPix (
	id_Metodo_Pagamento BIGINT PRIMARY KEY,
	chave_Pix_Recebedor VARCHAR(255) NOT NULL,
	tipo_Chave_Pix_Recebedor VARCHAR(1) NOT NULL,
	nm_Recebedor VARCHAR(255) NOT NULL,
	nm_Banco_Recebedor VARCHAR(255) NOT NULL,
	num_Conta_Recebedor VARCHAR(128) NOT NULL,
	FOREIGN KEY (id_Metodo_Pagamento) REFERENCES MetodoPagamento(id_Metodo_Pagamento)
);

COMMENT ON COLUMN MetodoPagamentoPix.id_Metodo_Pagamento IS '& FK MetodoPagamento';

COMMENT ON COLUMN MetodoPagamentoPix.tipo_Chave_Pix_Recebedor IS 'C - cpf ou cnpj, E - email, P - celular, K - chave aleatória';
--

CREATE TABLE MetodoPagamentoCartaoCredito (
	id_Metodo_Pagamento BIGINT PRIMARY KEY,
	num_Cartao_Sacado VARCHAR(16) NOT NULL,
	nm_Proprietario_Cartao_Sacado VARCHAR(255) NOT NULL,
	validade_Cartao_Sacado VARCHAR(4)  NOT NULL,
	chave_Seguranca_Cartao_Sacado VARCHAR(255) NOT NULL,
	FOREIGN KEY (id_Metodo_Pagamento) REFERENCES MetodoPagamento(id_Metodo_Pagamento)
);

COMMENT ON COLUMN MetodoPagamentoCartaoCredito.id_Metodo_Pagamento IS '& FK MetodoPagamento';

COMMENT ON COLUMN MetodoPagamentoCartaoCredito.validade_Cartao_Sacado IS 'YYMM';

COMMENT ON COLUMN MetodoPagamentoCartaoCredito.chave_Seguranca_Cartao_Sacado IS 'TODO - verificar criptografia';
--

CREATE TABLE Pagamento (
	id_Pagamento BIGINT PRIMARY KEY,
	id_Metodo_Pagamento BIGINT NOT NULL,
	tipo_Pagamento VARCHAR(1) NOT NULL,
	dt_Pagamento TIMESTAMP NOT NULL,
	dt_Registro_Pagamento TIMESTAMP NOT NULL,
	valor_Pago DECIMAL(12, 2) NOT NULL,
	FOREIGN KEY (id_Metodo_Pagamento) REFERENCES MetodoPagamento(id_Metodo_Pagamento)
);

COMMENT ON COLUMN Pagamento.id_Metodo_Pagamento IS 'FK MetodoPagamento';

COMMENT ON COLUMN Pagamento.tipo_Pagamento IS 'P - pix, C - cartão de crédito';

COMMENT ON COLUMN Pagamento.valor_Pago IS 'valor pago na transaçao';
--

CREATE TABLE PagamentoPix (
	id_Pagamento BIGINT PRIMARY KEY,
	nm_Sacado VARCHAR(255) NOT NULL,
	nm_Banco_Sacado VARCHAR(255) NOT NULL,
	num_ContaSacado VARCHAR(255) NOT NULL,
	id_Transacao_Pix VARCHAR(255) NOT NULL,
	FOREIGN KEY (id_Pagamento) REFERENCES Pagamento(id_Pagamento)
);

COMMENT ON COLUMN PagamentoPix.id_Pagamento IS '& FK Pagamento';
--

CREATE TABLE PagamentoCartaoCredito (
	id_Pagamento BIGINT PRIMARY KEY,
	id_Transacao_Cartao_Credito VARCHAR(255) NOT NULL,
	FOREIGN KEY (id_Pagamento) REFERENCES Pagamento(id_Pagamento)
);

COMMENT ON COLUMN PagamentoCartaoCredito.id_Pagamento IS '& FK Pagamento';

-- <<EOF