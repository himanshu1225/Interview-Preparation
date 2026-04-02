@Transaction:

![alt text](image.png)

Transaction:
Person A  transfers money to Person B
    -> A debit
    -> B credit
these 2 operations is succesful then it is complete transaction.

Let say you build money transfer app is there, what problems it can face: 

1. Debit happened and application me kuch issue aa gya and credit nahi ho paya ---> Data inconsistency issue.

![alt text](image-1.png)
    -> Person A 500 -> 400  debit
    -> Person B 500 -> 500 no credit

We should roll back it.

This is the logic @Transactional annotation is build to maintain the complete transaction.

Transactions at SQL Level (ACID):
-> Sql uses transactions by following ACID properties.

A -> ATOMICITY
C -> CONSISTENCY
I -> ISOLATION
D -> DURABILITY



Using atomicity and consistency we will see what transactions really are.

Atomicity: In a transaction let say there are 100 tasks, 99 got success and 100th got error then all the operations inside that transaction will be rollbacked.
![alt text](image-2.png)    ![alt text](image-3.png)

It is basically either all or none.

NOTE: Acid properties transactions ke level pe properties hai na ki query ke level pe.

Consistency: This means till all the 100 operations are not successfull, we will not commit it.

![alt text](image-4.png)

Commit in a transaction means saving all the changes made during the transaction in the database.

Difference: Here i am not talking about any exception occur scenario, here what i mean let say 1st operation hua and commit kiya and let say kuch time baad 100th operation hua and then wo commit hua, isme problem kya hai there is time difference between 1st and 100th operation and i do not want data inconsistent for any amount of time.

![alt text](image-5.png)

So ek transaction me 100 operations hai then first it should perform 100 operations then only i will commit.
ex: Debit operation and credit operation complete ho then only it should commit in database, that is what consistency is.

![alt text](image-6.png)

SQL IMPLICIT AND EXPLICIT TRANSACTIONS:

IMPLICIT: 
    -> In sql every query we run is wrapped inside a transaction.
    -> one trasaction can have multiple queries.

if we run this single update query

![alt text](image-7.png)

Behind the scenes it is wrapped inside a transaction: 

![alt text](image-8.png)
-> agar iss query me kuch bhi issue hota let say id1 ka update hota and id2 me kuch issue ata tho rollback ho jata, commit nahi hota.
-> isse Atomicity and Consistency maintain rehti.

EXPLICIT:

let take debit credit example: 

![alt text](image-9.png)

Now these are 2 query and will be separate transactions all together.
-> isme kya issue hai, pehli update hui and second nahi fail hoti tho debit hogya but credit nahi hua. (data inconsistency).

So we need to wrap both these queries into a transaction:
![alt text](image-10.png)

-> jab tk commit nahi kr deta, data change nahi hoga kisi se bhi.

Let see this ideology in spring boot app:

Without Trasaction annotaion:

![alt text](image-11.png)

Controller: ![alt text](image-12.png)

Wallet Service: ![alt text](image-13.png)

User Service: ![alt text](image-14.png)

User repository: ![alt text](image-15.png)

User entity: ![alt text](image-16.png)

Transaction Manager Config: This is not mandatory, iske bina bhi hum transation use kr sakte hai , this is just for logging doing.

![alt text](image-18.png)

![alt text](image-19.png)

![alt text](image-20.png)


Request: ![alt text](image-17.png)

This is happy case and it is successfull.

4 transactions start hui and commit hui.

![alt text](image-21.png)

![alt text](image-22.png)

Debit 
1. findById ki transaction start and commit 
2. save ki transaction start and commit.

Same for credit as well.

Fail Case: as 3 id is not present

![alt text](image-23.png)

Ab transaction fail hoga but, debit ho jayega and credit nahi hoga -> data consistency hui.
Ideally fail hone pe kuch nahi krna chaiye tha isse.

Iss baar 3 hi transactions start hui:

![alt text](image-24.png)

-> 3rd transaction findById mila nahi cand exception aa gya and throw kr diya, code save tk gya hi nahi.
-> Rollback kyu nahi hua because ye sab separate transactions me chl rha hai.

-> we want sab ek hi transaction me chale i.e. all 4 queries should run in 1 transaction.


With Transaction Annotation:

![alt text](image-25.png)
-> ab isme jitne bhi query run hogi wo sab ek hi transaction me chalegi.

if i hit request with 1 and 3 it failed in postman, but in db data is not consistent.

-> Only 1 transaction start hui and wo roll back ho gyi.

![alt text](image-26.png)




