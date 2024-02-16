class Fraction:

    num = 1
    den = 1

    def __init__(self, n, d):

        self.num = n
        self.den = d

    def __add__(self, other):

        n = (self.num * other.den) + (self.den * other.num)
        d = self.den * other.den

        fr = Fraction(n, d)
        fr.simplificar()

        return fr

    def __sub__(self, other):

        n = (self.num * other.den) - (self.den * other.num)
        d = self.den * other.den

        fr = Fraction(n, d)
        fr.simplificar()
        
        return fr

    def __mul__(self, other):

        n = self.num * other.num
        d = self.den * other.den
        
        fr = Fraction(n, d)
        fr.simplificar()
        
        return fr
    
    def __truediv__(self, other):

        n = self.num * other.den
        d = self.den * other.num

        fr = Fraction(n, d)
        fr.simplificar()
        
        return fr

    def simplificar(self):

        neg = False

        if (self.num < 0):

            self.num *= -1
            neg = True

        i = ((self.num >= self.den) and self.num) or self.den
        
        while i > 1:

            if (self.num % i == 0) and (self.den % i == 0):

                self.num /= i
                self.den /= i

            i -= 1

        self.num = int(self.num)
        self.den = int(self.den)

        if neg:

            self.num *= -1

