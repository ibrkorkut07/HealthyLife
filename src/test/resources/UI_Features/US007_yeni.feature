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

    Examples: test data
      | phone      | appointmentdatetime |
      | 1732561100 | 12-05-2022          |




  Scenario Outline: TC03 Randevuyu Api ile olusturup Dogrular
    Given kullanici randevu icin pathparams ayarlamasini yapar
    And randevu icin expected datalari girer "<firstname>", "<lastname>" "<SSN>" "<email>" "<phone>"  and "<date>"
    Then request gonderir ve response alir
    And api kayitlarini dogrular

    Examples: api test data
      | firstname | lastname | SSN         | email          | phone        | date       |
      | hasan      | demir      | 543-34-4335 | hassan45@gmailcom | 555-123-1234 | 2022-11-12 |

  Scenario: TC04 Db ile randevu dogrular
    Given kullanici bilgileri kullanarak medunna_db baglanti kurar
    And  DB den randavu tablolarini query yapar  "id"
    Then sonra dogrular








