# Simpel

# Aufgabenverteilung

- Definition: Marcel Brockskothen
- Scanner: Janis Mohr
- Parser: Marius Meisenzahl
- Codeerzeugung: Mario Groneick
- Abstrakte Kellermaschine: Christian Walczak

# Generierung aus Grammatik

Automatische Generierung aus Grammatik mit Hilfe von [ANTLR v4](https://github.com/antlr/antlr4):

```bash
cd grammar && make
```

# Abstrakte Kellermaschine
- Registergröße: 8
Befehlssatz:
- ADD		Addition der obersten beiden Stack‐Elemente. Diese werden entfernt, und das Ergebnis wird auf den Stack gelegt.
- SUB		Subtraktion.
- MUL		Multiplikation.
- LOADN v  Lege Ganzzahlwert v auf den Stack.
- LOADD v  Lege Dezimalwert v auf den Stack.
- LOADS v  Lege String v auf den Stack.
- LABEL l  Setzt eine Sprungmarke
- GOTO l   Setze nach Sprungmarke an
- GOTOSTACK Setzte nach Sprungmarke vom Stacktop an
- GOTRUE falls Stacktop > 0
- GOFALSE falls Stacktop = 0
- POP nimmt Wert von Stack
- POP Ri nimmt Wert und speichert in Register
- MOVE Ri holt Wert vom Register in den Stack
