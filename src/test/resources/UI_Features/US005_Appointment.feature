Feature: Staff Appointment


  Scenario Outline: Appointment Test
    Given kullanici "medunnaUrl" adresine gider
    Then Make an Appointment Butonuna tiklar
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.



    Examples:
      | FirstName | LastName | SSN         | Email         | Phone        | AppointmentDate |
      | hasan     | fidan    | 323-43-8544 | user@user.com | 333-545-6985 | 24042022|
