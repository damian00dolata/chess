# Chess
Chess project

1. Legenda i skróty klawiszowe

* Dwie drużyny, rozróżnione wielkością litery figur (K/k - king, Q/q - queen, R/r - rook, N/n -
knight, B/b - bishop, P/p - pawn),
* ←↑→↓ - poruszanie się po planszy,
* p - widok rozgrywki,
* l - widok listy obiektów,
* Ctrl - widok wyszukiwania obiektów z podaną nazwą (wychodzimy z niego przez podanie Ctrl na input
i wciśnięcie Enter),
* Shift - odznaczenie figury,
* Enter - wybranie figury, ruch, bicie.

2. Funkcjonalność

Projekt obejmuje funkcjonalności gry w szachy. Plansza jest ”odświeżana” co ułamek sekundy poprzez printowanie
jej w konsoli. Do dyspozycji mamy trzy widoki - rozgrywka, lista obiektów, wyszukiwanie obiektu po
nazwie. Zaimplementowany został Key Listener, w celu ułatwienia poruszania się po planszy. Zczytuje on kod
klawisza aktualnie wciskanego oraz następnie puszczanego. Widok wyświetlania listy obiektów jest ”odświeżany”
co 10 sekund, więc trzeba poczekać na zmianę go na rozgrywkę. Kursor jest koloru niebieskiego, możliwe ruchy
koloru zielonego z literką P, a możliwe bicia koloru czerwonego z literką C.
Przy uzupełnianiu planszy wywoływana jest funkcja tworząca nowy obiekt o różnym podtypie. Przy wyświetlaniu
planszy wyświetlane są wszystkie zapamiętane obiekty z rozróżnieniem na te danego podtypu. Przy
biciu wywoływana jest funkcja usuwająca obiekt, odpowiadający za bitą figurę. Przykładem operacji zawartej
w interfejsie w klasach, które go implementują jest metoda getPossiblePaths(). Przy napotkaniu błędu, np. nie
znalezieniu figury, wyświetlany jest odpowiedni komunikat lub drzewko błędu - założone zostało, że obsługa
wyjątków powinna być ukazana.
Wprojekcie znajdziemy klasę abstrakcyjną Piece, oraz rozszerzające ją podklasy figur (King, Rook, Pawn...).
Figury implementują interfejs IPiece. Przykładem metody statycznej jest metoda move(), a przykładem statycznego
pola jest pole fields. Klasa Piece wykorzystuje numeryczny identyfikator oraz zawiera m. in. nazwę.
Rozszerzanie podklas figur o conajmniej jedno pole było niemożliwe, z powodu posiadania przez wszystkie figury
tych samych cech, narzuconych przez grę w szachy. Klasy zawierają publiczne konstruktory, ustawiające wszystkie
właściwości tworzonego obiektu. Wszystkie pliki znajdują się w pakiecie nazwanym Chess, który zawiera
podpakiety.
W projekcie nie zostały zaimplementowane wszystkie reguły gry szachów, jednak znajdziemy tu np. pierwszy
ruch piona o dwa pola, czy brak możliwości zbicia króla drugim królem.
