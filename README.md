# tessdata-ocr

It's a sample code for TessData-OCR library.

On linux, tesseracts (Tess4J wrapper for java) uses natives library of the SO. It's necessary to install tesseract:

    For ubuntu: sudo apt-get install tesseract-ocr

If you need some other languages, you can install them in the same way

    sudo apt-get install tesseract-ocr-spa


I have some troubles trying to configure TESSDATA_PREFIX on environment, so my workaround was to configure tessdata folder with the method setDataPath.