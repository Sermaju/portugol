/*
eq2g.alg
(c) Ant�nio Manso - 2-11-2005
Descri��o:
Programa que calcula as raizes de uma equa��o de 2� grau
*/
inicio
    // coeficientes do polin�mio  [ax^2 + bx + c = 0 ]
    real a , b , c
    escrever "introduza o valor de a :"
    ler a
    escrever "introduza o valor de b :"
    ler b
    escrever "introduza o valor de c :"
    ler c
    // equa��o do tipo [ bx + c = 0 ]
    se a = 0 entao
        escrever " n�o � uma equa��o de 2� grau"
    senao
        // calcular o delta => interior da raiz
        real delta
        delta <- b ^ 2 - 4 * a * c
        // n�o existem raizes  reais de n�meros negativos
        se delta < 0 entao
            escrever " n�o tem raizes reais"
        senao
            // -----------  raiz dupla  ----------------
            se delta = 0 entao
                real x1
                x1 <- -b / 2 * a
                escrever " raiz dupla : " , x1
            senao
                // - ---------- duas raizes ---------------
                real x1 , x2
                x1 <- ( -b + raiz ( delta ) ) / 2 * a
                x2 <- ( -b - raiz ( delta ) ) / 2 * a
                escrever " x1 : " , x1
                escrever " x2 : " , x2
            fimse//raiz dupla
        fimse// delta >0
    fimse// a <> 0
fim

