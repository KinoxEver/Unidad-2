def ordenamiento_insercion(array):

    for i in range(1, len(array)):
        valor_actual = array[i]
        j = i - 1
        while j >= 0 and array[j] > valor_actual:
            array[j + 1] = array[j]
            j -= 1
        array[j + 1] = valor_actual

    return array

array = [5, 2, 4, 1, 3]

array_ordenado = ordenamiento_insercion(array)

print(array_ordenado)

