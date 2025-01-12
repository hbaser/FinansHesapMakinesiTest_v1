package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;
import static pages.OpenCalculatorPage.check_Calculator;
import static pages.OpenCalculatorPage.click_openCalculatorButton;

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
}
