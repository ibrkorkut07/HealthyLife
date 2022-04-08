Feature:US009 Message



  Background:

    Given Kullanici "medunnaUrl" adresine gider.
    Then insan Figurune tiklar
    And Sig in secenegini secer


  Scenario:TC01 Staff olarak hasta bilgilerini gorme testi

    And Staff olarak username ve password girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patients yazisini ile listenin gorunurlulugunu test eder





    Scenario Outline:TC02:Hasta bilgilerini duzenleme testi

      And Staff olarak username ve password girer
      And Sigin  tiklar
      Then My PAGES sekmesine tiklar
      And Search Patient secenegini secer
      And Patientssn kutusuna "<SSN>" girer
      And  Edit butonuna tiklar
      And Staff hasta bilgilerinde duzenleme yapar
      And Save tiklar
      And Dogrulama gozlemlenir

      Examples:
        | SSN              |
        | 253-98-1249      |



  Scenario Outline:TC03 Staff tüm bilgilerin dolduruldugunu görme testi

    And Staff olarak username ve password girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
     And Search Patient secenegini secer
    And Patientssn kutusuna "<SSN>" girer
    Then Edit butonuna tiklar
    And ilgili hastanin  bilgilerinin dolduruldugunu dogrular
    Examples:
      |  SSN             |
      |  253-98-1248     |

  Scenario Outline:TC04 Staff herhangi bir hasta bilgi silme Testi


    And Staff olarak username ve password girer
    And Sigin  tiklar
    Then My PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patientssn kutusuna "<SSN>" girer
    Then Edit butonuna tiklar
    And firstname siler ve silindigini test eder
    Examples:
      |  SSN             |
      |  253-98-1248     |


  Scenario:TC05:Yukarıdaki tüm seçenekler bir Admin ve Staff tarafından yapılabilir,
 ancak staff hastaları silememeli.

   And Staff olarak username ve password girer
   And Sigin  tiklar
   Then My PAGES sekmesine tiklar
   And Search Patient secenegini secer
   And Patientssn kutusuna "<SSN>" girer
   Then Edit butonuna tiklar
   And staff olarak hastaları silemedigini dogrular




   Scenario: TC06:Staff,hastaları SSN kimliklerine göre arayabilir,ancak Admin arayamaz.

      Given kullanici Admin olarak giris yapar
      And Sigin  tiklar
      Then My PAGES sekmesine tiklar
      And Search Patient secenegini secer
      And Patientssn kutusuna "<SSN>" girer
      And Admin hastalari SSN kimlik numaralarina gore arama yapamadigini dogrular
