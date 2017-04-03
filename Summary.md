## 1.[Two Sum](https://leetcode.com/problems/two-sum/#/description)
- 题目：给一个整型数组和一个目标数字，返回数组中两个数相加等于目标数字的下标，假设每个输入确切只有一种答案。
- 思路：最简单的O(n2)的做法就是，用类似冒泡的做法遍历数组，得到答案。但这是一个暴力的解决方法。
如果我们可以借用辅助空间，则有O(n)的做法，可以使用一个map来保存，对数组从头到尾遍历一遍，每次都计算目标数字减去当前数字的值，并去map中找，如果找到，就取出并把下标赋给一个返回值数组；反之没有找到，就把当前数字存入map中，用值做key，数组下标做value。

## 319.[Bulb Switcher](https://leetcode.com/problems/bulb-switcher/#/description)
- 题目：
- 思路：

## 371.[Sum of Two Integers]()
- 题目：
- 思路：

## 415.[Add Strings](https://leetcode.com/problems/add-strings/#/description)
- 题目：给两个字符串，只包含数字，没有前缀0。计算他们两个的和，不可以通过转换成整形来计算。
- 思路：将字符串转成字符数组，从末尾开始相加，并记录进位。每次使用StringBuilder来拼接，最后再反转字符串得到结果。
