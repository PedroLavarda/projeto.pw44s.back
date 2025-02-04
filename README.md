DUPLA: 
- PEDRO LAVARDA ZOREL a2562529
- FELIPE RAFAGNIN VILHALVA a2571668

INSERTS DO BANCO:
SELECT * FROM tb_products
SELECT * FROM tb_categories
SELECT * FROM tb_users

SELECT * FROM tb_products WHERE idcategory = 1

INSERT INTO tb_categories (name, icon)
VALUES ('Jogos', 'bi bi-controller'),
('Consoles', 'bi bi-playstation'),
('Headsets', 'bi bi-headset');

INSERT INTO tb_products (description, name, price, idcategory, link_image, promotion, promotion_value, in_stock, seller)
VALUES
('Um console do balacobaco', 'PS5', 2560, 2, 'https://webfones.vtexassets.com/arquivos/ids/244916/console-ps5-slim-fisico-1tb-c-returnal-ratchet-clank-sony-2.jpg?v=638725500912000000', true, 40, true, 'Sony'),
('Um console do balacobaco só que verde', 'Xbox Series X', 3470, 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYFRrbQ9WDJ6hiIreMaoOfVVLfR6gzKlr5bw&s', true, 50, true, 'Microsoft'),
('BIG N CONSOLE', 'Nintendo Switch', 3200, 2, 'https://a-static.mlcdn.com.br/470x352/nintendo-switch-32gb-hac-001-01-1-controle-joy-con-vermelho-e-azul/magazineluiza/043082000/d38296e874a7d5f3e06ff0d8704bb123.jpg', false, 0, true, 'Nintendo');

INSERT INTO tb_products (description, name, price, idcategory, link_image, promotion, promotion_value, in_stock, seller)
VALUES
('Console para os fãs de velocidade', 'PlayStation 4', 1900, 2, 'https://www.lojafoxgames.com.br/admin/produtos/produto_27_11_2021_1638022090.jpg', true, 30, true, 'Sony'),
('Console de nova geração', 'Xbox Series S', 2199, 2, 'https://cms-assets.xboxservices.com/assets/bf/b0/bfb06f23-4c87-4c58-b4d9-ed25d3a739b9.png?n=389964_Hero-Gallery-0_A1_857x676.png', false, 0, true, 'Microsoft'),
('O clássico da Big N', 'Nintendo Wii U', 1600, 2, 'https://m.media-amazon.com/images/I/51TQPhqO9YL.jpg', false, 0, true, 'Nintendo'),
('O que todo gamer quer', 'PS4 Pro', 2200, 2, 'https://eldorado.hubsell.com.br/media/catalog/product/3/2/3292719_console-2490-1_1.png', true, 20, true, 'Sony'),
('Console que trouxe inovação', 'Nintendo 3DS', 1299, 2, 'https://acdn.mitiendanube.com/stores/004/049/941/products/screenshot_20240718_230058_mercado-libre-92999d782ee95070f217213545365898-640-0.png', false, 0, true, 'Nintendo'),
('Console para quem ama o Xbox', 'Xbox One X', 2900, 2, 'https://eldorado.hubsell.com.br/media/catalog/product/2/9/2952587_console-1588-1_1.png', true, 25, true, 'Microsoft'),
('Console dos sonhos', 'PS Vita', 1200, 2, 'https://m.media-amazon.com/images/I/61SagLizbEL.jpg', false, 0, true, 'Sony');

INSERT INTO tb_products (description, name, price, idcategory, link_image, promotion, promotion_value, in_stock, seller)
VALUES
('Poderia ter sido um jogasso', 'Resident Evil Village', 300, 1, 'https://image.api.playstation.com/vulcan/ap/rnd/202101/0812/FkzwjnJknkrFlozkTdeQBMub.png', true, 25, true, 'Capcom'),
('Esse é louco', 'Super Mario Party Jamboree', 250, 1, 'https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_1240/b_white/f_auto/q_auto/ncom/software/switch/70010000084608/ba0572bf9d840b03bf9958809943fb3c76c3adfd6d8f2704b0f1b766f8aa4027', true, 25, true, 'Nintendo'),
('Obra prima', 'Hollow Knight', 30, 1, 'https://assets.nintendo.com/image/upload/c_fill,w_1200/q_auto:best/f_auto/dpr_2.0/ncom/software/switch/70010000003208/4643fb058642335c523910f3a7910575f56372f612f7c0c9a497aaae978d3e51', true, 10, true, 'Team Cherry');

INSERT INTO tb_products (description, name, price, idcategory, link_image, promotion, promotion_value, in_stock, seller)
VALUES
('Fone lendário', 'Headset Gamer Redragon Zeus X', 299.99, 3, 'https://images.kabum.com.br/produtos/fotos/227818/headset-gamer-redragon-zeus-chroma-mk-ii-rgb-surround-7-1-usb-drivers-53mm-preto-vermelho-h510-rgb_1631555309_gg.jpg', false, 0, true, 'Redragon');

INSERT INTO tb_products (description, name, price, idcategory, link_image, promotion, promotion_value, in_stock, seller)
VALUES
('Da medo e nem é de terror', 'Subnautica', 124.50, 1, 'https://assets.nintendo.com/image/upload/c_fill,w_1200/q_auto:best/f_auto/dpr_2.0/ncom/pt_BR/games/switch/s/subnautica-switch/hero', false, 0, true, 'Unknown Worlds Entertainment');