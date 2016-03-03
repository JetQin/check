package com.github.jetqin.check;

import java.io.File;
import java.lang.annotation.Target;
import java.util.*;

import javax.annotation.Resource;

/**
 * Hello world!
 *
 */
@Deprecated
@Resource
public class App
{
  public static final String asssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss = "123";

  public String              nameConvertionParameter;

  public static void main (String[] args)
  {
    System.out.println("Hello World!");
  }

  @Deprecated
  @Resource
  public void test ( )
  {
    // int as ;

    int index = 5;
    while (index < 10)
      System.out.println("Hello");
    index++;

    String test = null;
    
    if(test.equals("asdf"))
    {
      
    }
    
    try{
      File s = new File("a");
    }
    catch(Exception ex)
    {
      
    }
  }

  /*
  * 
  */
  public void testApp ( )
  {
    int key = 2;
    switch (key)
    {
      case 2:
        System.out.println(2);
      case 3:
        ;
      case 4:
        System.out.println(4);
        break;

    }
  }
}
