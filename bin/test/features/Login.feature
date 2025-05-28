@Navegar
Feature: Creamos una regla para navegar libremente para todos los escenarios
    To see the subpages
    Without logging in
    I can click the navigation bar links

    #La regla tiene que ir junto a los escenarios
    Rule: regla para probar nuevo

        Background: navegamos al backoffice de financiera Confianza
            Given navego a la pagina de www.backoffice.com

        Scenario Outline: Ingresamos los accesos al backoffice    
            And ingresamos el <User>
            And ingresamos la <Clav>
            Then hacemos click en ingresar
            Examples:
            | User     | Clav     |
            | Tcsib001 | 123456@a |

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
        | Busqueda       | 0000  |
        | Filtros        | 0000  |

        

