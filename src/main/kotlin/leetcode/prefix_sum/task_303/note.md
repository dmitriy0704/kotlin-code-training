# 303. Range Sum Query - Immutable

# Условие

Имея целочисленный массив nums, обработайте несколько запросов следующего типа:

Вычислите сумму элементов массива nums в диапазоне индексов от left до right
включительно, где left <= right.

Реализуйте класс NumArray:

- NumArray(int[] nums) Инициализирует объект массивом целых чисел nums.
- Функция `int sumRange(int left, int right)` возвращает сумму элементов массива
  `nums` в диапазоне от индексов `left` до `right` включительно (т. е.
  nums[left] + nums[left + 1] + ... + nums[right]).


Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 
