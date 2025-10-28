#language:es
  #author:OctavipGallo

  Característica: Realizar una multiplicacion
    como usuario
    quiero poder realizar una multiplicacion
  para poder probar la calculadora

  @multiplicacion

  Escenario: Verificar el resultado de la operacion
    Dado que el usuario se encuentra en la pagina de la calculadora
    Cuando ingrese los dos numero y presione el boton calculate
      | First number | Second Number | Operation |
      | 15           | 5             | Multiply  |
    Entonces la calculadora debe mostrar el resultado