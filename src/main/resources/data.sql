INSERT INTO ADDRESS(city, country, number, postal_code, state, street) VALUES('Sao Paulo', 'BR', 240, '03974000', 'SP', 'Rua Enes Silveira de Mello');

INSERT INTO CLIENT(name, address_id) VALUES('robson silva grillo', 1);

INSERT INTO DOCUMENT(number, type) VALUES('34307188388', 'CPF');

INSERT INTO TELEPHONE(number, type) VALUES('11963391273', 'CELULAR');

INSERT INTO CLIENT_DOCUMENTS(client_id, documents_id) VALUES(1,1);

INSERT INTO CLIENT_TELEPHONES(client_id, telephones_id) VALUES(1,1);

INSERT INTO PET(birth_date, breed, color, name, weight, client_id) VALUES(2010-01-01, 'Dachshund', 'Marrom', 'Mayllon', 9, 1);

INSERT INTO PET(birth_date, breed, color, name, weight, client_id) VALUES(2017-01-01, 'Shitzu', 'Branco e Preto', 'Cristal', 4, 1);





