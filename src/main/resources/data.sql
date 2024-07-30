delete from Ingredient_Ref;
delete from Taco;
delete from Taco_Order;
delete from Ingredient;

insert into Ingredient ( id,name,type) values ('FLTO','Flower Tortilla', 'WRAP');
insert into Ingredient ( id,name,type) values ('COTO','Corn Tortilla', 'WRAP');
insert into Ingredient ( id,name,type) values ('GRBF','Ground Beef', 'PROTEIN');
insert into Ingredient ( id,name,type) values ('CARN','Carnites', 'PROTEIN');
insert into Ingredient ( id,name,type) values ('TMTO','Diced Tomatoes', 'VEGETABLE');
insert into Ingredient ( id,name,type) values ('NMTO','Diced Corolla', 'VEGETABLE');
insert into Ingredient ( id,name,type) values ('LTCE', 'Goat Milk', 'CHEESE');
insert into Ingredient ( id,name,type) values ('LDCE', 'Cow Milk', 'CHEESE');
insert into Ingredient ( id,name,type) values ('FrTt','Sour Cream', 'SAUCE');
insert into Ingredient ( id,name,type) values ('FrTL','Heavy Sour Cream', 'SAUCE');