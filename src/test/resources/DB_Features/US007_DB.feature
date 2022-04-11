Feature: US007 DB Test

  Scenario: TC04 Db ile randevu dogrular
    Given kullanici bilgileri kullanarak medunna_db baglanti kurar
    And  DB den randavu tablolarini query yapar  "id"
    Then sonra dogrular