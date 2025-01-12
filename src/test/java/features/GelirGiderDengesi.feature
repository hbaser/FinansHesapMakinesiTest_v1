Feature: Gelir ve Gider Dengesi

  Scenario: Kullanıcı gelir ve gider değerlerini eşit girer
    Given Kullanıcı hesap makinesini açar
    When Kullanıcı "1000" gelir değerini girer
    And Kullanıcı çıkarma işlemini seçer
    And Kullanıcı "1000" gider değerini girer
    Then Ekranda sonuç "0" olmalıdır