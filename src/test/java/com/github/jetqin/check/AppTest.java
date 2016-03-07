package com.github.jetqin.check;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

  @Test
  public void testAddMethod ( )
  {
    final int first = Integer.valueOf(5);
    final int second = Integer.valueOf(6);
    assertEquals(11, first + second);
  }

}
