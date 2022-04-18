Feature: US023 Hasta Bilgileri

  Background: US023 Hasta Bilgileri test
    Given "medunnaUrl" adresine gider
    And kullanici giris ikonunu tiklar
    Then SignInDropDownLink ni tiklar
    Given username "<username>" girer
    And password "<password>" girer
    Then SigninEnterTusu butonuna tiklar
    And MyPages sekmesine tiklar
    Then SearchPatient sekmesine tiklar
    And SearchPatientSSNBox kutusuna hasta numarasi olarak "<SSN>" girer
    Then ShowAppointmentsButton a tiklar

  Scenario Outline: TC001 Personel 'Payment Invoice / process' e gidebilir

    Then PaymentInvoiceProcessButton a tiklar
    And PAYMENT DETAIL sayfasini gorur
#    Then PAYMENT DETAIL sayfasinin ekran goruntusunu alir

    Examples:
      | username    | password |     SSN     |
      | Aysglstaff  | 1234567  | 151-15-1515 |


  Scenario Outline: TC002 Personel 'Appointments' portalinda hasta icin bir fatura olusturmak icin
                    hastanin randevu durumunun COMPLETED veya CANCELED oldugunu gorur

    And Personel Hasta adina fatura olusturmak icin RandevuDurumu nun COMPLETED veya CANCELED oldugunu gorur

    Examples:
      | username    | password |     SSN     |
      | Aysglstaff  | 1234567  | 151-15-1515 |

  Scenario Outline: TC003 Personel hastanin "PAYMENT DETAIL" sayfasininda test item ve exam fee lerini
                    gorebilir
    Then PaymentInvoiceProcessButton a tiklar
    And Exam Fee yi gorur
    Then TestItem Fee yi gorur

    Examples:
      | username    | password |     SSN     |
      | Aysglstaff  | 1234567  | 151-15-1515 |

  Scenario Outline: TC004 Personel randevu durumu COMPLETED olan hasta icin yeni bir fatura olusturabilir
   And Hastanin randevu durumunun COMPLETED olup olmadigini kontrol eder
   Then Eger COMPLETED ise PaymentInvoiceProcessButton a tiklar
   And Create Invoice butonuna tiklar
   Then Create or edit a Bill formunu doldurur ve save butonuna tiklar
   Then A Bill is updated with identifier yazili uyariyi gorur

    Examples:
      | username    | password |     SSN     |
      | Aysglstaff  | 1234567  | 151-15-1515 |


  Scenario Outline: TC005 Personel hastaya gonderilen faturayi gorebilir

    Then PaymentInvoiceProcessButton a tiklar
    And ShowInvoiceButton a tiklar
    Then InvoicePageTitleText in altinda INVOICE u gorur

    Examples:
      | username    | password |     SSN     |
      | Aysglstaff  | 1234567  | 151-15-1515 |