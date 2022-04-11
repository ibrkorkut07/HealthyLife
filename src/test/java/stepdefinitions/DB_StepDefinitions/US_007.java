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




/*
 List<Object> appointmentDB= new ArrayList<>();

    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        createConnection();
    }
    @Given("user selects all {string} column data")
    public void user_selects_all_coloumn_data(String id) {
        appointmentDB = getColumnData("select * from appointment", id);
        System.out.println(appointmentDB);
    }
    @Given("user verify {string} with the database")
    public void user_verify_with_the_database(String id) {
        assertTrue(appointmentDB.toString().contains(id));
    }
    @Then("close the database connection")
    public void close_the_database_connection() {
        closeConnection();







 */





    List<Object> appointmentDB= new ArrayList<>();

    @Given("kullanici bilgileri kullanarak medunna_db baglanti kurar")
    public void kullaniciBilgileriKullanarakMedunna_dbBaglantiKurar() {
        DBUtils.createConnection();
    }

    @And("DB den randavu tablolarini query yapar  {string}")
    public void dbDenRandavuTablolariniQueryYapar(String date) {
        appointmentDB = getColumnData("select * from patient",date );
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
