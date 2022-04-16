Feature: Admin_tarafindan_hasta_olusturma_ve_duzenleme
  Background: Yonetici_giris
    When Yonetici url gider
    And Sign in ikonuna tiklar
    And Yonetici username ve password bilgileri girer
    And Sign in buttonuna tiklar
    And Items&Titles sekmesini tiklar

  Scenario: TC001_Yeni_Hastalar_sadece_yonetici_tarafindan_olusturulabilmeli

Then Patient secenegini secer ve tiklar
And Create a new Patient buttonuna tiklar
And First Name buttonunu tiklar ve bilgileri girer
And Last Name buttonunu tiklar ve bilgileri girer
And Birth Date buttonuna tiklar ve bilgileri girer
When Email buttonuna tiklar ve bilgileri girer
And Phone buttonuna tiklar ve bilgileri girer
And Gender sekmesini tiklar ve FEMALE secer
And Bloud Group sekmesini tiklar ve kan grubunu secer
And Description buttonuna tiklar ve hasta tanimini yazar
Then User sekmesini tiklar ve system secenegini secer
And Country sekmesini tiklar ve US secenegini secer
And State City sekmesini tiklar ve Alaska secenegini secer
And Save buttonuna tiklar ve hastayi kayit eder
And A new Patient is created alert yazisini dogrular
And Log in ikonuna tiklar
Then Sign out sekmesini tiklar