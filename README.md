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
antlr4 simple.g4 -o generated
```

# Abstrakte Kellermaschine

Befehlssatz:
- ADD		Addition der obersten beiden Stack‐Elemente. Diese werden entfernt, und das Ergebnis wird auf den Stack gelegt.
- SUB		Subtraktion.
- MUL		Multiplikation.
- LOAD v  Lege Wert v auf den Stack.
- ;  		Sequentielle Komposition