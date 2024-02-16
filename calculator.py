from fraction import Fraction

operaciones = {

        "1": "+",
        "2": "-",
        "3": "*",
        "4": "//"

        }

print("""

    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir

    5. Simplificar
    6. Amplificar

    7. Fracción a mixto
    8. Mixto a fracción
    9. Fracción a decimal
    10. Decimal a fracción

      """)

desicion = int(input(">>"))

if 1 <= int(desicion) <= 4:
    
    fr_A = Fraction(int(input("Ingrese numerador (Fracción 1): ")), int(input("Ingrese denominador (Fracción 1): ")))

    fr_B = Fraction(int(input("Ingrese numerador (Fracción 2): ")), int(input("Ingrese denominador (Fracción 2): ")))

    fr_C = Fraction(1, 1)

    if desicion == 1:

        fr_C = fr_A + fr_B

    elif desicion == 2:

        fr_C = fr_A - fr_B

    elif desicion == 3:

        fr_C = fr_A * fr_B

    elif desicion == 4:

        fr_C = fr_A / fr_B

    print( 

          "\n",

          str(fr_A.num)+"/"+str(fr_A.den) +

          operaciones[str(desicion)] +

          str(fr_B.num)+"/"+str(fr_B.den) +

          " = "+

          str(fr_C.num)+"/"+str(fr_C.den)

          ) 

elif desicion == 5:

    fr_A = Fraction(int(input("Ingrese numerador: ")), int(input("Ingrese denominador: ")))
    fr_A.simplificar()
    print("\n")
    print(str(fr_A.num)+"/"+str(fr_A.den))
    print("\n")

elif desicion == 6:
    
    fr_A = Fraction(int(input("Ingrese numerador: ")), int(input("Ingrese denominador: ")))

    k = int(input("Ingrese el factor de amplificación: "))

    fr_A.num *= k
    fr_A.den *= k

    print("\n")
    print(str(fr_A.num)+"/"+str(fr_A.den))
    print("\n")

elif desicion == 7:

    fr_A = Fraction(int(input("Ingrese numerador: ")), int(input("Ingrese denominador: ")))
    
    print( str(int(fr_A.num/fr_A.den)) + "(" + str(fr_A.num % fr_A.den) + "/" + str(fr_A.den) + ")" )

elif desicion == 8:

    ent = int(input("Ingrese parte entera: "))
    fr_A = Fraction(int(input("Ingrese numerador (Parte fraccionaria): ")), int(input("Ingrese denominador (Parte fraccionaria): ")))
    
    fr_B = Fraction( (ent * fr_A.den) + fr_A.num, fr_A.den )

    print( str(fr_B.num) + "/" + str(fr_B.den) )

elif desicion == 9:

    fr_A = Fraction(int(input("Ingrese numerador: ")), int(input("Ingrese denominador: ")))

    print( fr_A.num / fr_A.den )

elif desicion == 10:

    dec = float(input("Ingrese un número decimal: "))

    l = len(str(dec).split('.')[1])

    fr_A = Fraction( dec * ( 10 ** l ), ( 10 ** l ) )
    fr_A.simplificar()

    print( str(fr_A.num) + "/" + str(fr_A.den) )



