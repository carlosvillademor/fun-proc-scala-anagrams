import forcomp.Anagrams.Occurrences

object anagramstest {
  val listx = List(('a', 4), ('b', 1), ('c', 2))  //> listx  : List[(Char, Int)] = List((a,4), (b,1), (c,2))
  val listy = List(('a', 1), ('b', 1), ('d', 1))  //> listy  : List[(Char, Int)] = List((a,1), (b,1), (d,1))
  
  def subtract(x: Occurrences, y: Occurrences): Occurrences =
    
    
  subtract(listx, listy)                          //> subtract: (x: forcomp.Anagrams.Occurrences, y: forcomp.Anagrams.Occurrences)
                                                  //| forcomp.Anagrams.Occurrences
  
  ((((listx ++ (listy map (li => (li._1, -li._2)))) groupBy(x => x._1)) mapValues(_.map(_._2).sum) toList) filter (_._2 != 0)) sorted
                                                  //> res0: List[(Char, Int)] = List((a,3), (c,2), (d,-1))
  
}