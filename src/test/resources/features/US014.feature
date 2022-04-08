
@US14
Feature: US0014_medunna

  Background:  US014

    Given kullanici(doktor)"MDNUrl" sayfasına gider
    And kullanici(doktor)giris ikonunu tiklar
    Then kullanici(doktor) Sign in i secer
    And kullanici(doktor)"Username" textbox'a  geçerli bir username girer
    And kullanici(doktor)"Password" textbox'a geçerli bir password girer
    And kullanici(doktor) sign in butonunu tiklar
    Then kullanici(doktor)My Pages menu butonuna tıklar
    And kullanici(Doktor)InPaients secenegini tiklar
    And kullanici(Doktor) "In Patients" sayfasına gelir
    Then kullanici(Doktor) hastanin edit butonuna tiklar

    Scenario: TC 001 kullanici(doktor) hastanin "id, start date, end date,appoinment, patient" bilgilerini goruntuleyebilmeli
      Given kullanici(doktor) "id" bilgilerini goruntuler
      Then kullanici(doktor) "start date" bilgilerini goruntuler
      And kullanici(doktor) "end date" bilgilerini goruntuler
      And kullanici(doktor) "appoinment" bilgilerini goruntuler
      And kullanici(doktor) "patient" bilgilerini goruntuler
      And kullanici oturumu kapatir

      Scenario: TC 002 kullanici(doktor) hastanin "description, created date, status, room" bilgilerini goruntuleyebilmeli
        Given kullanici(doktor) "description" bilgilerini goruntuler
        Then kullanici(doktor) "created date" bilgilerini goruntuler
        And kullanici(doktor) "status" bilgilerini goruntuler
        And kullanici(doktor) "room" bilgilerini goruntuler
        And kullanici oturumu kapatir

    Scenario: TC 003 kullanici(doktor) hastanin "id, start date, end date,appoinment, patient" bilgilerini guncelleyebilmeli
      Given kullanici(doktor) "id" bilgilerini gunceller
      Then kullanici(doktor) "start date" bilgilerini gunceller
      And kullanici(doktor) "end date" bilgilerini gunceller
      And kullanici(doktor) "appoinment" bilgilerini gunceller
      And kullanici(doktor) "patient" bilgilerini gunceller
      And kullanici oturumu kapatir

  Scenario: TC 004 kullanici(doktor) hastanin "description, created date, status, room" bilgilerini guncelleyebilmeli
    Given kullanici(doktor) "description" bilgilerini gunceller
    Then kullanici(doktor) "created date" bilgilerini gunceller
    And kullanici(doktor) "status" bilgilerini gunceller
    And kullanici(doktor) "room" bilgilerini gunceller
    And kullanici oturumu kapatir



  Scenario: TC 005("Status" doktor tarafından "UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED" olarak guncelleyebilmeli)
    Given status doktor tarafından "UNAPPROVED" olarak gunceller
  And status doktor tarafından "DISCHARGED" olarak gunceller
  And  status doktor tarafından "STAYING" olarak gunceller
  And status doktor tarafından "CANCELLED" olarak gunceller
    And kullanici oturumu kapatir



  Scenario: TC 006 kullanici(doktor) rezerve edilmiş odayı guncelleyebilmeli
    Given kullanici(doktor) rezerve edilmiş odayı gunceller



