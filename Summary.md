## 1.[Two Sum](https://leetcode.com/problems/two-sum/#/description)
- 题目：给一个整型数组和一个目标数字，返回数组中两个数相加等于目标数字的下标，假设每个输入确切只有一种答案。
- 思路：最简单的O(n2)的做法就是，用类似冒泡的做法遍历数组，得到答案。但这是一个暴力的解决方法。
如果我们可以借用辅助空间，则有O(n)的做法，可以使用一个map来保存，对数组从头到尾遍历一遍，每次都计算目标数字减去当前数字的值，并去map中找，如果找到，就取出并把下标赋给一个返回值数组；反之没有找到，就把当前数字存入map中，用值做key，数组下标做value。
- 代码：[示例代码](https://github.com/FranksZhang/leetcode/blob/master/src/com/zwf/TwoSum.java)

## 2.[Add Two Numbers](https://leetcode.com/problems/add-two-numbers/#/description)
- 题目：给你两个链表，链表结点值为非负数，求两个链表对应的各个结点之和。每个节点值小于10，大于则进位。
- 思路：构造一个结果链表，将链表1和链表2的值对应相加放入新链表中，用一个数来记录每次相加的结果，因为可能链表1或链表2已经遍历结束。还要记得最后要考虑有没有进位导致产生新节点的情况。
- 代码：[示例代码](https://github.com/FranksZhang/leetcode/blob/master/src/com/zwf/AddTwoNumbers.java)

## 319.[Bulb Switcher](https://leetcode.com/problems/bulb-switcher/#/description)
- 题目：有n盏灯，从1到n次开关灯，每次开关是i次的倍数的灯。求最后有几盏灯亮着。
- 思路：求到最后有多少盏灯亮着。我们可以推算出如果灯的编号i开方后不是整数，最后都是关的。所以题目就转换为求n之前（包括n）有多少个平方数。
- 代码：[示例代码](https://github.com/FranksZhang/leetcode/blob/master/src/com/zwf/BulbSwitcher.java)

## 371.[Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/#/description)
- 题目：计算两个整数和，但是不能使用`+`号和`-`号
- 思路：不能使用四则运算，那我们就只能使用位运算了。这里有个思路很有用，我们分析如何做十进制的加法。比如`5+17=22`这个怎么做。分三步，先只做各位相加不进位，此时相加结果为12；第二步做进位，5+7有进位，值为10；第三部就是把前面两个结果加起来，12+10等于22，即为结果。
> 我们分为三步走，先求两个数的异或（即不考虑进位的相加），再求两个数的与然后左移一位（即算出进位的数字），最后一步就是讲前两个的数相加（实现方式为重复前两步，直到不产生进位。）

- 代码：[示例代码](https://github.com/FranksZhang/leetcode/blob/master/src/com/zwf/SumOfTwoInteger.java)

## 415.[Add Strings](https://leetcode.com/problems/add-strings/#/description)
- 题目：给两个字符串，只包含数字，没有前缀0。计算他们两个的和，不可以通过转换成整形来计算。
- 思路：将字符串转成字符数组，从末尾开始相加，并记录进位。每次使用StringBuilder来拼接，最后再反转字符串得到结果。
- 代码：[示例代码](https://github.com/FranksZhang/leetcode/blob/master/src/com/zwf/AddStrings.java)
