def ordenamiento_burbuja(array):

    for i in range(len(array) - 1):
        for j in range(len(array) - i - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]

    return array


array = [5, 2, 4, 1, 3]

array_ordenado = ordenamiento_burbuja(array)

print(array_ordenado)
