Feature: US007


  Scenario Outline: TC01 Kullanici gecerli tarih girmelidir. (guncel tarihi veya gelecekteki tarihleri secebilmelidir)
    Given kullanici "medunnaUrl" adresine gider
    And giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar
    And username olarak "gaziUsername" girer
    And password olarak "gaziPassword" girer
    Then Sign In butonuna tiklar
    And makeAppointmentButton a tiklar
    And kulanici tel  "<phone>" girer
    And kullanici  "<appointmentdatetime>" eski tarihi girer
    Then kullanici Appointment date can not be past date! yazisini gorur
    And kullanici oturumu kapatir

    Examples:
      | phone      | appointmentdatetime |
      | 1732561100 | 12-01-2021          |




  Scenario Outline: TC02 Tarih sirasi gun/ay/yil (ay/gun/yil) seklinde randevu olusturmalidir
    Given kullanici "medunnaUrl" adresine gider
    And giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar
    And username olarak "gaziUsername" girer
    And password olarak "gaziPassword" girer
    Then Sign In butonuna tiklar
    And makeAppointmentButton a tiklar
    And kulanici tel  "<phone>" girer
    And kullanici  "<appointmentdatetime>" tarihi girer
    Then sendAnAppointmentRequestButton a tiklar
    And randevunun basari ile kaydedildigini gorur
    And kullanici browseri kapatir

    Examples: test data
      | phone      | appointmentdatetime |
      | 1732561100 | 12-05-2022          |


