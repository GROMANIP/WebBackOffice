@Navegar
Feature: Vamos a validar la mayoria de funcionalidades que tiene la Web del backoffice en el ambiente de desarrollo

    @AccesoBackOffice
    Scenario Outline: Ingresamos los accesos al backoffice
    Given navego a la pagina de www.backoffice.com    
    And ingresamos el <User>
    And ingresamos la <Clav>
    Then hacemos click en ingresar
    Examples:
        | User     | Clav     |
        | TCSIB001 | 123456@a |
    

    @Corresponsalfc
    Scenario Outline: Validar busqueda de corresponsales
    When navegamos y selecciono la opcion de <corres>
    And click en busqueda
    And click en filtrar
    And digitamos el punto <punto>
    Then seleccionamos la opcion buscar
    Examples:
        | corres         | punto |
        | Corresponsales | 4744  |


    @Usuariosfc
    Scenario Outline: Se valida busqueda de usuarios
    When selecciono la opcion de Corresponsales
    And click en la alternativa <agentes>
    And escribimos el nombre de <nombre>
    Then seleccionamos el usuario
    Examples:
         | agentes   | nombre |
         | Ususarios | 123    |

    @Terminalesfc
    Scenario Outline: Se valida busqueda de terminales y estado
    When click en el menu de corresponsales
    And click en la opcion <udid>
    And escribimos el codigo de <terminal>
    And seleccionamos el terminalfc
    Then comparamos el estado del terminal
    Examples:
         | udid       | terminal |
         | Terminales | 123      |

    @TerminalNuevo
    Scenario Outline: Se validad la creacion de un nuevos terminal y sus condiciones.
    Given click en la opcion nuevo dispositivo
    When ingresamos los valores del <dispositivo>
    Then selecionamos boton guardar
    And mostrarme la popup exitoso y cerrar
    Examples:
        | dispositivo                                            |
        | 51CCD75396D058C6,70f661d0b68a6e001212,samsung,SM-A166N |

    
    @Transaccionesbo
    Scenario Outline: Se valida la busqueda de operaciones de la nueva operacion Recargas
    Given seleccionamos la opcion Transacciones
    When click en filtros
    Then ingresamos los valores para <date>
    And ingresamos el numero de <codigo>
    And seleccionamos el estado en el desplegable
    And boton la opcion buscar
    And validamos si existe la nueva operacion
    Examples:
    |date      | codigo|
    |01092025  | 112   |

    @Extornosbo
    Scenario Outline: Se valida un extorno automatico
    Given nos encontramos en la pestaña solicitudes de extorno
    When seleccionamos la opcion filtros
    And ingresamos el rango de <fecha>
    And ingreso <codigo> de agente
    And seleccion en la opcion buscar
    Then validamos si existen registros de extornos solicitados
    And validamos si existe popup informativo
    Examples:
    |fecha      | codigo|
    |01012025   | 4541  |


        

