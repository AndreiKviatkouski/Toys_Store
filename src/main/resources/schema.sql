DROP TABLE IF EXISTS toy;

CREATE TABLE toy
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(250) NOT NULL,
    format       VARCHAR(250) NOT NULL,
    status_toy   VARCHAR(250) NOT NULL,
    manufacturer VARCHAR(250) NOT NULL,
    price        VARCHAR(250) NOT NULL,
    description  VARCHAR(250) NOT NULL,
    url          VARCHAR(250) NOT NULL,
    estimation   VARCHAR(250) DEFAULT NULL

);

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    firstname  VARCHAR(250) NOT NULL,
    lastname  VARCHAR(250) NOT NULL,
    password  VARCHAR(250) NOT NULL,
    email     VARCHAR(250) NOT NULL,
    telephone VARCHAR(250) NOT NULL,
    role      VARCHAR(250) NOT NULL


);

INSERT INTO toy (name, format, status_toy, manufacturer, price, description, url)
VALUES ('Mario', 'DOLLS', 'IN_STOCK', 'Denmark', '30', 'Popular Denmark toy',
        'https://i5.walmartimages.com/asr/f69e8b84-5017-43bc-ae17-b55729f0f878_1.b6e6b7ab7277e557918a3bff6be25db5.jpeg'),

       ('Spong Bob', 'DOLLS', 'IN_STOCK', 'USA', '10', 'Popular USA toy',
        'https://www.tokkoro.com/picsup/5417120-spongebob-wallpapers.jpg'),

       ('Mascha', 'SOFT_TOYS', 'IN_STOCK', 'Russia', '20', 'Popular Russian toy',
        'https://s.fishki.net/upload/users/2019/01/01/429388/1e347e602d24a5632c58f615d4f0155c.jpg');




INSERT INTO user (firstName, lastName, password, email, telephone, role)
VALUES ('Admin','Googlevich','Admin1234','admin@mail.ru','+375-29-111-11-11','ADMINISTRATOR'),
 ('Moderator','Yandexovich','Moderator1234','moderator@mail.ru','+375-29-111-11-12','MODERATOR'),
 ('User','Userovski','User1234','user@mail.ru','+375-29-111-11-13','USER');

