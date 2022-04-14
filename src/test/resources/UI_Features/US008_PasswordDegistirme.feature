@demo
Feature:Password Degisimi

  Background:
    Given kullanici adrese gider
    And   kullanici girisi yapar
    Then  yeni sayfadan sifre kismini secer

  Scenario Outline:Eski sifre ile
    And simdiki sifre olarak "<currentPassword>"girer
    Then yeni sifre kutusununa "<newPassword>" girer
    And yeni sifreyi tekrar girer "<newPasswordConfirmation>"
    Then yeni sifreyi kaydetmek icin save butonuna basar
    And kullanici "Password changed!" mesajini gorur
    And kullanici oturumu kapatir

    Examples:
    |currentPassword|newPassword|newPasswordConfirmation|
     |abc.1111           |abc.1111      |abc.1111|



  Scenario Outline:
    Then yeni sifre kutusununa "<AdminNewPassword>" girilir
    And  password "<Strength>" seviyesinin degistigi gorulur
    Then cikis yapilir


    Examples:
      | AdminNewPassword      | Strength |
      |aaabbbc                |1         |
      |aaabbbc1               |2         |
      |aaabbbc1.              |3         |
      |aaabbbc.1A             |4         |

