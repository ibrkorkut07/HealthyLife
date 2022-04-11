package stepdefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

import static utilities.ReadTxt.getSSNIDs;

public class US_009 {


     List<Object> tumDBssnBilgiler=new ArrayList<>();



    @Given("staff DB gider")
    public void staffDBGider() {

        DBUtils.createConnection();

    }
    @And("Sorguyu {string} ve {string} ile gonderir")
    public void sorguyuVeIleGonderir(String query, String columnName) {
       tumDBssnBilgiler=DBUtils.getColumnData("select * from patients", "id");
        System.out.println(tumDBssnBilgiler);

    }


    @Then("bu bilgileri dogrular")
    public void bu_bilgileri_dogrular() {

      List<String> expectedSSN=new ArrayList<>();
      expectedSSN.add("026-06-1990");
      expectedSSN.add("123-56-9424");
      expectedSSN.add("253-98-1249");

      List<String> actualData= getSSNIDs();
        System.out.println(actualData);
        Assert.assertTrue(actualData.containsAll(expectedSSN));



    }




    @Given("Staff bilgileri kullanarak medunna_db baglantisi kurar")
    public void staffBilgileriKullanarakMedunna_dbBaglantisiKurar() {
        DBUtils.createConnection();
    }

    @And("DB den sorgu gonderir")
    public void dbDenSorguGonderir() {
        tumDBssnBilgiler=DBUtils.getColumnData("select * from patient","id");
        System.out.println("tumDBssnBilgiler = " + tumDBssnBilgiler);
    }
}
