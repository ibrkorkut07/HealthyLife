Feature: US009 Api Test

  Scenario: Api Hasta bilgisini dogrulama testi

    Given staff gerekli path params ayarlar
    And expected datalari girer
    When request gonderir ve response alir
    And hasta bilgilerini dogrular







