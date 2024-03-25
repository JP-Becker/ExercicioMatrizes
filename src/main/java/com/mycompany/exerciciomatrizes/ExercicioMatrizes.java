package com.mycompany.exerciciomatrizes;


public class ExercicioMatrizes {

    public static void main(String[] args) {
//         int [][]D = {
//            { 0, 100, 15, 0, 0, 0},
//            {100, 0, 40, 180, 200, 0},
//            { 15, 40, 0, 45, 90, 0},
//            { 0, 180, 45, 0, 0, 101},
//            { 0, 200, 90, 0, 0, 120},
//            { 0, 0, 0, 101, 120, 0}
//           };

            int [][]D = {
                {3, 4, 5},
                {8, 7, 9},
                {2, 6, 1},
                };
         
//           EXRCICIO A
//         int soma = 0;
//         int N = 3;
//         
//         for (int i = 0; i < N;i++) {
//              soma += D[i][0];
//         }
//         
//         System.out.println(soma);


//              EXERCICIO B
//            int soma = 0;
//            int N = 3;
//            
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    soma += D[i][j];
//                }
//            }
//            System.out.println(soma);


//              EXERCICIO C
//           int produto = 1;
//            int N = 3;
//            
//            for (int i = 0; i < N; i++) {
//                produto = produto * D[0][i];
//            }
//            System.out.println(produto);
            
//            EXERCICIO D
//            int soma = 0;
//            int N = 3;
//            
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    soma += D[i][j];
//                }
//            }
//            System.out.println(soma);

//            EXERCICIO E
//            int soma = 0;
//            int N = 3;
//            
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    soma += D[i][j];
//                }
//            }
//            int media = soma/9;
//            System.out.println(media);

//            EXERCICIO F
//            int soma = 0;
//            int N = 3, elemento = 0, media = 0;
//            
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    soma += D[i][j];       
//                }
//            }
//                media = soma/(N*N);
//                
//                for (int i = 0; i < N; i++) {
//                    for (int j = 0; j < N; j++) {
//                        elemento = D[i][j];
//                        
//                        if (elemento > media) {
//                            System.out.println(elemento);
//                        }
//                    }
//                }
//            }   

//                EXERCICIO G
            int N = 3;
            int maiorValor = Integer.MIN_VALUE;
            
            for (int i = 0; i < D.length; i++) {
                for (int j = 0; j < D[i].length; j++) {
                    if (maiorValor < D[i][j]) {
                        maiorValor = D[i][j];
                    }
                }       
                }
                System.out.println("maior valor: " + maiorValor);


//            EXERCICIO H
//            int N = 3;
//            int menorValor = Integer.MAX_VALUE;
//            
//            for (int i = 0; i < D.length; i++) {
//                for (int j = 0; j < D[i].length; j++) {
//                    if (menorValor > D[i][j]) {
//                        menorValor = D[i][j];
//                    }
//                }       
//                }
//                System.out.println("menor valor: " + menorValor);
            }           
    }

