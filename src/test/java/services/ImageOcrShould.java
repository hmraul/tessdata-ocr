package services;

import org.junit.Test;

import java.io.File;

public class ImageOcrShould {

  ImageOcr imageOcr = new ImageOcr();

  @Test
  public void getWordsFromImage() {
    File imageFile = new File("src/test/resources/spammer.jpg");

    imageOcr.getWords(imageFile);
  }
}
