public class b {
    public static void main(String[] args){
       System.out.println("hi"); 
     }
}

----------------------------------------------
public class b { 
 public static void main(String[] args){
  int a=5;
  int b;
   b=5;
  int c=a+b;
  System.out.println("toplam=" + c); //yorum /* çoklu yorum */
  }
}
----------------------------------------------
public class b{
 public static void main(String[] args){
    // int tam sayı 
    // byte 
    // short
    // long (en yüksek)
    // byte --> short --> int --> long
    }
}
------------------------------------------------
public class b{
  public static void main(String[] args){
        // double 64bit ondalıklı sayı
        // float a=2.5f;  32bit
  }
}
-----------------------------------------------
public class b{ 
  public static void main(String[] args){
      // char: karakter göstermek için. 2^16 tane karakter simgeler. 2 byte yer kaplar. unicoode number. 
      // boolean: koşul durumlarında kullanılır. true/false.
       
  }
}
-------------------------------------------------
public class b{
  public static void main(String[] args){
      // String, ilkel olmayan veri tipi.
  }
}
----------------------------------------------------
public class b{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    // scannerın bulunduğu kütüphaneyi ekleme ctrl+shift+I.
    int yas=scanner.nextInt();
    double sayi=scanner.nextDouble();
    String yazi=scanner.nextLine();

    // örn. int istenilen değere string değer girilirse koşul yoluyla çözmek;
        if(scanner.hasNextInt()){
          int yas=scanner.nextInt();
    } else{...}
  }
}
-----------------------------------------------------
public class b{
  public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
    int yas = scanner.nextInt();
    scanner.nextLine(); // dummy kullanılmazsa ikinci değer girişi gerçekleşmez.
    String isim=scanner.nextLine();
      // intten sonra line istenildiği zaman hata verir.
 }
}
---------------------------------------------------------
// Beden kitle indeksi hesaplama.
  public class b{
   public static void main(Sting[] args){ 

     Scanner scanner=new Scanner(System.in);

      System.out.print("Boy girin:");
        double boy = scanner.nextDouble();
      System.out.print("Kilo girin:");
        double kilo = scanner.nextDouble();

       double indeks=(kilo/(boy*boy))

     System.out.print("toplam=" + indeks);
 }
}
-------------------------------------------------------------
// Kilometre basına tutar hesaplama.
public class b{
 public static void main(String[] args){

    Scanner scanner=new Scanner(System.in);

    System.out.print("Kilometre basına kurus bilgisi girin:");
     double kurus=scanner.nextDouble();
    System.out.print("Kilometre bilgisi girin:");
     double km=scanner.nextDouble();

    double tutar=(km*kurus);
    System.out.print("Ödenecek tutar:" + tutar);
 }
}
-----------------------------------------------------------
// Hipotenus hesaplama.
public class b{
 public static void main(String[] args){

    Scanner scanner=new Scanner(System.in);

      int a, b;
    System.out.print("a değeri girin:");
     a=scanner.nextInt();
    System.out.print("b değeri girin:");
     b=scanner.nextInt();

    double hipo=Math.sqrt((a*a)+(b*b));
    System.out.print("Hipotenüs:" + hipo);
 }
}
------------------------------------------------------------
// Mantiksal Operator.
 public class b{
  public static void main(String[] args){
  // && --> AND operatoru en az birisi false ise genel sonuç false.
  // || --> OR operatoru en az birisi bile true ise genel sonuç true.
  // ! --> NOT operatoru
 }
}
-------------------------------------------------------------
// Kullanıcıdan alınan 3 sayıdan en büyüğünü bulma.
 public class b{
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
      
    int a, b, c;
     System.out.print("a değeri girin:");
        a=scanner.nextInt();
     System.out.print("b değeri girin:");
        b=scanner.nextInt();
     System.out.print("c değeri girin:");
        c=scanner.nextInt();

     int maks=-1;

    if(a>=b && a>=c){
           maks=a;
        } 
    else if(b>=a && b>=c){   
        maks=b;
        }
    else {  maks=c; }
   
         System.out.print("En büyük sayı:" +maks);
 }
}
------------------------------------------------------
// Koşullarla beden kitle indeksi hesaplama.
public class b{
   public static void main(Sting[] args){ 

     Scanner scanner=new Scanner(System.in);

      System.out.print("Boy girin:");
        double boy = scanner.nextDouble();
      System.out.print("Kilo girin:");
        double kilo = scanner.nextDouble();

       double indeks=(kilo/(boy*boy));

     if (indeks < 18,5){ 
         System.out.println("Zayıf"); 
                       }
     else if ( 18,5 <= indeks && indeks < 25){ 
         System.out.println("Normal"); 
                       }
     else if (25 <= indeks && indeks < 30){ 
         System.out.println("Fazla kilolu"); 
                               }
     else { 
         System.out.println("Obez"); 
    }
  }
}
-----------------------------------------------------------------
// Basit hesap makinesi.
 public class b{
  public static void main(String[] args){
    int a,b ;
    Scanner scanner = new Scanner(System.in);

    String İslemler="1. Toplama İşlemi\n"
                   +"2. Çıkarma İşlemi\n"
                   +"3. Çarpma İşlemi\n"
                   +"4. Bölme İşlemi\n";
     
   System.out.println("İşlem seçin:");
   String islem = scanner.nextLine();
      
   switch(islem){
    case "1" ;
       System.out.print("Birinci sayı:");
         a=scanner.nextInt();
       System.out.print("İkinci sayı:");
         b=scanner.nextInt();
       System.out.println("Toplam:" +(a+b)); 
        break;
    case "2" ;
       System.out.print("Birinci sayı:");
         a=scanner.nextInt();
       System.out.print("İkinci sayı:");
         b=scanner.nextInt();
       System.out.println("Fark:" +(a-b)); 
        break;
    case "3" ;
       System.out.print("Birinci sayı:");
         a=scanner.nextInt();
       System.out.print("İkinci sayı:");
         b=scanner.nextInt();
       System.out.println("Çarpım:" +(a*b)); 
        break;
    case "4" ;
       System.out.print("Birinci sayı:");
         a=scanner.nextInt();
       System.out.print("İkinci sayı:");
         b=scanner.nextInt();
       System.out.println("Toplam:" +((double)a/b)); 
        break;
    default;
     System.out.println("Geçersiz islem...");
  }
 }
}
------------------------------------------------------------
// Gelismis not hesaplama.
 public class b{
  public static void main(String[] args){

    int vize, vize2, final;
    Scanner scanner=new Scanner(System.in);
      System.out.print("Vize girin:");
        int vize = scanner.nextInt();
      System.out.print("Vize2 girin:");
        int vize2 = scanner.nextInt();
      System.out.print("Final girin:");
        int final=scanner.nextInt();
      System.out.print("Okul ortalamanızı girin:");
        double ortalama=scanner.nextDouble(); 

    double not=(vize*0.30)+(vize2*0.30)+(final*0.40);
    
       if(not>=90){System.out.print("AA");}
       else if(not>=85){System.out.print("BA");}
       else if(not>=80){System.out.print("BB");}
       else if(not>=75){System.out.print("CB");}
       else if(not>=70){System.out.print("CC");}
       else if(not>=65){System.out.print("DC");}
       else if(not>=60){System.out.print("DD");
         if(ortalama < 2.50){System.out.print("Not ortalamanız düşük.Dersi tekrar almalısınız.");
          }
         }
       else if(not>=55){System.out.print("FD");}
       else{System.out.print("FF");}
 } 
}
------------------------------------------------------------------
public class b{ 
 public static void main(String[] args){ 
      // for(baslatma;kosul;arttırma veya azaltma)
      // faktoriyel hesaplama.

   Scanner scanner=new Scanner(System.in);
      System.out.print("Sayi girin:");
       int sayi=scanner.nextInt();

     int fakt=1;

    for( int i = 1 ; i<=sayi ; i++){
           fakt *= i;  }

    System.out.print("Faktoriyel="+fakt);
     
 }
}
---------------------------------------------------------------
public class b{
 public static void main(String[] args){
    // while(koşul)
    // faktoriyel hesaplama.

   Scanner scanner=new Scanner(System.in);
      System.out.print("Sayi girin:");
      int sayi=scanner.nextInt();

     int fakt=1;

     while( sayi > 0 ){

       fakt*=sayi;
       sayi--; 

  }
      System.out.print("Faktoriyel="+fakt);
 }
}
---------------------------------------------------------------
public class b{
  public static void man(String[] args)
    /* do{ 
         }while(koşul); */ // mutlaka bir kere çalışır.

      Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi girin:");
        int sayi=scanner.nextInt();
        int toplam=0;
    
  do{
      toplam+= sayi % 10;
      sayi/=10;
  }while(sayi>0);
     
 }
}
-----------------------------------------------------------------
public class b{
  public static void main(String[] args)
    // break: döngüyü sonlandırır. sadece içinde bulundugu döngüde sonlandırır.
    // continue: break ifadesiyle karsılastıgı zaman geri kalan islemlerini yapmadan döngünün basina döner.

 }
}
-------------------------------------------------------------------
// ATM örneği.
public class b{
  public static void main(String[] args)
    int bakiye = 1000;
    Scanner scanner = new Scanner(System.in);

    String İslemler="1. Bakiye Ogrenme \n"
                   +"2. Para Cekme \n"
                   +"3. Para Yatırma\n"
                   +"Cıkıs için q'ya basın\n";
                   
   while(true){
     System.out.println("İşlem seçin:");
     String islem = scanner.nextLine();

       if(islem.equals("q")){
          System.out.print("Programdan cıkılıyor...");
          break;
       }
       else if(islem.equals("1")){
         System.out.print("Bakiyeniz: "+bakiye);
       }
       else if(islem.equals("2")){
         System.out.print("Cekmek istenilen tutar: ");
         int tutar=scanner.nextInt();
         scanner.nextLine();

          if( bakiye-tutar < 0){
              System.out.print("Yeterli bakiye yok.Bakiyeniz: "+bakiye);
          }
          else{
             bakiye-=tutar;
            System.out.print("yeni bakiyeniz: "+bakiye);
          }
       }
       else if(islem.equals("3")){
         System.out.print("Yatırılmak istenilen tutar: ");
         int tutar=scanner.nextInt();
         scanner.nextLine();
 
         bakiye+=tutar;
         System.out.print("Yeni bakiyeniz: "+bakiye);
       }
       else { System.out.print("Gecersiz islem..."); 
       }
  }
 }
}
------------------------------------------------------------------
// Armstrong sayı bulma.
 import java.util.Scanner;
public class b {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi girin:");
        int sayi=scanner.nextInt();
        int basamak = String.valueOf(sayi).length();
        int toplam=0;
        int gecici=sayi;

        do{
            int deger = gecici % 10;
            gecici /= 10;
            toplam += Math.pow(deger,basamak);

        }while(gecici > 0);

        if(sayi==toplam){
            System.out.print("Armstrong sayisidir.");
        }
        else{System.out.print("Armstrong sayisi degildir.");
        }
    }
}
------------------------------------------------------------
// İç içe for döngüsü ile çarpım tablosu olusturma.
public class b {
    public static void main(String[] args){

     for (int i=1; i<=10; i++) {
         System.out.println("********");
        for(int j=1; j<=10; j++){
            System.out.println(i+"x" +j +"="+(i*j));
        }
     }
    }
}
------------------------------------------------------
// While ile kullanıcı girişi.
import java.sql.SQLOutput;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        String kullaniciAdi = "SGOKTAS";
        String parola = "1234";

        while (true) {
            System.out.println("Kullanıcı adı girin: ");
            String kullanici = scanner.nextLine();
            System.out.println("Parola girin: ");
            String password = scanner.nextLine();

            if (parola.equals(password) && kullaniciAdi.equals(kullanici)) { // İki stringin eşleşme kontrolü
                System.out.println("Giris Basarılı " + kullaniciAdi);
                break;
            } else if (!parola.equals(password) && kullaniciAdi.equals(kullanici)) {
                System.out.println("Sifre/Kullanici Adi hatali...");
                girisHakki -= 1 ;

            } else if (parola.equals(password) && !kullaniciAdi.equals(kullanici)) {
                System.out.println("Sifre/Kullanici Adi hatali...");
                girisHakki -= 1 ;
            } else {
                System.out.println("Sifre ve Kullanici Adi hatali...");
                girisHakki -= 1;
            }
            if (girisHakki==0){
                System.out.println("Giris hakkiniz dolmustur...");
                break;
            }
        }
    }
}
------------------------------------------------------------------
