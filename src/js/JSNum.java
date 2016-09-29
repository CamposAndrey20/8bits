package eightBit.js;

public class JSNum extends JSAtom<Double>{
  final int max = 255;
   public JSNum(Double value){
      super(value);
      if(value > max)
        throw new RuntimeException("Error de semantica -> Un numero no puede ser mas grande que 255");
   }

}
