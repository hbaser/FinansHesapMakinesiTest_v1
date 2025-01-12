# Finans Hesap Makinesi Test Otomasyonu
Bu proje, finans hesaplama işlemlerini gerçekleştiren modülün otomatik testlerini yürütmek için hazırlanmıştır.

## Gerekli Araçlar ve Kütüphaneler
- Java 11+
- Maven
- Selenium 4
- Cucumber
- Allure Reports

## Kurulum Adımları
1. Proje dosyalarını indirin: git clone <repository-url>
2. Maven ile gerekli kütüphaneleri indirin: mvn clean install

## Testlerin Çalıştırılması
- Tüm test senaryolarını çalıştırmak için: 
```sh
mvn test
```

- Test sonuçlarını Allure raporlarında incelemek için:
  mvn allure:serve
```sh
mvn allure:serve
```
