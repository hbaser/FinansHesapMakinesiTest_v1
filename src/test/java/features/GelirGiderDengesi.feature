Feature: Gelir ve Gider Dengesi

  Scenario: Kullanıcı gelir ve gider değerlerini esit girer
    Given Kullanici hesap makinesini acar
    When Kullanici 1000 gelir degerini girer
    And Kullanici cikarma islemini secer
    And Kullanici 1000 gelir degerini girer
    Then Ekranda sonuç 0 olmalıdır
    And Kullanici cikis yapar
