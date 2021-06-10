"""
Was dieses Programm macht:
    Quellcode für Klassen:
        - Spiel
        - Spieler
        - ...
    ...aus Plantuml-Datei lesen, in LaTeX umwandel, und zum clipboard kopieren
    

1 Klassen-Diagramm-Datei lesen
2 gesuchte Klassen finden
3 für jede Klasse
    3.1 Plantuml-Klasse zu LaTeX Klasse übersetzen
    3.2 zum Clipboard kopieren
4 Selbstständig entsprechenden Code in LaTeX datei ersetzen
"""

import os
import pyperclip

""" 
VARIABLES
"""
KLASSEN = [
    "Spiel",
    "Spieler"
]


dirname = os.path.dirname(__file__)
beamer_path = "..latex/beamer/beamer.tex"
diagram_path = "src/classes.wsd"

"""
FUNCTIONS
"""
def read_diagram_file() -> str:
    fullpath = os.path.join(dirname, diagram_path) # diagram path is only relative
    f = open(fullpath, "r")
    return f.read()
    pass

def get_class_string(class_name: str, diagram_file: str) -> str:
        # print(class_name)
        string = "class {}".format(class_name)
        start: int = diagram_file.find(string) # "class <NAME> {"
        end: int = diagram_file.find("}", start+len(string))+1 # first "}" after start
        # print(start,end)
        class_string = diagram_file[start:end]    
        return class_string

def find_diagram_classes() -> list:
    """
    return: list of dicts in form of:
        {
            name: "Spiel"
            attributes: [
                "-a: int",
                "-b: int"
            ]
            methods: [
                "-c(): void"
            ]
        }
    """
    _list = []

    diagram_file: str = read_diagram_file()

    for class_name in KLASSEN:
        class_string = get_class_string(class_name, diagram_file)
        # print(class_string)
        class_attributes = ""
        class_methods = ""
        found_method: bool = False

        for line in class_string.split("\n")[1:-1]:
            if not line == "":
                line = line.replace(" ", "")
                if line.__contains__("()"):
                    found_method = True
                if not found_method:
                    class_attributes += "\n"+"    "*4+line+"\\\\"
                elif found_method:
                    class_methods += "\n"+"    "*4+line+"\\\\"
                # print(line+"\\\\")
        # print(class_attributes)
        # print(class_methods)
        out = """\\begin{{frame}}
    \\frametitle{{{0}}}
    \\begin{{center}}		
        \\begin{{tikzpicture}}
            \\umlclass{{{1}}}{{{2}
            }}{{{3}
            }}
        \\end{{tikzpicture}}
    \\end{{center}}
\\end{{frame}}
"""
        out = out.format(
            class_name,
            class_name,
            class_attributes,
            class_methods
        )
        _list.append(out)
    
    return _list



"""
MAIN
"""
def main() -> None:
    # print(read_diagram_file())
    out = ""
    for line in find_diagram_classes():
        out += line+"\n"
    print(out)
    pyperclip.copy(out) # copy to clipboard
    pass

if __name__ == "__main__":
    main()


