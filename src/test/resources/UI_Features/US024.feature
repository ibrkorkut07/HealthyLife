Feature: US023 Hasta Bilgileri


  Background: US003 Hasta Bilgileri test

  Scenario Outline: TC001 Personel 'Payment Invoice / process' e gidebilir
    Given "medunnaUrl" adresine gider
    And kullanici giris ikonunu tiklar
    Then anaSayfaSignIn ni tiklar
    Given username olarak "<username>" girer
    And password olarak "<password>" girer
    Then Sign In butonuna tiklar
    And MyPages sekmesine tiklar
    Then SearchPatient sekmesine tiklar
    And SearchPatientSSNBox kutusuna hasta numarasi olarak "<SSN>" girer
    Then ShowAppointmentsButton a tiklar
    Then PaymentInvoiceProcessButton a tiklar
    And PAYMENT DETAIL sayfasini gorur
    Then PAYMENT DETAIL sayfasinin ekran goruntusunu alir

    Examples:
      | username    | password |     SSN     |
      | Aysglstaff  | 1234567  | 151-15-1515 |


  Scenario Outline: TC002 Personel 'Appointments' portalinda hasta icin bir fatura olusturmak icin
                    hastanin randevu durumunun COMPLETED veya CANCELED oldugunu gorur

    Given Hasta "https://www.medunna.com" sayfasina gider.
    Then account-menu iconuna tiklar.
    And sign in secenegine tiklar.
    When <username> ve <password> girer.
    And sign in butonuna tiklar.
    Then My Pages sekmesine tiklar.
    Then My Appointments secenegine tiklar
    And Show Invoice kutusuna tiklar
    And Invoice sayfasinda Invoice Text basligini gorur
    Then Invoice sayfasinin ekran goruntusunu alir
    Examples:
      |  username   | password |
      |  hastaayse  |   ayse   |


