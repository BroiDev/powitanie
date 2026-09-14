`setContentView` — ustawia, co ma być wyświetlane na ekranie.
`findViewById` — szuka elementu o podanym identyfikatorze w aktualnym widoku. Odpowiednik getElementById z JavaScriptu?
`R` — generowana automatycznie przez Gradle klasa, która przypisuje wszystkiemu, co znajduje się w folderze `res`, identyfikator. 
`onCreate` — zdarzenie, które jest automatycznie jednokrotnie wywoływane przy starcie aktywności / ekranu.
`super.onCreate` — wywołanie wersji metody `onCreate` z klasy nadrzędnej. Konieczne, by aplikacja mogła wystartować.
`AndroidManifest.xml` — dokument, w którym jest zapisane wszystko, z czego aplikacja będzie chciała korzystać. Są w nim m.in.: ikona aplikacji, nazwa. W trakcie tworzenia aplikacji może być potrzebne również wypisanie, jakich uprawnień aplikacja potrzebuje, by mogła prawidłowo funkcjonować (np. wysyłanie powiadomień).
`@+id/` — klauzula dodawania identyfikatora do widoków. Każdemu widokowi trzeba przypisać id, by móc później odwoływać się do niego w Javie.
`match_parent` — dziedziczenie wartości po rodzicu, czyli elemencie nadrzędnym. Np. można odziedziczyć szerokość i wysokość układu widoku.
`dp` — jednostka: piksel niezależny od gęstości ekranu (ppi/dpi).
`sp` — jednostka: `dp` + skalowanie wg ustawienia rozmiaru czcionki na urządzeniu mobilnym.