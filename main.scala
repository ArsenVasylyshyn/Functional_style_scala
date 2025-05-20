object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    strings
      .filter(_.length > 3)   // Фильтруем строки: оставляем только те, у которых длина > 3
      .map(_.toUpperCase)     // Каждую строку преобразуем в верхний регистр
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}