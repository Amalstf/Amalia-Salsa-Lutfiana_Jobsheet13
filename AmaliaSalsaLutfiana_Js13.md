2.1.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif
dilakukan dibanding binary tree biasa?
Pada binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa dikarenakan oleh Binary Search Tree mengatur setiap child node sebelah kiri selalu lebih kecil nilainya dari root node. Sedangkan pada child node sebelah kanan mengatur setiap nilai yang lebih besar daripada root node yang memberikan proses efisiensi pada proses searching.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
kegunaan dari atribut left dan right pada class Node adalah untuk menentukan leftchild dan rightchild dan untuk menyimpan angka di left right selain fungsi dari left dan right sama seperti next dan prev.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
untuk menentukan nilai paling atas dalam class Binary Tree
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
null atau kosong

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa
yang akan terjadi?
Yang terjadi jika tree masih kosong, dan ditambahkan sebuah node baru proses pengisian node ke dalam root baru.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah
ini. Jelaskan secara detil untuk apa baris program tersebut?
jika data baru kurang dari data lama maka di lakukan pengecekan lagi apakah data 
kiri bernilai sama dengan null, jika iya data lama akan maka akan masuk ke dalam data kiri, 
jika tidak maka data kiri di ganti dengan data yang baru saja di masukkan, setelah itu break




13.2.1 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray adalah untuk mendeklarasikan banyaknya nilai array dan IdxLast dalam menentukan nilai terahir saat add


2. Apakah kegunaan dari method populateData()?
kegunaan dari method populateData() adalah untuk melakukan penginputan data agar dapat dikenali oleh indexnya


3. Apakah kegunaan dari method traverseInOrder()?
kegunaan dari method traverseInOrder() adalah untuk mencetak seluruh data yang ada dalam tree mulai dari sebelah kiri


4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
Jika suatu node binary tree disimpan dalam array indeks 2, maka indeks left = 1 dan right = 3


5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4 adalah untuk membatasi index agar hanya menjadi 6
