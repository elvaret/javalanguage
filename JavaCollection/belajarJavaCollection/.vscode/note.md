--> Java Collection
    Java collection telah menyediakan semuanya yang berhubungan dengan collection, sehingga kita hanya cukup tinggal menggunakannya.
    a). Interfaces, ini adalah contact reprentasi dari collection. Semua collection di Java memiliki kontrak interface, sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri.
    b). Implementation, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuat oleh Java, semua interface collection sudah ada implemntasi classnya di Java collection.
    c). Algorithms, Java juga sudah menyediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan pengurutan data di collection.

1.a)Iterable Interface
    a). Iterable adalah parent untuk semua collection di Java, kecuali Map
    b). Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
    c). Karena semua collection pasti implement iterable, secara otomatis maka semua collection di java mendukung perulangan for-each, jadi bukan cuma array
    
    - Tidak ada magic di java, sebenarnya for-each di   Iterable bisa terjadi karena ada method iterator() yang mengembalikan object iterator.
    - Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection secara sequential
    - For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan iterator object

1.b)Collection Interface 
  a). Selain iterable interface, parent class semua collection di Java adalah collection.
  b). Kalau iterable interface digunakan sebagai kontrak untuk memanipulasi data colecction, seperti manambah, menghapus, dan mengecek isi data collection.
  c). Tidak ada direct implemntation collection, karena collection nanti akan dibagi lagi menjadi list, set, queue




