#language: es
  #author: Edwin1538

Característica: Añadir productos al carrito
  Como usuario letcode.in
  Quiero poder añadir productos a mi carrito
  Para poder realizar mis compras.

  @inventario

  Escenario: Verificar el cargue de productos al carrito
    Dado que el usuario se encuentra en la pagina de productos
    Cuando seleccione un producto de los items disponibles
    Entonces se debe verificar que el carrito registre el item seleccionado