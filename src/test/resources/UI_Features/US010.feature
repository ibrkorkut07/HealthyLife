@deneme
Feature: US010

  Scenario Outline: TC 01 Kullanici, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden gorebilmelidir.

    Given kullanici "medunnaUrl" adresine gider
    And giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar
    And kullanici(doktor)"Username" textbox'a  gecerli bir username girer
    And kullanici(doktor)"Password" textbox'a gecerli bir password girer
    And kullanici(doktor) sign in butonunu tiklar
    Then kullanici(doktor)My Pages menu butonuna tiklar
    And kullanici(doktor)My Appoinment secenegini seçer
    Then "<fromDate>" und "<toDate>" tarihlerini secer
    And randevu listesini görür
    And kullanici oturumu kapatir

    Examples:
      |  fromDate   | toDate     |
      |  01.04.2022 | 15.04.2022 |


    Scenario: TC 02 Kullanici "patient id, start date, end date, status" bilgilerini gorebilir
      Given kullanici "medunnaUrl" adresine gider
      And giris icin giris ikonuna tiklar
      And ana sayfa Sign In butonuna tiklar
      And kullanici(doktor)"Username" textbox'a  gecerli bir username girer
      And kullanici(doktor)"Password" textbox'a gecerli bir password girer
      And kullanici(doktor) sign in butonunu tiklar
      Then kullanici(doktor)My Pages menu butonuna tiklar
      And My inpatient butonunu tiklar
      Then hasta id kismi gorunur




      Scenario:  TC03 API ile doktor randevularini dogrulayin
        Given kullanici doktor randevu icin pathparams ayarlamasini yapar
        Then  doctor randevulari icin request gonderir ve response alir
        And doctor randevu icin expected datalari girer
        And doctor randevulari icin api kayitlarini dogrular
