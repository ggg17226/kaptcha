package com.google.code.kaptcha.text.impl;

import com.google.code.kaptcha.text.TextProducer;

import java.security.SecureRandom;

/** TextProducer Implementation that will return Chinese characters.. */
public class ChineseTextProducer implements TextProducer {
  private String[] simplifiedChineseTexts =
      new String[] {
        "彩色于是", "神的存在", "婆婆说呢", "多少库存", "疲劳程度", "却暗藏杀鸡", "柔柔弱弱", "点点滴滴", "滴滴答答", "仍然让人", "凄凄切切",
        "自作主张", "详细信息", "报备表吧"
      };

  /** @return random Chinese text */
  public String getText() {
    return simplifiedChineseTexts[new SecureRandom().nextInt(simplifiedChineseTexts.length)];
  }
}
