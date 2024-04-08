class Nodo:

    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None

class Lista:

    def __init__(self):
        self.primero = None
        self.ultimo = None
        self.tamanio = 0

    def esta_vacia(self):
        return self.tamanio == 0

    def agregar_al_inicio(self, dato):
        nuevo = Nodo(dato)
        if self.esta_vacia():
            self.primero = self.ultimo = nuevo
        else:
            nuevo.siguiente = self.primero
            self.primero = nuevo
        self.tamanio += 1

    def agregar_al_final(self, dato):
        nuevo = Nodo(dato)
        if self.esta_vacia():
            self.primero = self.ultimo = nuevo
        else:
            self.ultimo.siguiente = nuevo
            self.ultimo = nuevo
        self.tamanio += 1

    def eliminar_al_inicio(self):
        if self.esta_vacia():
            print("La lista está vacía")
        elif self.tamanio == 1:
            self.primero = self.ultimo = None
            self.tamanio -= 1
        else:
            self.primero = self.primero.siguiente
            self.tamanio -= 1

    def eliminar_al_final(self):
        if self.esta_vacia():
            print("La lista está vacía")
        elif self.tamanio == 1:
            self.primero = self.ultimo = None
            self.tamanio -= 1
        else:
            actual = self.primero
            while actual.siguiente != self.ultimo:
                actual = actual.siguiente
            self.ultimo = actual
            actual.siguiente = None
            self.tamanio -= 1

    def mostrar_lista(self):
        if self.esta_vacia():
            print("La lista está vacía")
        else:
            mensaje = ""
            actual = self.primero
            while actual is not None:
                mensaje += str(actual.dato) + " "
                actual = actual.siguiente
            print(mensaje)

    def get_tamanio(self):
        return self.tamanio

lista = Lista()


lista.agregar_al_inicio(10)
lista.agregar_al_final(20)
lista.agregar_al_inicio(5)


lista.mostrar_lista() 

lista.eliminar_al_inicio()
lista.eliminar_al_final()


lista.mostrar_lista()

tamanio = lista.get_tamanio()
print("Tamaño de la lista:", tamanio) 
