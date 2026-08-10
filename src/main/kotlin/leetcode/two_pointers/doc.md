## Алгоритм Two Pointers (Два указателя)

**Two Pointers** — это популярная техника решения задач на массивах, строках и
связных списках. Идея в том, чтобы использовать два индекса (указателя), которые
движутся по структуре данных, как правило, с разной скоростью или с разных
концов, чтобы сократить время перебора до линейного \(O(n)\) вместо
квадратичного \(O(n^2)\).

### Основные варианты применения

1. **Два указателя с разных концов** (левый и правый)  
   Один начинает с начала (left), другой — с конца (right). Они движутся
   навстречу друг другу, пока не встретятся.
    - **Примеры задач**:
        - Проверка палиндрома в строке.
        - Поиск пары чисел с заданной суммой в **отсортированном** массиве.
        - Контейнер с наибольшей водой.

2. **Два указателя с одного конца** (быстрый и медленный)  
   Оба стартуют слева, но один движется быстрее (обычно на 1 шаг или больше).
    - **Примеры задач**:
        - Удаление дубликатов в отсортированном массиве.
        - Поиск цикла в связном списке (fast & slow).
        - Поиск среднего элемента списка.

3. **Скользящее окно** — часто рассматривают как частный случай двух указателей,
   где окно расширяется/сужается за счёт правого и левого указателей. (Но это
   отдельная техника.)

### Когда использовать Two Pointers?

- Массив или строка **отсортированы**.
- Нужно найти пару элементов, удовлетворяющих условию.
- Требуется обработать данные за один проход без дополнительной памяти \(O(1)\).
- Задача на сравнение символов или элементов с двух сторон.

### Сложность

- Время: **O(n)** (обычно один или два прохода).
- Память: **O(1)** (без учёта входных данных).

---

## Примеры на Kotlin

### 1. Два указателя с разных концов: Two Sum II (входной массив отсортирован)

Задача: найти два числа в отсортированном массиве, сумма которых равна `target`.
Вернуть их индексы (1-based).

```kotlin
fun twoSumSorted(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (left < right) {
        val sum = numbers[left] + numbers[right]
        when {
            sum == target -> return intArrayOf(left + 1, right + 1)
            sum < target -> left++   // нужно увеличить сумму
            else -> right--  // нужно уменьшить сумму
        }
    }
    return intArrayOf(-1, -1)
}
```

### 2. Проверка палиндрома (без учёта регистра и небуквенных символов)

```kotlin
fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.lastIndex
    while (left < right) {
        // пропускаем небуквенные символы
        while (left < right && !s[left].isLetterOrDigit()) left++
        while (left < right && !s[right].isLetterOrDigit()) right--
        if (s[left].lowercaseChar() != s[right].lowercaseChar()) return false
        left++
        right--
    }
    return true
}
```

### 3. Удаление дубликатов из отсортированного массива (два указателя с одного конца)

Задача: оставить только уникальные элементы, перезаписав начало массива, и
вернуть новую длину.

```kotlin
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    var slow = 0 // указывает на последний уникальный элемент
    for (fast in 1 until nums.size) {
        if (nums[fast] != nums[slow]) {
            slow++
            nums[slow] = nums[fast]
        }
    }
    return slow + 1
}
```

Здесь `slow` — медленный указатель, `fast` — быстрый. Когда находим новый
элемент, помещаем его на позицию `slow + 1`.

### 4. Быстрый и медленный указатели для поиска цикла в связном списке

```kotlin
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) return true
    }
    return false
}
```

---

## Совет для LeetCode

При решении задач на Kotlin:

- Используйте `lastIndex` для получения последнего индекса.
- Помните про `when` для компактных условий.
- Для строк полезны функции `isLetterOrDigit()`, `lowercaseChar()`.
- Обращайте внимание на крайние случаи (пустой массив, один элемент).

Практикуйтесь на задачах:

- [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-sorted/)
- [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
- [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
- [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
