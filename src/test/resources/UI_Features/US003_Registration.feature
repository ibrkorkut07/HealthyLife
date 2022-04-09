Feature: US003 Registration password


  Background: US003 Registration new password test

    Given "medunnaUrl" adresine gider
    And kullanici giris ikonunu tiklar
    Then RegisterLinki ni tiklar

  Scenario Outline: TC001 (Guclu bir parola icin sifre en az 7 karakterden olusmalidir)
    When Hepsi kucuk, buyuk, rakam veya ozel olan ayni gruptan en az <arg0> karakterli bir sifreyi New password Box'a girer
    And <arg01> passwordstregnth seviyesinin degismedigini ve color<arg1> seviyesinde kaldigini gorur.

    Examples:
      | arg0 | arg01                | arg1 |
      | 7    | "Password strength:" | 1    |


  Scenario Outline: TC002 (Daha guclu bir sifre icin en az 1 kucuk harf olmali ve
  "Password strength:" seviyesinin degistigi gorulebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> kucuk harf kullanarak <arg2> karakterli bir sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: TC003 (Daha guclu sifre icin en az 1 buyuk harf olmali ve
  "Password strength:" seviyesinin degistigi gorulebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> buyuk harf kullanarak <arg2> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: TC004 (Daha guclu sifre icin  en az 1 rakam olmali ve
  "Password strength:" seviyesinin degistigi gorulebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> rakam harf kullanarak <arg2> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: TC005 (Daha guclu sifre icin en az 1 ozel karakter olmali
  ve "Password strength:" seviyesinin degistigi gorulebilmelidir)
    Given Kullanici en az <arg0> en fazla <arg1> ozel karakter kullanarak <arg2> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin degistigini gorur.

    Examples:
      | arg0 | arg1 | arg2 | arg01                |
      | 1    | 6    | 7    | "Password strength:" |

  Scenario Outline: Extra1 (Daha guclu sifre icin 2 farkli gruptan (kucuk harf, buyuk harf, rakam veya ozel sembol)
  karakter kullanildiginda "Password strength:" seviyesinin color2 oldugu gorulebilmelidir)
    Given Kullanici <arg0> farkli gruptan karakter kullanarak <arg1> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin color<arg11> seviyesine degistigini gorur.

    Examples:
      | arg0 | arg1 | arg01                | arg11 |
      | 2    | 7    | "Password strength:" | 2     |

  Scenario Outline: Extra2 (Daha guclu sifre icin 3 farkli gruptan (kucuk harf, buyuk harf, rakam veya ozel sembol)
  karakter kullanildiginda "Password strength:" seviyesinin color4 oldugu gorulebilmelidir)
    Given Kullanici <arg0> farkli gruptan karakterler kullanarak <arg1> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin color<arg11> ve color<arg2> seviyesine degistigini gorur.

    Examples:
      | arg0 | arg1 | arg01                | arg11 | arg2 |
      | 3    | 7    | "Password strength:" | 3     | 4    |

  Scenario Outline: Extra3 (Daha guclu sifre icin 4 farkli gruptan (kucuk harf, buyuk harf, rakam veya ozel sembol)
  karakter kullanildiginda "Password strength:" seviyesinin color5 oldugu gorulebilmelidir)
    Given Kullanici <arg0> farkli gruptan da karakterler kullanarak <arg1> karakterli sifre girer
    And <arg01> passwordstregnth seviyesinin de color<arg11> seviyesine degistigini gorur.

    Examples:
      | arg0 | arg1 | arg01                | arg11 |
      | 4    | 7    | "Password strength:" | 5     |
