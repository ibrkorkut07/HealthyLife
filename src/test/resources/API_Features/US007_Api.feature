Feature: US007 Api Test

  Scenario Outline: TC03 Randevuyu Api ile olusturup Dogrular
    Given kullanici randevu icin pathparams ayarlamasini yapar
    And randevu icin expected datalari girer "<firstname>", "<lastname>" "<SSN>" "<email>" "<phone>"  and "<date>"
    Then request gonderir ve response alir
    And api kayitlarini dogrular

    Examples: api test data
      | firstname | lastname | SSN         | email          | phone        | date       |
      | hasan      | demir      | 543-34-4335 | hassan45@gmailcom | 555-123-1234 | 2022-11-12 |
