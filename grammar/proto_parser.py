from antlr4 import *
from simpelLexer import simpelLexer
from simpelListener import simpelListener
from simpelParser import simpelParser
from antlr4.tree.Trees import Trees
import sys

def main():
    lexer = simpelLexer(FileStream(sys.argv[1]))
    stream = CommonTokenStream(lexer)
    parser = simpelParser(stream)
    tree = parser.expression()
    print(Trees.toStringTree(tree, None, parser))

if __name__ == '__main__':
    main()    

