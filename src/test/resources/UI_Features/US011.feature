Feature: Inpatients



  Scenario: Yeni bir randevu oluşturulabilmeli veya mevcut bir randevu düzenlenebilmeli.

    Given kullanici "medunnaUrl" adresine gider
    And giris icin giris ikonuna tiklar
    And ana sayfa Sign In butonuna tiklar
    And username olarak "hasanPhyUser" girer
    Then password olarak "hasanPhyPassword" girer
    And Sign In butonuna tiklar

