Feature:


  Scenario: db Staff Hasta bilgisi dogrulama testi
    Given Staff bilgileri kullanarak medunna_db baglantisi kurar
    And DB den sorgu gonderir
    Then bu bilgileri dogrular


