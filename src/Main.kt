import java.text.DecimalFormat
import kotlin.random.Random


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 var lanzarMoneda=0
var sello =2
var cara  =1
  var caeMoneda:Int
  var contadorSello=0
  var contadorCara=0
  while (lanzarMoneda<=19){
   val caeMoneda= Random.nextInt(1,3)
    if(caeMoneda==sello){
      contadorSello++
      lanzarMoneda++


    }else {
      lanzarMoneda++
      contadorCara++

    }

  }
  println("cayo sello " + contadorSello)
  println("cayo cara " + contadorCara)
  }


