def ordenamiento_seleccion(array):

    for i in range(len(array) - 1):
        indice_menor = i
        for j in range(i + 1, len(array)):
            if array[j] < array[indice_menor]:
                indice_menor = j
        array[i], array[indice_menor] = array[indice_menor], array[i]

    return array


array = [5, 2, 4, 1, 3]

array_ordenado = ordenamiento_seleccion(array)

print(array_ordenado)
