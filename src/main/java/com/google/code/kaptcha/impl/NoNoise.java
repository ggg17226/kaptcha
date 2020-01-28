package com.google.code.kaptcha.impl;

import com.google.code.kaptcha.NoiseProducer;
import com.google.code.kaptcha.util.Configurable;

import java.awt.image.BufferedImage;

/**
 * Imlemention of NoiseProducer that does nothing.
 *
 * @author Yuxing Wang
 */
public class NoNoise extends Configurable implements NoiseProducer {
  /**
   * @param image the image to add the noise to
   * @param factorOne factorOne
   * @param factorTwo factorTwo
   * @param factorThree factorThree
   * @param factorFour factorFour
   */
  public void makeNoise(
      BufferedImage image, float factorOne, float factorTwo, float factorThree, float factorFour) {
    // Do nothing.
  }
}
