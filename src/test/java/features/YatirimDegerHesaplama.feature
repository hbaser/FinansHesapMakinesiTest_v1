Feature: Yatirim Deger Hesaplama

  Scenario: Kullanici %5 faiz oranıyla yatirim hesaplar
    Given Kullanici hesap makinesini acar
    When Kullanici 100 degerini girer
    And Kullanici carpma islemini secer
    And Kullanici 1,05 faiz oranini girer
    Then Ekranda sonuc 105 olmalidir
    And Kullanici cikis yapar
