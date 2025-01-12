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
    public void kullanici_login_sayfasini_acar() throws InterruptedException{
        open_link();
    }

    @When("Kullanici kullanici adini girer")
    public void kullaniciKullaniciAdiniGirer()throws InterruptedException {
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
    public void kullaniciOpenCalculatorButonunaTiklar() throws InterruptedException{
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
    public void kullaniciDegeriniGirer() throws InterruptedException {
        click_number1();
        click_number0();
        click_number0();
    }

    @And("Kullanici carpma islemini secer")
    public void kullaniciCarpmaIsleminiSecer() throws InterruptedException {
        click_carp();
    }

    @And("Kullanici 1,05 faiz oranini girer")
    public void kullaniciFaizOraniniGirer() throws InterruptedException {
        click_number1();
        click_ondalik();
        click_number0();
        click_number5();
        click_esittir();

    }

    @Then("Ekranda sonuc 105 olmalidir")
    public void ekrandaSonucOlmalidir() throws InterruptedException {
        chResultCs1();
    }

    @And("Kullanici cikis yapar")
    public void kullaniciCikisYapar() throws InterruptedException {
        click_cikis();
    }
}
