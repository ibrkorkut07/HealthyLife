package stepdefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US_007 {



    List<Object> appointmentDB= new ArrayList<>();

    @Given("kullanici bilgileri kullanarak medunna_db baglanti kurar")
    public void kullaniciBilgileriKullanarakMedunna_dbBaglantiKurar() {
        DBUtils.createConnection();
    }

    @And("DB den randavu tablolarini query yapar  {string}")
    public void dbDenRandavuTablolariniQueryYapar(String date) {
        appointmentDB = getColumnData("select * from appointment",date );
        System.out.println(appointmentDB);
    }


    @Then("randevuyu dogrular")
    public void randevuyu_dogrular() {


    }

    @Then("sonra dogrular")
    public void sonraDogrular() {
        String expectedDate="4682";
        Assert.assertFalse(appointmentDB.contains(expectedDate));
    }




}
