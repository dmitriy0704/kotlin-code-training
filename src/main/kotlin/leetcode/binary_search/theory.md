## Теория бинарного поиска для решения задач на LeetCode (Kotlin)

Бинарный поиск — это базовый алгоритм, работающий за **O(log n)** на
отсортированных данных. В задачах LeetCode он встречается в разных обличьях: от
поиска элемента до поиска границ, в массивах с вращением, в матрицах и даже в
«поиске по ответу» (когда мы ищем минимальное/максимальное значение,
удовлетворяющее условию). Ниже — ключевые идеи и готовые шаблоны на Kotlin.

---

### 1. Классический бинарный поиск (точное совпадение)

Ищем индекс элемента `target` в отсортированном массиве. Если нет — возвращаем
`-1`.

```kotlin
fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex
    while (left <= right) {
        val mid = left + (right - left) / 2  // или (left + right) ushr 1
        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}
```

**Важно:** используй `left + (right - left) / 2` вместо `(left + right) / 2`,
чтобы избежать переполнения при больших `left` и `right` (в Kotlin можно
`(left + right) ushr 1` — беззнаковый сдвиг вправо, тоже безопасен).

---

### 2. Поиск левой/правой границы (lower_bound / upper_bound)

В задачах часто нужно найти **первое** или **последнее** вхождение элемента, или
место вставки.

**Левая граница** (первый индекс, где `nums[mid] >= target`):

```kotlin
fun lowerBound(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size // right открыт (не включительно)
    while (left < right) {
        val mid = left + (right - left) / 2
        if (nums[mid] >= target) right = mid
        else left = mid + 1
    }
    return left // может быть nums.size
}
```

**Правая граница** (первый индекс, где `nums[mid] > target`, т.е. последнее
вхождение + 1):

```kotlin
fun upperBound(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size
    while (left < right) {
        val mid = left + (right - left) / 2
        if (nums[mid] > target) right = mid
        else left = mid + 1
    }
    return left
}
```

**Шаблон с включительным правым** (для поиска первого/последнего) — тоже
работает, но нужно внимательно следить за инвариантом. В Kotlin удобнее
использовать полуинтервал `[0, size)`, потому что он согласуется с `indices` и
избегает путаницы с `-1`.

---

### 3. Поиск в массиве с вращением (rotated sorted array)

Примеры: `[4,5,6,7,0,1,2]`. Здесь бинарный поиск модифицируется: сначала
определяем, какая половина упорядочена.

```kotlin
fun searchRotated(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] == target) return mid
        if (nums[left] <= nums[mid]) { // левая половина отсортирована
            if (target in nums[left]..<nums[mid]) right = mid - 1
            else left = mid + 1
        } else { // правая половина отсортирована
            if (target in nums[mid] + 1..nums[right]) left = mid + 1
            else right = mid - 1
        }
    }
    return -1
}
```

При наличии дубликатов (задача 81) условие `nums[left] <= nums[mid]` может не
работать — тогда добавляем проверку на равенство и сдвигаем левую границу.

---

### 4. Поиск в двумерной матрице

Матрица отсортирована по строкам и столбцам (например, задача 74). Можно
представить матрицу как одномерный массив длины `m * n` и применить обычный
бинарный поиск, вычисляя `row = mid / n`, `col = mid % n`.

Или для матрицы, где каждая строка и столбец отсортированы (задача 240),
используется «ступенчатый» поиск, но часто и бинарный поиск по строкам + внутри
строки.

---

### 5. Поиск по ответу (binary search on answer)

Когда нужно найти минимальное или максимальное значение, удовлетворяющее
некоторому условию, и это условие монотонно. Пример: задачи на скорость поедания
бананов (Koko), на наименьший делитель, на минимизацию максимальной нагрузки и
т.д.

```kotlin
fun minMaxValue(possibleRange: IntRange, condition: (Int) -> Boolean): Int {
    var left = possibleRange.first
    var right = possibleRange.last
    while (left < right) {
        val mid = left + (right - left) / 2
        if (condition(mid)) right = mid   // ищем минимальное подходящее
        else left = mid + 1
    }
    return left
}
```

Здесь важно правильно определить монотонность: `condition(mid)` должно
возвращать `true` для всех значений >= искомого (если ищем минимум) или
наоборот.

---

### 6. Особенности реализации на Kotlin

- Используй `until` для полуинтервалов: `0 until nums.size`.
- Вместо `while (left <= right)` часто применяют `while (left < right)` — это
  стандартный шаблон для поиска границ.
- Для безопасного вычисления середины: `val mid = (left + right) ushr 1` (
  работает для неотрицательных int).
- Не забывай про `IntRange` и функции `first`/`last`.
- Для сравнения с целевым значением можно использовать `compareTo`, но чаще
  `when` или `if`.

---

### 7. Типичные ошибки и как их избежать

- **Бесконечный цикл** — когда `left = mid` (а не `mid + 1`) при `left < right`.
  Если оставляешь `left = mid`, то используй `mid = (left + right + 1) / 2` (
  округление вверх).
- **Инвариант** — чётко определи, что означает `left` и `right`:
    - Для `[left, right]` включительно: `left = mid+1`, `right = mid-1`, условие
      `while (left <= right)`.
    - Для `[left, right)` полуинтервал: `left = mid+1`, `right = mid`, условие
      `while (left < right)`.
- **Переполнение** — решается через `left + (right - left) / 2`.
- **Проверка выхода за границы** — особенно при доступе к `nums[mid]` в пустом
  массиве (обрабатывай отдельно).

---

### 8. Полезные стандартные функции Kotlin

- `binarySearch()` есть у `List` и `Array`, но она возвращает отрицательное
  значение для места вставки (похоже на `-insertionPoint - 1`). Она полезна для
  простых случаев, но в сложных задачах (границы, вращения) лучше писать свой
  код.

---

### 9. Рекомендация по отработке задач

На LeetCode начни с:

- **704. Binary Search** — классика.
- **35. Search Insert Position** — lower_bound.
- **34. Find First and Last Position** — обе границы.
- **33. Search in Rotated Sorted Array** — вращение.
- **153. Find Minimum in Rotated Sorted Array** — поиск минимума.
- **74. Search a 2D Matrix** — матрица как массив.
- **875. Koko Eating Bananas** — поиск по ответу.
- **410. Split Array Largest Sum** — сложный пример поиска по ответу.
