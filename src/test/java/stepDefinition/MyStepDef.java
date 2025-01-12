package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.CalculatorPage.*;
import static pages.LoginPage.*;
import static pages.OpenCalculatorPage.*;

public class MyStepDef {

    @Given("Kullanici login sayfasini acar")
    public void kullanici_login_sayfasini_acar() throws InterruptedException {
        open_link();
    }

    @When("Kullanici kullanici adini girer")
    public void kullaniciKullaniciAdiniGirer() throws InterruptedException {
        enter_username();
    }

    @And("Kullanici sifresini girer")
    public void kullaniciSifresiniGirer() throws InterruptedException {
        enter_password();
    }

    @And("Kullanici giris butonuna tiklar")
    public void kullaniciGirisButonunaTiklar() throws InterruptedException {
        click_login();
    }

    @Given("Kullanici giris yapar ve ana sayfayi gorur")
    public void kullaniciGirisYaparVeAnaSayfayiGorur() throws InterruptedException {
        open_link();
        enter_username();
        enter_password();
        click_login();
    }

    @When("Kullanici open calculator butonuna tiklar")
    public void kullaniciOpenCalculatorButonunaTiklar() throws InterruptedException {
        click_openCalculatorButton();
    }

    @Then("Hesap makinesi ekrani gorunur")
    public void hesapMakinesiEkraniGorunur() throws InterruptedException {
        check_Calculator();

    }

    @Then("Kullanici başarili bir sekilde giris yapar")
    public void kullaniciBasariliBirSekildeGirisYapar() throws InterruptedException {
        check_openCalculatorButton();
    }

    @Given("Kullanici hesap makinesini acar")
    public void kullaniciHesapMakinesiniAcar() throws InterruptedException {
        open_link();
        enter_username();
        enter_password();
        click_login();
        click_openCalculatorButton();
        check_openCalculatorButton();
    }

    @When("Kullanici 100 degerini girer")
    public void kullanici100DegeriniGirer() throws InterruptedException {
        click_number1();
        click_number0();
        click_number0();
    }

    @And("Kullanici carpma islemini secer")
    public void kullaniciCarpmaIsleminiSecer() throws InterruptedException {
        click_carp();
    }

    @And("Kullanici 1,05 faiz oranini girer")
    public void kullanici105FaizOraniniGirer() throws InterruptedException {
        click_number1();
        click_ondalik();
        click_number0();
        click_number5();
        click_esittir();

    }

    @Then("Ekranda sonuc 105 olmalidir")
    public void ekrandaSonuc105Olmalidir() throws InterruptedException {
        chResultCs1();
    }

    @And("Kullanici cikis yapar")
    public void kullaniciCikisYapar() throws InterruptedException {
        click_cikis();
    }

    @When("Kullanici 1000 gelir degerini girer")
    public void kullaniciGelir1000DegeriniGirer() throws InterruptedException {
        click_number1();
        click_number0();
        click_number0();
        click_number0();

    }

    @And("Kullanici cikarma islemini secer")
    public void kullaniciCikarmaIsleminiSecer() throws InterruptedException {
        click_cikar();
    }

    @And("Kullanici 800 gider degerini girer")
    public void kullaniciGider800DegeriniGirer() throws InterruptedException {
        click_number8();
        click_number0();
        click_number0();
        click_esittir();
    }

    @Then("Ekranda sonuc 200 olmalidir")
    public void ekrandaSonuc200Olmalidir() throws InterruptedException {
        chResultCs200();
    }

    @When("Kullanıcı 1000 gelir değerini girer")
    public void kullanici1000GelirDegeriniGirer() throws InterruptedException {
        click_number1();
        click_number0();
        click_number0();
        click_number0();
    }

    @Then("Ekranda sonuç 0 olmalıdır")
    public void ekrandaSonuc0Olmalidir() throws InterruptedException {
        chResultCs0();
    }
}
