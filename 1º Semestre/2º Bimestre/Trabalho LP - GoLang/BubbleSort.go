package main

import (
  "time"
	"fmt"
  "math/rand"
)

const TAM int = 30
var vetor [TAM]int


func geraVetor() {

  //var max int = 100
  //var min int = 90

  max, min := 100, 1

  rand.Seed(time.Now().UTC().UnixNano())

  for i:=0; i<TAM; i++ {
    num := rand.Intn(max - min) + min
    vetor[i] = num
  }

  /*for i:=0; i<TAM; i++ {
    fmt.Println(vetor[i])
  }*/

}

func bubbleSort() {
  pass, aux := 1, 0
  sorted := false

  for !sorted && pass < TAM {
    sorted = true
    for i := 0; i < TAM - pass; i++ {
      if vetor[i] > vetor[i+1] {
          aux = vetor[i]
          vetor[i] = vetor[i+1]
          vetor[i+1] = aux
          sorted = false
      }
    }
    pass++
  }

  //Imprime vetor ordenado
  for i:=0; i<TAM; i++ {
    fmt.Println(vetor[i])
  }
}

func main() {
  geraVetor()
  bubbleSort()
}
