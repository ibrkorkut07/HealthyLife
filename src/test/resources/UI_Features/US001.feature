Feature: US001_Kayıt olmak icin SSN, Firstname ve Lastname bilgileri girililebilmelidir.
@us1
  Scenario Outline:TC_01 Gecerli bir SSN, 3. ve 5. rakamdan sonra "-"  icermeli ve 9 rakamdan olusmalidir
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And SSN kutucuğuna tıklar ardından boş bırakır ve 'Your SSN is required.' uyarı mesajını görüntüler
    Then kullanici SSN kutucuğuna sadece "<rakamlar>" girilebilmeli, "<harf>" ve "<özel karakter>" kabul edilmemeli, 'Your SSN is invalid' uyarı mesajı görüntülenmeli
    And kullanici geçerli SSN için 3. ve 5. rakamdan sonra '-' karakteri eklemeli ve herhangi bir uyarı yazısı alınmamalıdır
    Examples:
      | rakamlar | harf | özel karakter |
      | 1      |a  |-         |
      |12      |ab |*/        |
      |456     |asd|-*/       |
      |8797    |fjkd|-=*-/    |
      |594942  |dasas|*-/-\-  |
      |56465*/ad| sad564/*|+*/--sad234|
@us1
  Scenario: TC_02 SSN boş bırakılmamalıdır
    When kullanici "medunnaUrl" sayfasina gider
    Then sayfada kullanici ikonu altinda yer alan register butonuna tiklar
    And SSN kutucuğuna tıklar ardından boş bırakır ve 'Your SSN is required.' uyarı mesajını görüntüler