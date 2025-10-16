-- Exercício 1:

SELECT
    c.nome AS cliente,
    v.produto,
    c.cidade
FROM VENDAS v
INNER JOIN CLIENTES c
    ON v.id_cliente = c.id_cliente;

-- Exercício 2:

SELECT
    c.estado,
    SUM(v.valor) AS total_vendas
FROM VENDAS v
INNER JOIN CLIENTES c
    ON v.id_cliente = c.id_cliente
GROUP BY c.estado;

-- Exercício 3:

SELECT
    c.cidade,
    SUM(v.valor) AS total
FROM VENDAS v
INNER JOIN CLIENTES c
    ON v.id_cliente = c.id_cliente
GROUP BY c.cidade
HAVING SUM(v.valor) > 2000;

-- Exercício 4:

SELECT
    c.nome AS cliente,
    v.categoria,
    SUM(v.valor) AS total_categoria
FROM VENDAS v
INNER JOIN CLIENTES c
    ON v.id_cliente = c.id_cliente
GROUP BY c.nome, v.categoria
HAVING SUM(v.valor) = (
    SELECT MAX(SUM(v2.valor))
    FROM VENDAS v2
    WHERE v2.id_cliente = c.id_cliente
    GROUP BY v2.categoria
);