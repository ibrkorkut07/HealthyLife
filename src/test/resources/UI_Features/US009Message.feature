Feature:US009 Message



  Background:Staff hasta bilgisi görme Testi

    Given Kullanici "medunnaUrl" adresine gider.
    Then insan Figurune tiklar
    And Sig in secenegini secer


  Scenario Outline:

    And Username olarak "<StaffValidUsername>" girer
    And Password olarak "<StaffValidPassword>" girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patients yazisini görür


      Examples:
        | StaffValidUsername | StaffValidPassword |
         |filizgl             |filiz31.           |


    Scenario Outline:Hasta bilgilerini duzenleme testi

      And Username olarak "<StaffValidUsername>" girer
      And Password olarak "<StaffValidPassword>" girer
      And Sigin  tiklar
      Then My PAGES sekmesine tiklar
      And Search Patient secenegini secer
      And "PatientSSN" girer
      Then Edit butonuna tiklar
      And Create or edit a Patient formunu görür
      And id degistirir
      And firstname degistirir
      And lastname degistirir
      And Birthdate degistirir
      And Email degistirir
      And phone degistirir
      And gender degistirir
      And blood group degistirir
      And address degistirir
      And description degistirir
      And user degistirir
      And country degistirir
      And state/city degistirir
      And save tiklar
      And "A Patient is updated with identifier {patientid}"yazisini görür




      Examples:
        | StaffValidUsername | StaffValidPassword | PatientSSN | id |firstname|lastname|BirthDate| email |phone |
        |filizgl  |filiz31. | 365-34-2321 |2406| martin  |lutz    |30.04.2000|dlg@gmail.com |1234567890|




Scenario Outline: Staff tüm bilgilerin dolduruldugunu görme testi
    And Username olarak "<StaffValidUsername>" girer
    And Password olarak "<StaffValidPassword>" girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
     And Search Patient secenegini secer
    And PatientSSN girer
     Then SSN ile giris yapar
     And Create or edit a Patient formunu görür
      And Formdaki kayitlarin dolduruldugunu görür

  Examples:
    | StaffValidUsername | StaffValidPassword |  PatientSSN |
    |filizgl             |filiz31.           |   365-34-2321 |


  Scenario Outline: Staff herhangi bir hasta bilgi silme Testi



  And Username olarak "StaffValidUsername" girer
  And Username olarak "StaffValidPassword" girer
  And Sigin  tiklar
  And  My PAGES butonuna tiklar
    And "PatientSSN" girer
    Then Edit butonuna tiklar
    And Create or edit a Patient formunu görür
    And id siler
    And firstname siler
    And lastname siler
    And Birthdate siler
    And Email siler
    And phone siler
    And gender degistirir
    And blood group degistirir
    And address degistirir
    And description degistirir
    And user degistirir
    And country degistirir
    And state/city degistirir
    Then save tiklar
    And Silme isleminden sonra "This filed is required." yazisini görür



    Examples:
      | StaffValidUsername | StaffValidPassword |
      |filizgl             |filiz31.           |
