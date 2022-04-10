Feature: US009 Api Test

  @staffApi
  Scenario: Hasta bilgisini dogrulama testi

    Given staff gerekli path params ayarlar
    And expected datalari girer
    When request gonderir ve response alir
    And hasta bilgilerini dogrular






