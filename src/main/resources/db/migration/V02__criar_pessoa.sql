CREATE TABLE pessoa (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  logradouro VARCHAR(50) NOT NULL,
  numero VARCHAR(5) NOT NULL,
  complemento VARCHAR(200),
  bairro VARCHAR(20) NOT NULL,
  cep VARCHAR(11) NOT NULL,
  cidade VARCHAR(25) NOT NULL,
  estado VARCHAR(25) NOT NULL,
  ativo BOOLEAN not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Carolina Almeida Correia', 'Rua Luciano José Gomes', '1224', null, 'Janeville', '91751153', 'Porto Alegre', 'RS', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Raissa Araujo Sousa', 'Rua Bruno Werner Storck', '1912', null, 'Royal Gas', '09820820', 'Novo Hamburgo', 'RS', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Leila Barbosa Rodrigues', 'Rua Alta', '616', null, 'Auto Parts', '08630010', 'Suzano', 'SP', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Carolina Alves Carvalho', 'Travessa Doze', '1479', null, 'Flores', '39804211', 'Teófilo Otoni', 'MG', false);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Alice Sousa Carvalho', 'Rua Ingazeira', '1969', null, 'Assunção', '08032080', 'São Paulo', 'SP', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Kauã Gomes Rodrigues', 'Rua Maciel Soares', '1196', null, 'Barbosa', '26031440', 'Nova Iguaçu', 'RJ', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Victor Oliveira Rodrigues', 'Rua Guimarães Peixoto', '1653', null, 'Amirante', '52051200', 'Recife', 'PE', false);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Diogo Lima Correia', 'Travessa da Ponte', '1145', null, 'Mooema', '72800720', 'Luziânia', 'GO', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Luiz Martins Araujo', 'Rua Gobrião', '1357', null, 'Luz', '86705160', 'Arapongas', 'PR', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Eduardo de Medeiros Branquinho', 'R. Das Dálias', '194', null, 'Assunção', '09820820', 'São Bernardo do Campo', 'SP', true);