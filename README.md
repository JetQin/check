## How to write clean code

### 有意义的命名
*  名副其实，避免出现代码中的魔鬼数字

| 错误的命名 ❌    | 正确的命名 ✅ |
| :------------- | :------------- |
| `int d`       | `int elapsedTime` |
| `if(x == 0)`       | `if(x == SUCCESS)` |

*  避免使用具有误导性的命名：
区分‘0’ 和‘O’ ,'1'和‘L’

| 错误的命名 ❌    | 正确的命名 ✅ |
| :------------- | :------------- |
| `O1, Ol`       | `int elapsedTime` |

*  做有意义的区分

❌错误的写法

```
public static void copyChars(char a1[], char a2[])
{   
    for (int i = 0; i < a1.length; i++)
    {
        a2[i] = a1[i];
    }
}

class DtaRcrd102
{
    private Date genymdhms;
    private Date modymdhms;
    private final String pszqint = "102"; /* ... */
};
```

✅正确的写法

```
public static void copyChars(char a1[], char a2[])
{
     for (int i = 0; i < a1.length; i++)
     {
         a2[i] = a1[i];
     }
}

class Customer
{
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
}
```

*  成员前缀：不必用前缀来标明成员变量，应该使成员变量足够小

❌错误的写法
```
public class Part
{
    private String m_dsc; // The textual description
    void setName(String name)
    {
        m_dsc = name;
    }
}
```
✅正确的写法
```
public class Part
{
    String description;
    void setDescription(String description)
    {
        this.description = description;
    }
}
```
* 类名使用名词或名词短语，方法名使用动词或动词短语

| 错误的命名 ❌    | 正确的命名 ✅ |
| :------------- | :------------- |
| `Manager,Processor`       | `Customer,WikiPage` |
| `HolyHandGrenade`       | `postPayment,deletePage` |
