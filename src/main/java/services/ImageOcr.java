package services;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ImageOcr {

  public String getWords(File imageFile) {
    ITesseract instance = new Tesseract();  // JNA Interface Mapping
    instance.setDatapath("/usr/share/tesseract-ocr");
    instance.setLanguage("spa");

    String result = "";
    try {
      result = instance.doOCR(imageFile);
      System.out.println(result);
    } catch (TesseractException e) {
      System.err.println(e.getMessage());
    }

    return result;
  }
}
