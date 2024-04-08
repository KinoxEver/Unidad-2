import random


def ordenamiento_aleatorio(array):

    for i in range(len(array)):
        indice_aleatorio = random.randint(0, len(array) - 1)
        array[i], array[indice_aleatorio] = array[indice_aleatorio], array[i]

    return array


array = [5, 2, 4, 1, 3]

array_ordenado = ordenamiento_aleatorio(array)

print(array_ordenado)
