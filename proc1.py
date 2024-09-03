

def es_par_o_impar(numero):
    """
    This function determines whether a given number is even or odd.

    Parameters:
    - numero (int): The number to be checked.

    Returns:
    - str: The string "Par" if the number is even, "Impar" if the number is odd.
    """
    if numero % 2 == 0:
        return "Par"
    else:
        return "Impar"

numero = int(input("Introduce un número: "))
resultado = es_par_o_impar(numero)
print(f"El número {numero} es {resultado}")

if __name__ == "__main__":
    es_par_o_impar