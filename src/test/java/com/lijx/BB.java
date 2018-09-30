package com.lijx;

import com.github.javafaker.Faker;
import java.util.Locale;

/**
 * Created by jxli on 2018/9/30.
 */
public class BB {

  public static void main(String[] args) {

    Faker faker = new Faker(Locale.CHINA);
    System.out.println(faker.address().city());

  }
}
