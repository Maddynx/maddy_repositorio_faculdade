-- Exercício 1:
SELECT
    c.nome AS cliente,
    v.produto
FROM CLIENTES c
INNER JOIN VENDAS v
    ON c.id_cliente = v.id_cliente;

-- Exercício 2:

SELECT
    NVL(c.nome, 'Sem Cliente') AS cliente,
    v.produto,
    v.valor
FROM CLIENTES c
RIGHT JOIN VENDAS v
    ON c.id_cliente = v.id_cliente;

-- Exercício 3:

SELECT
    c.nome,
    c.cidade
FROM CLIENTES c
LEFT JOIN VENDAS v
    ON c.id_cliente = v.id_cliente
WHERE v.id IS NULL;

-- Exercício 4:

SELECT
    c.cidade,
    NVL(SUM(v.valor), 0) AS total_vendas
FROM CLIENTES c
LEFT JOIN VENDAS v
    ON c.id_cliente = v.id_cliente
GROUP BY c.cidade;