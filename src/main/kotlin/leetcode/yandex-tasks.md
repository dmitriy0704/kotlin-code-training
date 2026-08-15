# Задачи Яндекса

Что мы рекомендуем сделать:

1. Освежить в памяти курс алгоритмов и структур данных (вспомнить основные
   структуры данных, их сильные и слабые стороны, особенности, базовые алгоритмы
   типа сортировок и обходов графов; не нужно ботать доказательство
   корректности, достаточно понимания как они работают)
2. Порешать задачки на литкоде, потренироваться доводить задачи до конца (чтобы
   решение проходило все тесты). Обязательно набить руку на easy (аккуратность),
   желательно попробовать medium (комбинация простых алгоритмов/структур
   данных), hard смотреть не обязательно (хардкорные алгоритмы)
3. (Опционально) потренироваться в придумывании тестов для собственного кода,
   попробовать самостоятельно придумывать краевые случаи, для которых может
   потребоваться реализации отдельной логики
4. Потренироваться находить баги в своем коде без компиляции/исполнения

Темы и ссылки, где можно подготовиться к алгоритмам:

## Arrays:

ссылка на тему: https://leetcode.com/problem-list/array

https://leetcode.com/problems/two-sum                                     + 1(e)
https://leetcode.com/problems/longest-common-prefix                      + 14(e)
https://leetcode.com/problems/remove-duplicates-from-sorted-array        + 26(e)
https://leetcode.com/problems/remove-element                             + 27(e)
https://leetcode.com/problems/search-insert-position/                    - 35(e)
https://leetcode.com/problems/container-with-most-water                  - 11(m)

Дополнительно:

https://leetcode.com/problems/single-number/ - решить за O(1) по памяти + 136(e)


---

## Prefix Sum:

ссылка на тему: https://leetcode.com/tag/prefix-sum/:

https://leetcode.com/problems/running-sum-of-1d-array               + 1480(easy)
https://leetcode.com/problems/range-sum-query-immutable              + 303(easy)
https://leetcode.com/problems/subarray-sum-equals-k                     + 560(m)
https://leetcode.com/problems/minimum-size-subarray-sum                 - 290(m)

Дополнительно:

**525. Contiguous Array** – найти максимальную длину подмассива с
равным количеством 0 и 1 (заменяем 0 на -1, ищем подмассив с суммой 0).
**LeetCode 974. Subarray Sums Divisible by K** – количество подмассивов,
сумма которых делится на K (используем остатки от деления).
**LeetCode 437. Path Sum III** (на дереве) – по сути, та же идея, но
применяется к путям в бинарном дереве.

---

## linked lists:

ссылка на тему: https://leetcode.com/problem-list/linked-list/
https://leetcode.com/problems/linked-list-cycle/ (Цикл, Fast & Slow) +141(e)
https://leetcode.com/problems/reverse-linked-list/   (Реверс)            +206(e)
https://leetcode.com/problems/add-two-numbers/ (Обход и симуляция)         -2(m)
https://leetcode.com/problems/merge-k-sorted-lists/                   - 23(hard)
Дополнительно:
(Слияние, Dummy Node)                                                     +21(e)
https://leetcode.com/problems/merge-two-sorted-lists/
(Удаление, Dummy Node)                                                  + 203(e)
https://leetcode.com/problems/remove-linked-list-elements/
(Поиск начала цикла)                                                     +142(m)
https://leetcode.com/problems/linked-list-cycle-ii/description/
(Два указателя, Dummy Node)                                              - 19(m)
https://leetcode.com/problems/remove-nth-node-from-end-of-list

234

82. Удаление дубликатов

---

## Binary Search:

ссылка на тему https://leetcode.com/problem-list/binary-search/

Поиск элемента в массиве
https://leetcode.com/problems/binary-search/                         + 704(easy)

https://leetcode.com/problems/guess-number-higher-or-lower/         + 374(easy)
https://leetcode.com/problems/search-a-2d-matrix/                   - 74(medium)
поворот массива:
Search in Rotated Sorted Array — вращение.
https://leetcode.com/problems/search-in-rotated-sorted-array/       + 33(medium)
Search in Rotated Sorted Array II — вращение.
https://leetcode.com/problems/search-in-rotated-sorted-array-ii/    - 81(medium)
Find Minimum in Rotated Sorted Array — поиск минимума.
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ + 153(medium)
Дополнительно:
Search Insert Position — lower_bound. Поиск позиции вставки:
https://leetcode.com/problems/search-insert-position/                    + 35(e)

34. Find First and Last Position — обе границы. - m
74. Search a 2D Matrix — матрица как массив. - m
875. Koko Eating Bananas — поиск по ответу. - m
410. Split Array Largest Sum — сложный пример поиска по ответу. - h
     34, 35 - поиск границ
     33, 153 - поиск в циклически сдвинутом массиве
     875, 410 - поиск по ответу

---

## hash table:

ссылка на тему: https://leetcode.com/problem-list/hash-table/

https://leetcode.com/problems/two-sum/                                 + 1(easy)
https://leetcode.com/problems/valid-anagram/                         + 242(easy)
https://leetcode.com/problems/group-anagrams/                       + 49(medium)
https://leetcode.com/problems/4sum/                                 - 18(medium)
https://leetcode.com/problems/find-all-anagrams-in-a-string/       - 438(medium)
---

## two pointers:

ссылка на тему: https://leetcode.com/problem-list/two-pointers/

https://leetcode.com/problems/container-with-most-water/            + 11(medium)
https://leetcode.com/problems/partition-labels/                    - 763(medium)

---

## Sorting:

ссылка на тему: https://leetcode.com/problem-list/sorting/

https://leetcode.com/problems/merge-intervals/                      - 56(medium)
---

## queue/stack:

https://leetcode.com/problems/valid-parentheses/                      + 20(easy)

## dfs/bfs:

https://leetcode.com/problems/number-of-islands/                   + 200(medium)
https://leetcode.com/problems/remove-invalid-parentheses/            - 301(hard)

## heap/hash:

https://leetcode.com/problems/top-k-frequent-words/                - 692(medium)
https://leetcode.com/problems/top-k-frequent-elements/             - 347(medium)

## sliding window:

ссылка на тему: https://leetcode.com/problem-list/sliding-window/

https://leetcode.com/problems/longest-repeating-character-replacement/  - 424(m)
https://leetcode.com/problems/sliding-window-median/                 - 480(hard)
https://leetcode.com/problems/sliding-window-maximum/                - 239(hard)

## tree:

https://leetcode.com/problems/same-tree/                             + 100(easy)
https://leetcode.com/problems/symmetric-tree/                        + 101(easy)
https://leetcode.com/problems/maximum-depth-of-binary-tree/   выбрать + 104(e)
https://leetcode.com/problems/balanced-binary-tree/                  + 110(easy)
https://leetcode.com/problems/path-sum-ii/                         - 113(medium)

## greedy problems:

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/       + 121(easy)
https://leetcode.com/problems/assign-cookies/                           - 455(e)
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/  - 122(medium)
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/ -
714(medium)
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/  -
309(m)

# Дополнительно: Алгоритмы, которые чаще всего бывают в задачках:

– сортировки (например, bubble sort или quicksort)
– разворот односвязного списка
https://leetcode.com/problems/reverse-linked-list/                   + 206(easy)
https://leetcode.com/problems/palindrome-linked-list/                - 234(easy)
https://leetcode.com/problems/reverse-linked-list-ii/               - 92(medium)
https://leetcode.com/problems/swap-nodes-in-pairs/                  - 24(medium)
https://leetcode.com/problems/reorder-list/                        - 143(medium)

– двусвязный список
https://leetcode.com/problems/lru-cache/                                - 146(m)

– разворот строки
https://leetcode.com/problems/reverse-string                         + 344(easy)
https://leetcode.com/problems/reverse-string-ii                      + 541(easy)
https://leetcode.com/problems/reverse-words-in-a-string-iii/         + 557(easy)
https://leetcode.com/problems/reverse-only-letters/                  + 917(easy)
https://leetcode.com/problems/reverse-words-in-a-string/           - 151(medium)

– обход дерева
DFS:
https://leetcode.com/problems/binary-tree-preorder-traversal/           - 144(e)
https://leetcode.com/problems/binary-tree-inorder-traversal/             - 94(e)
https://leetcode.com/problems/binary-tree-postorder-traversal/          - 145(e)

Поуровневый обход (BFS) и модификации
https://leetcode.com/problems/binary-tree-level-order-traversal         - 102(m)
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/ - 103(m)
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/ -
116(m)

Обход N-арных деревьев
https://leetcode.com/problems/n-ary-tree-level-order-traversal/         - 429(m)
https://leetcode.com/problems/n-ary-tree-preorder-traversal/            - 589(e)

----

# Мои:

## String

ссылка на тему: https://leetcode.com/problem-list/string/

## Задача с банкоматом на жадный алгоритм

## Задача на бинарный поиск 35

## Задачи на бинарное дерево:

https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree - 108(
e)
https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree  - 109(
m)
https://leetcode.com/problems/balanced-binary-tree                      - 110(e)
https://leetcode.com/problems/minimum-depth-of-binary-tree              - 111(e)
https://leetcode.com/problems/binary-tree-preorder-traversal            - 144(e)
https://leetcode.com/problems/invert-binary-tree                        - 226(e)
https://leetcode.com/problems/sum-of-left-leaves                        - 404(e)
https://leetcode.com/problems/validate-binary-search-tree                - 98(m)
https://leetcode.com/problems/flatten-binary-tree-to-linked-list        - 114(m)
https://leetcode.com/problems/sum-root-to-leaf-numbers                  - 129(m)
https://leetcode.com/problems/delete-node-in-a-bst            - выбрать - 450(m)
https://leetcode.com/problems/add-one-row-to-tree                       - 623(m)

