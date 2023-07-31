CREATE TABLE IF NOT EXISTS CLIENTES (
    client_id SERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    rua VARCHAR(150),
    numero VARCHAR(150),
    estado VARCHAR(150),
    cidade VARCHAR(150),
    inscricao VARCHAR(150) NOT NULL,
    telefone VARCHAR(150)
);