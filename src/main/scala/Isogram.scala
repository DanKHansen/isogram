object Isogram:
   def isIsogram(s: String): Boolean = s.filter(_.isLetter).toLowerCase.length == s.filter(_.isLetter).toLowerCase.distinct.length
