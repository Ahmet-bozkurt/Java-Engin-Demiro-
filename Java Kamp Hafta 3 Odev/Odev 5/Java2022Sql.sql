--Select 

--Select company_name adi,contact_name sirketAdi,city sehir from Customers
-- Müşteriler tablosundan seçilen kolonları belirlenen isimler ile listele

-- Select * from Customers where City = 'Berlin'
-- Müşterilerden berlinde olanları listele

--Select * from products where category_id =1 or category_id = 3
-- kategori id si 1 veya 2 olan ürünleri listele


-- Select * from products where category_id=1 and unit_price>=10
-- kategori idsi 1 olan ve fiyatı 10 dan büyük ya da eşit olanları listele

-- Select * from products where category_id=1 order by unit_price desc
-- Kategori id si 1 olan ürünlerin fiyatlarını azalan olarak sırala 

-- Select count(*) from Products
-- Ürünlerin saysını ver

-- Select count(*) from products where category_id=2
-- Ürünlerde kategori id si 2 olanların sayısını ver

--Select category_id from products group by category_id
-- Kategori idlerine göre ürün sayısını ver

-- Select category_id,count(*) from products group by category_id
-- her bit kategori için ayrı ayrı say

-- Select category_id,count(*) from products where unit_price>20 group by category_id having count(*)<10
--Fiyatı 20 den fazla oran ürünleri kategori id ye göre grupla onların da sayısı 10 dan az olanları listele

-- join

-- Select * from products inner join categories
-- ürünler ve kategoriler tablolarını yan yana getir ve (on)
-- on products.category_id = categories.category_id
-- ürün ve kategori tablolarında kategori id si eşit olanları yan yana getir

-- inner join sadece eşleşen tabloları getirir.

-- Select products.product_id, products.product_name, products.unit_price, categories.category_name
-- from products inner join categories
-- on products.category_id = categories.category_id
-- where products.unit_price > 10

-- inner join sadece eşleşen tabloları getirir.
-- Select *  from products inner join order_details
-- on products.product_id = order_details.product_id

-- Sağ tabloda olup solda olmayanları getir demek
-- Select *  from products left join order_details
-- on products.product_id = order_details.product_id

-- hiç ürün almamış müşteriler kampanyaya uygun müşteriler

-- Select * from customers left join orders
-- on customers.customer_id = orders.customer_id
-- where orders.customer_id is null

-- Select * from customers right join orders
-- on customers.customer_id = orders.customer_id

-- Select * from products inner join order_details
-- on products.product_id = order_details.product_id
-- inner join orders
-- on orders.order_id = order_details.order_id










