
@demo
Feature: US0014_medunna

  Background:  US014

    Given kullanici(doktor)"MDNUrl" sayfasina gider
    And kullanici(doktor)giris ikonunu tiklar
    Then kullanici(doktor) Sign in i secer
    And kullanici(doktor)"Username" textbox'a  gecerli bir username girer
    And kullanici(doktor)"Password" textbox'a gecerli bir password girer
    And kullanici(doktor) sign in butonunu tiklar
    Then kullanici(doktor)My Pages menu butonuna tiklar
    And kullanici(Doktor)InPaients secenegini tiklar
    And kullanici(Doktor) "In Patients" sayfasina gelir
    Then kullanici(Doktor) hastanin edit butonuna tiklar

    Scenario: TC 001 kullanici(doktor) hastanin "id, start date, end date,appoinment, patient" bilgilerini goruntuleyebilmeli
      Given kullanici(doktor) Id bilgilerini goruntuler
      Then kullanici(doktor) Start date bilgilerini goruntuler
      And kullanici(doktor) End date bilgilerini goruntuler
      And kullanici(doktor) Description bilgilerini goruntuler
      And kullanici(doktor) Created Date bilgilerini goruntuler
      And kullanici oturumu kapatir

      Scenario: TC 002 kullanici(doktor) hastanin "description, created date, status, room" bilgilerini goruntuleyebilmeli
        Given kullanici(doktor) Appointment bilgilerini goruntuler
        Then kullanici(doktor) Status bilgilerini goruntuler
        And kullanici(doktor) Room bilgilerini goruntuler
        And kullanici(doktor) Patient bilgilerini goruntuler
        And kullanici oturumu kapatir

    Scenario: TC 003 kullanici(doktor) hastanin "id, start date, end date," bilgilerini guncelleyebilmeli
      Given kullanici(doktor) Id bilgilerini gunceller
      Then kullanici(doktor) Start date bilgilerini gunceller
      And kullanici(doktor) End date bilgilerini gunceller



  Scenario: TC 004 kullanici(doktor) hastanin "description, created date, status, room" bilgilerini guncelleyebilmeli
    Given kullanici(doktor) Description bilgilerini gunceller
    Then kullanici(doktor) Created date bilgilerini gunceller
    And kullanici(doktor) Status bilgilerini gunceller
    And kullanici(doktor) Room bilgilerini gunceller
    And kullanici oturumu kapatir



  Scenario: TC 005("Status" doktor tarafindan "UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED" olarak guncelleyebilmeli)
    Given status doktor tarafindan UNAPPROVED olarak gunceller
  And status doktor tarafindan DISCHARGED olarak gunceller
  And  status doktor tarafindan STAYING olarak gunceller
  And status doktor tarafindan CANCELLED olarak gunceller
    And kullanici oturumu kapatir



  Scenario: TC 006 kullanici(doktor) rezerve edilmis odayi guncelleyebilmeli
    Given kullanici(doktor) rezerve edilmiş odayı gunceller


  Scenario: TC 007 kullanici(doktor)hastanin "appoinment, patient" bilgilerini guncelleyebilmeli
   Given kullanici(doktor) Appoinment bilgilerini gunceller
   And kullanici(doktor) Patient bilgilerini gunceller
   And kullanici oturumu kapatir
  And kullanici browseri kapatir
  #  And kullanici "rapor" adresine gider
