Feature: US19 Admin olarak Yeni Staff (Personel) Olusturma Guncelleme Goruntuleme ve Silme


  Background: Admin olarak giris yapar
    Given kullanici "medunnaUrl" adresine gider
    And ana sayfa Sign In butonuna tiklar
    And username olarak "AdminUser" girer
    And password olarak "AdminPassword" girer
    Then Sign In butonuna tiklar
    Given kullanici item-titles menuye tiklar
    And Staff menusune tiklar



    Scenario: TC01 Admin SSN kullanarak kayitli kullaniciyi arayabilir.
      And Listeden herhangibir SSN secer
      And Create a New Staff Butonuna tiklar
      And Use search check box'i isaretler
      And Sectigi kayitli SSN numarasini SSN Box'a girer
      Then Search User butonuna tiklar
      And User found with search SSN mesajini gorur
      And kullanici oturumu kapatir



    Scenario: TC02 Admin kayitli kullanicinin tum bilgilerini doldurabilmeli
      And Staff listesinden rastgele bir tanesinin Edit butonuna tiklar
      And First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country ve State-City kisimlarini doldurur.
      Then save buttonuna tiklar
      And "A Staff is updated with identifier" yazisini gorur
      And Bilgilerin kaydedildigini dogrular
      And kullanici oturumu kapatir



    Scenario: TC03 Admin mevcut kullanicilardan bir kullanici secebilir
      And Staff listesinden rastgele bir tanesinin View butonuna tiklar
      And kullanici bilgilerinin goruntulandigini test eder
      And kullanici oturumu kapatir



    Scenario: TC04 Admin kullanici bilgilerini duzenleyebilir
      Given Staff listesinden rastgele bir tanesinin Edit butonuna tiklar
      Then First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country ve State-City kisimlarini doldurur.
      And save buttonuna tiklar
      And "A Staff is updated with identifier" yazisini gorur
      And kullanici oturumu kapatir



    Scenario: TC05 Admin kullanici bilgilerini silebilir
      Given Staff listesinden rastgele bir tanesinin Edit butonuna tiklar
      Then kullanici bilgilerinden adres ve description bilgilerini siler
      And save buttonuna tiklar
      And Bilgilerin silindigini kontrol eder
      And kullanici oturumu kapatir
      And kullanici browseri kapatir





