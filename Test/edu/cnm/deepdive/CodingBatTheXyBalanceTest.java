package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheXyBalanceTest {

  private String[] xYParams = {
      "aaxbby",
      "aaxbb",
      "yaaxbb",
      "yaaxbby",
      "xaxxbby",
      "xaxxbbyx",
      "xxbxy",
      "xxbx",
      "bbb",
      "bxbb",
      "bxyb",
      "xy",
      "y",
      "x",
      "",
      "yxyxyxyx",
      "yxyxyxyxy",
      "12xabxxydxyxyzz"
  };

  private boolean[] xYExpected = {true, false, false, true, true, false, true, false, true, false,
      true, true, true, false, true, false, true, true};

  @Test
  void xYTest() {
    for (int i = 0; i < xYParams.length; i++) {
      boolean actual = CodingBatTheXyBalance.xyBalance(xYParams[i]);
      Assertions.assertEquals(actual, xYExpected[i]);
    }
  }

}