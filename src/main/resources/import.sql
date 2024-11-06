INSERT INTO tb_users (full_name, cpf, rg, birth_date, password, email, phone) VALUES ('Pedro Lavarda Zorel', '095.458.529-17', '13-199.542-3', '2005-10-09', 'P4ssword', 'plzorel@gmail.com', '+5546988358080');

INSERT INTO tb_adresses (street, city, state, cep, country, iduser) VALUES ('Ercilia Corona', 'Pato Branco', 'Paraná', '85502-300', 'Brasil', 1);

INSERT INTO tb_adresses (street, city, state, cep, country, iduser) VALUES ('Paraná', 'Pato Branco', 'Paraná', '85502-302', 'Brasil', 1);

INSERT INTO tb_categories (name) VALUES ('Eletrônicos');

INSERT INTO tb_products (name, description, price, idcategory) VALUES ('Geladeira', 'Geladeira eletrolux 2025 220v', 2500.00, 1);
