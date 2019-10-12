/*
# superuserでログイン
>psql -U postgres
*/

-- データベースの作成
create database testdb;

-- 作成したデータベースに接続
\c testdb

-- テーブル作成
create table person (
    id serial primary key,
    name varchar(20),
    age int);

-- 初期データ投入
insert into person values 
    (1,'alice',16),
    (2,'bob',32),
    (3,'cody',23);

