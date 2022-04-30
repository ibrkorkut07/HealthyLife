Feature: US023 Hasta Bilgileri

  Background: US024 Hasta Bilgileri test

    Given "medunnaUrl" adresine gider
    And kullanici giris ikonunu tiklar
    Then SignInDropDownLink ni tiklar
    Then Username olarak "<username>" ve  password olarak "<password>" girip Hasta Sign In butonuna tiklar
    And MyPagesPatient sekmesinde My Appointments linkine tiklar


  Scenario Outline: TC001 Personel 'Payment Invoice / process' e gidebilir

    Then Show Tests ve View Results sekmelerine tiklar
    And Test id, name, default max and min value, test date, description Date ini gorur

    Examples:
      | username    | password |
      | hastaayse   | ayse     |


  Scenario Outline: TC002 Hasta kendi faturasini gorur

    Then Show Invoice sekmesine tiklar
    And Hasta Invoice sayfasini gorur

    Examples:
      |  username   | password |
      |  hastaayse  |   ayse   |