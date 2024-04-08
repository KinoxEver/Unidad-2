def ordenamiento_shell(array):

    salto = len(array) // 2
    while salto > 0:
        for i in range(salto, len(array)):
            valor_actual = array[i]
            j = i
            while j >= salto and array[j - salto] > valor_actual:
                array[j] = array[j - salto]
                j -= salto
            array[j] = valor_actual
        salto //= 2

    return array


array = [5, 2, 4, 1, 3]

array_ordenado = ordenamiento_shell(array)

print(array_ordenado)
