Feature: US0011_medunna



    @us11
    Scenario: TC01_Kullanıcı (Doktor)"Create or Edit an Appointment" sayfasına gelir
    Given kullanici(doktor)"MDNUrl" sayfasına gider
    And kullanici(doktor)giris ikonunu tiklar
    Then kullanici(doktor) Sign in i secer
    And kullanici(doktor)"Username" textbox'a  geçerli bir username girer
    And kullanici(doktor)"Password" textbox'a geçerli bir password girer
    Then kullanici(doktor)My Pages menu butonuna tıklar
    And kullanici(doktor)My Appoinment secenegini seçer
    Then kullanici(doktor)Edit butonunu tıklar
    And kullanici(doktor)Create or Edit an Appointment sayfasına gider

