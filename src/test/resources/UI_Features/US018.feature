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
    Given Yonetici listeden rastgele SSN secer
    And Yonetici +Create a new Phycician butonuna tiklar
    And Yonetici Create or edit a Physician sayfasina gelir
    And Yonetici Use Search kutusunu tikler
    And Yonetici sistemdeki doktoru bulabilmek icin SSN bilgisi girer
    And Yonetici Search User butonuna basar
    And "User found with search SSN" yazisini gorur
    And kullanici oturumu kapatir




    Scenario: TC002 Kisilerin "firstname, lastname birth date .." bilgileri doldurulabilir
      Given Doktor listesinden rastgele bir doktor secip edit butonuna basar
      And Admin First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country ve State-City kisimlarini doldurur.
      Then save buttonuna tiklar
      And "A Physician is updated with identifier" yazisini gorur
      And Admin Bilgilerin kaydedildigini dogrular
      And kullanici oturumu kapatir




    Scenario: TC003 Yonetici  doktor icin bir uzmanlik alani secebilir
      Given Doktor listesinden rastgele bir doktor secip edit butonuna basar
      And Admin Doktorun uzmanlik alanini secer
      And save buttonuna tiklar





        Scenario: TC004 Yonetici  doktorun profil fotografini saglayabilir
          Given Doktor listesinden rastgele bir doktor secip edit butonuna basar
          And Admin doktorun profil fotografini degistirebilir





          Scenario: TC005 Admin mevcut kullanİcilar arasindan doktoru secmelidir.





          Scenario: TC006 Admin, doktorun Muayene ucretini girebilmelidir. (Exam fee)
            Given Doktor listesinden rastgele bir doktor secip edit butonuna basar
            And Admin doktorun muayene ucretini girer
            And save buttonuna tiklar





           Scenario: TC007 Admin, butun doctorlarin bilgilerini gorebilmelidir






          Scenario: TC008 Admin, doktorlarin bilgilerini duzenleyebilir





          Scenario: TC009 Admin, mevcut doktarlari silebilir



