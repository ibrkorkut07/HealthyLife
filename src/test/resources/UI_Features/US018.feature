Feature: US_018 Medunna Admin


  Background:
    Given kullanici(doktor)"MDNUrl" sayfasina gider
    And kullanici(doktor)giris ikonunu tiklar
    Then kullanici(doktor) Sign in i secer
    And kullanici(doktor)"Username1" textbox'a  gecerli bir username girer
    And kullanici(doktor)"Password" textbox'a gecerli bir password girer
    And kullanici(doktor) sign in butonunu tiklar
    And Yonetici Items&Titles secenegini tiklar ve Physician i secer






  Scenario: TC001 Yonetici sistemdeki doktoru ssn bilgisi ile arayabilir, secebilir
    And Yonetici +Create a new Phycician butonuna tiklar
    And Yonetici Create or edit a Physician sayfasina gelir
    And Yonetici Use Search kutusunu tikler
    And Yonetici sistemdeki doktoru bulabilmek icin SSN bilgisi girer
    And Yonetici Search User butonuna basar





    Scenario: TC002 Kisilerin "firstname, lastname birth date .." bilgilerini doldurulabilir





      Scenario: TC003 Yonetici  doktor icin bir uzmanlik alani secebilir




        Scenario: TC004 Yonetici  doktorun profil fotografini saglayabilir



          Scenario: TC005 
