Feature: GelirGider Farki Hesaplama

  Scenario: Kullanici gelir ve gider hesaplamasinda pozitif sonuc alir
    Given Kullanici hesap makinesini acar
    When Kullanici "1000" gelir degerini girer
    And Kullanici cikarma islemini secer
    And Kullanici "800" gider degerini girer
    Then Ekranda sonuc "200" olmalidir
    And Kullanici cikis yapar