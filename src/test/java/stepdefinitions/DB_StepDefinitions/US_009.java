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


     List<Object> tumDbIdBilgiler=new ArrayList<>();




    @Given("Staff bilgileri kullanarak medunna_db baglantisi kurar")
    public void staffBilgileriKullanarakMedunna_dbBaglantisiKurar() {
        DBUtils.createConnection();
    }



    @And("query ve column data gonderir")
    public void queryVeColumnDataGonderir() {
        tumDbIdBilgiler=DBUtils.getColumnData("select * from patient","first_name");
        System.out.println("tumDBssnBilgiler = " + tumDbIdBilgiler);
    }


    @Then("bilgileri dogrular")
    public void bilgileriDogrular() {

        List<String> expectedIds=new ArrayList<>();
        expectedIds.add("Lino");
        expectedIds.add("Robin");
        expectedIds.add("Oren");

       Assert.assertTrue(tumDbIdBilgiler.containsAll(expectedIds));


    }




}
