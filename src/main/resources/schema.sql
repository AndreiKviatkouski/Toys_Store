create table toyDB
(
    id              long auto_increment,
    name            varchar,
    format          varchar,
    manufacturer       varchar,
    price           varchar,
    statusBook      varchar,
    description     varchar
);

create table userDB
(
    id        long auto_increment,
    login     varchar,
    firstName varchar,
    lastName  varchar,
    birthDate varchar,
    password  varchar,
    email     varchar,
    telephone varchar,
    role      varchar
);

create unique index toyDB_id_uindex
    on toyDB (id);

alter table toyDB
    add constraint toyDB_pk
        primary key (id);


create table reviewDB
(
    id              long auto_increment,
    review            varchar,
    estimation      varchar,
    idUser          long,
    madeDate varchar
);

create unique index reviewDB_id_uindex
    on reviewDB (id);

alter table reviewDB
    add constraint reviewDB_pk
        primary key (id);

create table toyReviewDB
(
    idToy   long,
    idReview long
);

