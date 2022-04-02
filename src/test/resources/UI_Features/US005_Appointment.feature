Feature: Staff Appointment


  Background: Appointment Test
    Given kullanici "medunnaUrl" adresine gider
    Then Make an Appointment Butonuna tiklar



  Scenario Outline: TC001
    And isim olarak "<BosFirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your FirstName is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |BosFirstName|
      | hasan     | fidan    | 323-43-8544 | user@user.com | 333-545-6985 | 24042022|                    |


  Scenario Outline: TC002
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<BosSSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your SSN is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |BosSSN|
      | hasan     | fidan    |323-43-8544  | user@user.com | 333-545-6985 | 24042022|              |


  Scenario Outline: TC003
    And isim olarak "<FirstName>" girer
    And soy isim "<BosLastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your LastName is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |BosLastName|
      | hasan     | fidan    | 323-43-8544 | user@user.com | 333-545-6985 | 24042022|                   |



  Scenario Outline: TC004
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<BosEmail>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your email is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |BosEmail|
      | hasan     | fidan    | 323-43-8544 |user@user.com  | 333-545-6985 | 24042022|                             |


  Scenario Outline: TC005
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | hasan     | fidan    | 323-43-8544 |useruser.com  | 333-545-6985 | 24042022|



  Scenario Outline: TC006
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.




    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | hasan     | fidan    | 323-43-8544 |user@usercom  | 333-545-6985 | 24042022|


  Scenario Outline: TC007
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | hasan     | fidan    | 323-43-8544 |user@user.com  | 333-545-6985 | 24042022|