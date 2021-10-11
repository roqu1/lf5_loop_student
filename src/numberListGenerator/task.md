# Zahlengenerator *

Die Klasse `Generator` bietet zwei Methoden an, um einen String mit einer Zahlenfolge zu generieren. Die Zahlenfolge soll 
immer aufsteigend sein, d.h. der Startwert muss kleiner als der Endwert sein. Ist dies nicht der Fall, soll ein leerer String 
werden.

### Aufgaben

1. Implementiere in der Klasse `Generator` die Methode `public String generateNumbers(int start, int end)`. 
   Diese Methode soll einen String mit der Zahlenfolge von `start` bis inklusive `end` erstellen. Die Zahlen sind mit einem `,` 
   zu trennen. Beachte, dass nach dem Trennzeichen kein Leerzeichen steht.

```
Beispiel: start = 10, end = 15
10,11,12,13,14,15
```

2. Implementiere in der Klasse `Generator` die Methode `public String generateNumbers(int start, int end, int steps, char delimiter)`. 
   In Ergänzung zu 1. soll eine beliebige Schrittweite sowie ein beliebiges Trennzeichen (statt `,`) verwendet werden können.