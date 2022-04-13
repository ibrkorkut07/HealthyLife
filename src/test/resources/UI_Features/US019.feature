Feature: US19 Admin olarak Yeni Staff (Personel) Olusturma Guncelleme Goruntuleme ve Silme


  Background: Admin olarak giris yapar
    Given kullanici "medunnaUrl" adresine gider
    And ana sayfa Sign In butonuna tiklar
    And username olarak "AdminUser" girer
    And password olarak "AdminPassword" girer
    Then Sign In butonuna tiklar



    Scenario: TC01 Admin SSN kullanarak kayitli kullanici arayabilir.
      Given kullanici item-titles menuye tiklar
      And Staff menusune tiklar
      And Listeden herhangibir SSN secer
      And Create a New Staff Butonuna tiklar
      And Use search check box'i isaretler
      And Sectigi kayitli SSN numarasini SSN Box'a girer
      Then Search User butonuna tiklar
      And User found with search SSN mesajini gorur
      And kullanici oturumu kapatir


