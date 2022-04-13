Feature: US009 DB Test

  Scenario: DB Staff Hasta bilgisi dogrulama testi

    Given kullanici bilgileri kullanarak medunna_db baglanti kurar
    And query ve column data gonderir
    Then bilgileri dogrular