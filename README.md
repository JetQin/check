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

### 错误处理
* 使用Exception代替错误码

❌错误的写法
```
public class DeviceController 
{ ...
public void sendShutDown() 
{
   DeviceHandle handle = getHandle(DEV1); // Check the state of the device
   if (handle != DeviceHandle.INVALID) 
   {
      // Save the device status to the record field retrieveDeviceRecord(handle);
      // If not suspended, shut down
      if (record.getStatus() != DEVICE_SUSPENDED) 
      {
          pauseDevice(handle); clearDeviceWorkQueue(handle); closeDevice(handle);
      }
      else
      {
        logger.log("Device suspended. Unable to shut down");
      }
    }
    else 
    {
      logger.log("Invalid handle for: " + DEV1.toString()); }
    }
...}
```

✅正确的写法

```
public class DeviceController
{ ...
  public void sendShutDown() 
  {
    try
    {
       tryToShutDown();
    } 
    catch (DeviceShutDownError e)
    {
      logger.log(e); 
    }
  }
  private void tryToShutDown() throws DeviceShutDownError 
  {
   DeviceHandle handle = getHandle(DEV1);
   DeviceRecord record = retrieveDeviceRecord(handle);
   pauseDevice(handle); 
   clearDeviceWorkQueue(handle); 
   closeDevice(handle);
  }
  private DeviceHandle getHandle(DeviceID id) 
  { 
  ...
    throw new DeviceShutDownError("Invalid handle for: " + id.toString());
  ... 
  }
  ... 
}
```

* 别返回null
* 别传递null
