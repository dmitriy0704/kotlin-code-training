## Хеш-таблицы в Kotlin для задач LeetCode

Хеш-таблица (HashMap, HashSet) — одна из самых частых структур данных в
алгоритмических задачах. В Kotlin она доступна через стандартные коллекции, и
правильное их использование часто позволяет снизить сложность с O(n²) до O(n).

---

### 1. Принцип работы

Хеш-таблица хранит пары «ключ → значение».

- **Ключ** преобразуется в индекс (хеш) с помощью функции `hashCode()`.
- По этому индексу элемент сохраняется во внутреннем массиве (корзине).
- При коллизиях (одинаковый хеш) элементы хранятся в связном списке или дереве (
  в Java 8+).

---

### 2. Сложность операций (в среднем)

| Операция          | Сложность |
|-------------------|-----------|
| Вставка (put)     | O(1)      |
| Поиск (get)       | O(1)      |
| Удаление (remove) | O(1)      |
| Проверка наличия  | O(1)      |

> В худшем случае (много коллизий) может быть O(n), но на практике это редко.

---

### 3. Стандартные реализации в Kotlin

| Класс                | Описание                                                                  |
|----------------------|---------------------------------------------------------------------------|
| `HashMap<K,V>`       | Базовая хеш-таблица. Не гарантирует порядок.                              |
| `LinkedHashMap<K,V>` | Сохраняет порядок вставки (или порядок доступа, если `accessOrder=true`). |
| `TreeMap<K,V>`       | Отсортирована по ключам (красно-чёрное дерево). Операции O(log n).        |
| `HashSet<E>`         | Множество на основе `HashMap`.                                            |
| `LinkedHashSet<E>`   | Упорядоченное множество.                                                  |
| `TreeSet<E>`         | Отсортированное множество.                                                |

**На LeetCode** чаще всего достаточно `HashMap` и `HashSet`.

---

### 4. Основные методы

Для `MutableMap<K, V>` (интерфейс, реализуемый `HashMap`):

```kotlin
val map = mutableMapOf<String, Int>()

map["key"] = 42          // вставка / обновление
val value = map["key"]   // получение (возвращает V? — null, если ключа нет)
map.remove("key")        // удаление
map.containsKey("key")   // проверка наличия ключа
map.containsValue(42)    // проверка наличия значения (O(n)!)

// Итерация
for ((k, v) in map) {
    ...
}
for (k in map.keys) {
    ...
}
for (v in map.values) {
    ...
}
```

Для `MutableSet<E>`:

```kotlin
val set = mutableSetOf<Int>()
set.add(5)          // добавление
set.contains(5)     // проверка
set.remove(5)       // удаление
```

---

### 5. Важные нюансы

#### 5.1. `hashCode()` и `equals()` для кастомных ключей

Если ключом является ваш собственный класс, **обязательно** переопределите
`hashCode()` и `equals()`, иначе два разных объекта с одинаковым содержимым
будут считаться разными ключами.

```kotlin
data class Point(
    val x: Int,
    val y: Int
)  // data class автоматически генерирует эти методы
```

Используйте `data class` для ключей, если это возможно.

#### 5.2. Неизменяемость ключей

Ключи **не должны изменяться** после вставки, иначе их хеш изменится, и вы не
сможете найти элемент. Используйте неизменяемые типы (`String`, `Int`,
`data class`).

#### 5.3. Null-безопасность

Kotlin различает nullable и non-null типы. `map["key"]` возвращает `V?`. Если
ключа нет, вернётся `null`. Используйте элвис-оператор:
`val v = map["key"] ?: 0`.

---

### 6. Типичные паттерны в задачах

#### 6.1. Подсчёт частот (Frequency Map)

```kotlin
val freq = mutableMapOf<Char, Int>()
for (c in str) {
    freq[c] = freq.getOrDefault(c, 0) + 1
}
// или короче:
val freq = str.groupingBy { it }.eachCount()  // возвращает Map<Char, Int>
```

#### 6.2. Проверка дубликатов

```kotlin
fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (n in nums) {
        if (!set.add(n)) return true
    }
    return false
}
```

#### 6.3. Two Sum

```kotlin
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for ((i, num) in nums.withIndex()) {
        val complement = target - num
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[num] = i
    }
    return intArrayOf()
}
```

#### 6.4. Группировка

```kotlin
val grouped = list.groupBy { it.length }  // Map<Int, List<String>>
```

#### 6.5. Поиск пересечений множеств

```kotlin
val setA = nums1.toSet()
val setB = nums2.toSet()
val intersection = setA.intersect(setB)  // возвращает Set
```

#### 6.6. Кэширование (Memoization)

Храните уже вычисленные результаты (например, в задачах DP с рекурсией).

#### 6.7. Проверка изоморфности строк, анаграмм и т.д.

Часто используются две хеш-таблицы для отображения символов.

---

### 7. Полезные функции Kotlin-расширений

- `toMap()`, `toMutableMap()`
- `associateBy { ... }` – создаёт карту из элементов по ключу
- `groupBy { ... }` – группировка в список
- `distinct()` – удаление дубликатов (внутри использует HashSet)
- `intersect()`, `union()`, `subtract()` для множеств
- `getOrDefault()`, `getOrElse()`

Пример:

```kotlin
val nums = listOf(1, 2, 3, 2, 1)
val frequencyMap = nums.groupingBy { it }.eachCount()
// {1=2, 2=2, 3=1}
```

---

### 8. Советы для LeetCode

- **Всегда оценивайте возможность использовать хеш-таблицу** вместо вложенных
  циклов.
- Если нужно сохранить порядок вставки — используйте `LinkedHashMap`.
- Если ключи должны быть отсортированы — `TreeMap` (но в большинстве задач это
  не требуется).
- Для множеств используйте `HashSet` — операции `add` и `contains` очень
  быстрые.
- Помните, что `HashMap` не синхронизирован, но в задачах это не важно.
- Если ключ – число, можно иногда использовать массив вместо хеш-таблицы (если
  диапазон мал) для ускорения.
- Не забывайте про `null`-значения: например, при получении значения используйте
  `?.` или `!!` только когда уверены.

---

### 9. Пример решения с хеш-таблицей

**Задача:** «Проверить, можно ли переставить буквы слова, чтобы получить
палиндром» (Valid Palindrome Permutation).

```kotlin
fun canPermutePalindrome(s: String): Boolean {
    val count = mutableMapOf<Char, Int>()
    for (ch in s) {
        count[ch] = count.getOrDefault(ch, 0) + 1
    }
    var odd = 0
    for (v in count.values) {
        if (v % 2 == 1) odd++
        if (odd > 1) return false
    }
    return true
}
```
