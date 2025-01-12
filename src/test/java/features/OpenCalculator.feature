Feature: Hesap Makinesi Acma

  Scenario: Kullanici hesap makinesini acar
    Given Kullanici giris yapar ve ana sayfayi gorur
    When Kullanici open calculator butonuna tiklar
    Then Hesap makinesi ekrani gorunur