-- 

INSERT INTO Cliente (id_Cliente, nm_Cliente, cpf_Cnpj, ativo) VALUES
(1, 'João da Silva', '123.456.789-01', 'S'),
(2, 'Maria Souza', '987.654.321-02', 'S'),
(3, 'Empresa ABC Ltda.', '12.345.678/0001-90', 'S'),
(4, 'Pedro Oliveira', '111.222.333-44', 'S');

INSERT INTO EnderecoCliente (id_Endereco_Cliente, id_Cliente, cep, uf, nm_Municipio, nm_Bairro, nm_Logradouro, num_Residencia) VALUES
(1, 1, '12345678', 'SP', 'São Paulo', 'Centro', 'Rua Principal', '123'),
(2, 2, '98765432', 'RJ', 'Rio de Janeiro', 'Copacabana', 'Avenida Atlântica', '456'),
(3, 3, '54321876', 'MG', 'Belo Horizonte', 'Savassi', 'Rua das Flores', '789'),
(4, 4, '11223344', 'RS', 'Porto Alegre', 'Moinhos de Vento', 'Rua dos Andradas', '1011');

INSERT INTO Produto (id_Produto, nm_Produto, preco, qtde_Produto_Estoque, ativo) VALUES
(1, 'Notebook Dell XPS', 5000.00, 10, 'S'),
(2, 'Smartphone Samsung Galaxy', 2500.00, 20, 'S'),
(3, 'Mouse Logitech', 100.00, 50, 'S'),
(4, 'Teclado Mecânico', 300.00, 15, 'S'),
(5, 'PlayStation 5', 6000.00, 10, 'S'),
(6, 'Nintendo Switch', 4000.00, 8, 'S'),
(7, 'Xbox Series X/S', 5000.00, 20, 'S');

INSERT INTO Categoria (id_Categoria, nm_Categoria) VALUES
(1, 'Eletrônicos'),
(2, 'Informática'),
(3, 'Periféricos');

INSERT INTO ProdutoCategoria (id_Produto_Categoria, id_Produto, id_Categoria) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 1),
(4, 2, 2),
(5, 3, 3),
(6, 4, 3),
(7, 5, 1),
(8, 6, 1),
(9, 7, 1);

/*DELETE FROM PUBLIC.PRODUTOCATEGORIA 
DELETE FROM PUBLIC.CATEGORIA 
DELETE FROM PUBLIC.PRODUTO 
DELETE FROM PUBLIC.ENDERECOCLIENTE 
DELETE FROM PUBLIC.CLIENTE */