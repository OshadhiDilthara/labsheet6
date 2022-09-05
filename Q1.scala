object Q1 extends App{
     
     val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     val E = (character:Char, key:Int, alph:String) => alph((alph.indexOf(character.toUpper)+key)%alph.size)
     val D = (character:Char, key:Int, alph:String) => alph((alph.indexOf(character.toUpper)-key)%alph.size)


     val cipher = (algo:(Char,Int,String)=> Char, str:String, key:Int, alp:String)=>str.map(algo(_,key,alp))

     val encryption = cipher(E,"s",5,alphabet)
     println(encryption);
     val  decryption = cipher(D,encryption,5,alphabet)
     println(decryption)

  
}