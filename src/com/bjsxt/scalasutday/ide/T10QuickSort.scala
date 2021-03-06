package com.bjsxt.study

/**
  * Created by Albert on 2017/6/6.
  */
object T10QuickSort {
  def quickSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case List() => List()
      case head :: tail =>
        val (left, right) = tail.partition(_ < head)
        quickSort(left) ::: head :: quickSort(right)
    }
  }

  def main(args: Array[String]) {
    val list = List(3, 12, 43, 23, 7, 1, 2, 0)
    println(quickSort(list))
  }
}
