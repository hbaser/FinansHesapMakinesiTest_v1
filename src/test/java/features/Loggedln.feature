Feature:  Kullanici Girisi

  Scenario: Gecerli kullanici bilgileri ile giris yapma
    Given Kullanici login sayfasini acar
    When Kullanici kullanici adini girer
    And Kullanici sifresini girer
    And Kullanici giris butonuna tiklar
    Then Kullanici başarili bir sekilde giris yapar
