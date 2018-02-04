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

Befehlssatz:
- ADD		Addition der obersten beiden Stack‐Elemente. Diese werden entfernt, und das Ergebnis wird auf den Stack gelegt.
- SUB		Subtraktion.
- MUL		Multiplikation.
- LOADN v  Lege Ganzzahlwert v auf den Stack.
- LOADD v  Lege Dezimalwert v auf den Stack.
- LOADS v  Lege String v auf den Stack.
- ;  		Sequentielle Komposition
