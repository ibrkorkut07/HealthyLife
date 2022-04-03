Feature: US0011_medunna



Background: US011

    Given kullanici(doktor)"MDNUrl" sayfasına gider
        And kullanici(doktor)giris ikonunu tiklar
        Then kullanici(doktor) Sign in i secer
        And kullanici(doktor)"Username" textbox'a  geçerli bir username girer
        And kullanici(doktor)"Password" textbox'a geçerli bir password girer
        And kullanici(doktor) sign in butonunu tiklar
        Then kullanici(doktor)My Pages menu butonuna tıklar
        And kullanici(doktor)My Appoinment secenegini seçer
        Then kullanici(doktor)Edit butonunu tiklar




    Scenario: TC01 (Kullanıcı(Doktor)  Yeni bir randevu oluşturulabilmeli veya mevcut bir randevu düzenlenebilmeli)
        Given kullanici(doktor) "Create or Edit an Appointment" sayfasına gider



    Scenario: TC02 ("Bir randevu güncellendiğinde; kullanıcı (doktor), hastanın aşağıdaki bilgilerini görmelidir.
    ""id, start and end date, Status, physician and patient""")

        Given Kullanıcı(Doktor)hastanın id bilgilerini görür
        And  Kullanıcı(Doktor)hastanın start and end date bilgilerini görür
        And Kullanıcı(Doktor)hastanın Status bilgilerini görür
        And Kullanıcı(Doktor)hastanın physician and patient bilgilerini görür


    Scenario: TC05 ("Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmeli)

        Given Kullanıcı(Doktor) Status dropdown elementini PENDING, COMPLETED veya CANCELLED seklinde secer
















